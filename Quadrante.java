package EsercizioEsame19;

/**
 * Created by Riccardo on 19/02/15.
 */
public class Quadrante {

  private short colore;
  private boolean stato = true;
  private Pedina pedina;
  private int numPedina;

  public Quadrante(short colore) {
    this.colore = colore;
  }

  public void setPedina(int numPedina, short colorePedina) {
    this.numPedina = numPedina;
    this.pedina = new Pedina(colorePedina);
    this.stato = false;
  }

  public short getColorePedina() {
    if(pedina != null)
      return this.pedina.getColore();
    else
      return 0;
  }

  public int getNumPedina() {

    return numPedina;
  }

  public boolean getStato() {
    return stato;
  }

  public String toString() {
    String s = "";
    if (this.colore == 1) {
      if (this.stato) {
        s = s + "[  ]";
      } else {
        if (this.pedina.getColore() == 1) {
          s = s + "[" + this.numPedina + "B]";
        } else {
          s = s + "[" + this.numPedina + "N]";
        }
      }
    } else {
      if (this.stato) {
        s = s + "{  }";
      } else {
        if (this.pedina.getColore() == 1) {
          s = s + "{" + this.numPedina + "B}";
        } else {
          s = s + "{" + this.numPedina + "N}";
        }
      }
    }
    return s;
  }

  public void removePedina(){
    this.numPedina = -1;
    this.pedina = null;
    this.stato = true;
  }

  public Pedina getPedina() {
    return pedina;
  }

  public void insertPedina(Pedina pedina, int numPedina){
    this.pedina = pedina;
    this.numPedina = numPedina;
    this.stato = false;
  }
}
