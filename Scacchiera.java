package EsercizioEsame19;

/**
 * Created by Riccardo on 19/02/15.
 */
public class Scacchiera {

  private final int SIZE = 5;
  private Quadrante[][] scacchiera = new Quadrante[SIZE][SIZE];

  public Scacchiera(int[] pedineBianche, int[] pedineNere){
    inizializzaScacchiera();
    inserimentoBianche(pedineBianche);
    inserimentoNere(pedineNere);
  }

  private void inizializzaScacchiera(){
    short startColore = 1;
    short colore = 1;
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        scacchiera[i][j] = new Quadrante(colore);
        if(colore == 1) {
          colore = -1;
        }else{
          colore = 1;
        }
      }
      if(startColore == 1){
        startColore = -1;
        colore = startColore;
      }else{
        startColore = 1;
        colore = startColore;
      }
    }
  }

  private void inserimentoBianche(int[] pedine){
    int row = 0;
    int col = 0;
    int indicePedina = 0;
    while (indicePedina < pedine.length){
      scacchiera[row][col].setPedina(pedine[indicePedina],(short)1);
      indicePedina++;
      col++;
      if(col%SIZE == 0){
        row++;
        col = 0;
      }
    }
  }

  private void inserimentoNere(int[] pedine){
    int row = SIZE -1;
    int col = SIZE -1;
    int indicePedina = 0;
    while(indicePedina < pedine.length) {
      scacchiera[row][col].setPedina(pedine[indicePedina], (short) -1);
      indicePedina++;
      col--;
      if(col == -1){
        col = SIZE-1;
        row--;
      }
    }
  }

  public String toString(){
    String s = "";
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        s = s + scacchiera[i][j].toString();
      }
      s = s + "\n";
    }
    return s;
  }

  public String spostaSu(int id, short s){
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if(!scacchiera[i][j].getStato() && id == scacchiera[i][j].getNumPedina() && s == scacchiera[i][j].getColorePedina()){
          try{
            if(scacchiera[i-1][j].getStato() | scacchiera[i-1][j].getColorePedina() != s){
              scacchiera[i-1][j].removePedina();
              scacchiera[i-1][j].insertPedina(scacchiera[i][j].getPedina(), scacchiera[i][j].getNumPedina());
              scacchiera[i][j].removePedina();
              return "Ok";
            } else if(scacchiera[i-1][j].getColorePedina() == s){
              return "Mossa non possibile colore uguale";
            }
          }catch(ArrayIndexOutOfBoundsException e){
            return "Mossa non possiblie raggiunti i limiti della scacchiera";
          }
        }
      }
    }
    return "Non trovata pedina";
  }
  public String spostaGiu(int id, short s){
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if(!scacchiera[i][j].getStato() && id == scacchiera[i][j].getNumPedina() && s == scacchiera[i][j].getColorePedina()){
          try{
            if(scacchiera[i+1][j].getStato() | scacchiera[i+1][j].getColorePedina() != s){
              scacchiera[i+1][j].removePedina();
              scacchiera[i+1][j].insertPedina(scacchiera[i][j].getPedina(), scacchiera[i][j].getNumPedina());
              scacchiera[i][j].removePedina();
              return "Ok";
            } else if(scacchiera[i+1][j].getColorePedina() == s){
              return "Mossa non possibile colore uguale";
            }
          }catch(ArrayIndexOutOfBoundsException e){
            return "Mossa non possiblie raggiunti i limiti della scacchiera";
          }
        }
      }
    }
    return "Non trovata pedina";
  }

  public String spostaDx(int id, short s){
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if(!scacchiera[i][j].getStato() && id == scacchiera[i][j].getNumPedina() && s == scacchiera[i][j].getColorePedina()){
          try{
            if(scacchiera[i][j+1].getStato() | scacchiera[i][j+1].getColorePedina() != s){
              scacchiera[i][j+1].removePedina();
              scacchiera[i][j+1].insertPedina(scacchiera[i][j].getPedina(), scacchiera[i][j].getNumPedina());
              scacchiera[i][j].removePedina();
              return "Ok";
            } else if(scacchiera[i][j+1].getColorePedina() == s){
              return "Mossa non possibile colore uguale";
            }
          }catch(ArrayIndexOutOfBoundsException e){
            return "Mossa non possiblie raggiunti i limiti della scacchiera";
          }
        }
      }
    }
    return "Non trovata pedina";
  }

  public String spostaSx(int id, short s){
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if(!scacchiera[i][j].getStato() && id == scacchiera[i][j].getNumPedina() && s == scacchiera[i][j].getColorePedina()){
          try{
            if(scacchiera[i][j-1].getStato() | scacchiera[i][j-1].getColorePedina() != s){
              scacchiera[i][j-1].removePedina();
              scacchiera[i][j-1].insertPedina(scacchiera[i][j].getPedina(), scacchiera[i][j].getNumPedina());
              scacchiera[i][j].removePedina();
              return "Ok";
            } else if(scacchiera[i][j-1].getColorePedina() == s){
              return "Mossa non possibile colore uguale";
            }
          }catch(ArrayIndexOutOfBoundsException e){
            return "Mossa non possiblie raggiunti i limiti della scacchiera";
          }
        }
      }
    }
    return "Non trovata pedina";
  }

}
