package EsercizioEsame19;

/**
 * Created by Riccardo on 19/02/15.
 */
public class UsoScacchiera {
  public static void main(String[] args){
    Scacchiera sca = new Scacchiera(new int[]{1,2,3,4,5,6,7,8,9},new int[]{1,2,3,4,5,6,7,8,9});
    System.out.println(sca.spostaSu(9, ((short) -1)));
    System.out.println(sca.spostaSu(9, ((short) -1)));
    System.out.println(sca.spostaSx(9, ((short) -1)));
    System.out.println(sca.spostaGiu(9, ((short) -1)));
    System.out.println(sca.spostaDx(9, ((short) -1)));
    System.out.println(sca.spostaGiu(8, ((short) 1)));
    System.out.println(sca.spostaSx(8, ((short) 1)));
    System.out.println(sca.spostaSu(4, ((short) -1)));
    System.out.println(sca.spostaSu(4, ((short) -1)));
    System.out.println(sca);
  }
}
