
package parcial2;


public class EJERCICIO11 {
    public static void main(String []args){
        String person1[] = {"Keiner","20000"};
        String person2[] = {"Kaleth","15000"};
        String person3[] = {"Kaner","10000"};
        String matrizPerson[][] = {person1,person2,person3};
        String matrizNowPerson[][] =descuento(matrizPerson);
        int size = matrizNowPerson.length;
        for (int i = 0; i < size; i++) {
            System.out.println("A "+matrizNowPerson[i][0]+" se le deberá pagar: "+matrizNowPerson[i][1]);
        }
    }
    public static String[][] descuento(String matrizPerson[][]){
        int size = matrizPerson.length;
        double descuento;
        String pago;
        for (int i = 0; i < size; i++) {
            double pay = Double.parseDouble(matrizPerson[i][1]);
            descuento = pay-(pay*0.02);
            pago = String.valueOf(descuento);
            matrizPerson[i][1]=pago;
        }
        return matrizPerson;
    }
}
