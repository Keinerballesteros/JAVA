
package parcial2;


public class EJERCICIO25 {
    public static void main(String[]args){
        String listNames[]={"Keiner","Kaner","Kaleth"};
        String listApellidos[] = {"Ballesteros","Morales","Acosta"};
        String listId[]={"102909237","1028972274","1098129372"};
        concatenar(listNames,listApellidos,listId);
    }
    public static void concatenar(String listNames[], String listApellidos[],String listId[]){
        for (int i = 0; i < 3; i++) {
            System.out.println(listNames[i]+" "+listApellidos[i]+" "+listId[i]);
        }
    }
}
