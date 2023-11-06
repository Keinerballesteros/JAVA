
package parcial2;


public class Ejercicio33 {
    public static void main(String []args){
        String listPartsTheHouse[] = {"bathroom","bedroom","kitchen","garden","garage"};
        saveNowMatriz(listPartsTheHouse);
    }
    public static void saveNowMatriz(String listPartsTheHouse[]){
        int size = listPartsTheHouse.length;
        String listNow[] = new String [size];
        for (int i = 0; i < size; i++) {
            listNow[i]= listPartsTheHouse[i];
        }
        for(String partsTheHouse:listNow){
            System.out.println(partsTheHouse);
        }
    }
}
