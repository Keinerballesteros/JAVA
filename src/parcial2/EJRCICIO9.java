
package parcial2;

import java.util.Scanner;

public class EJRCICIO9 {
    public static String DOLAR = "dolar";
    public static String EURO = "euro";
    public static double VALOR_DOLAR = 4000;
    public static double VALOR_EURO = 4500;
    public static void main(String []args){
        String moneda[] = new String [2];
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese la cantidad que quiere convertir: ");
        moneda[0] = read.nextLine();
        System.out.println("Ingrese el tipo de moneda del valor que acabo de ingresar: ");
        moneda[1] = read.nextLine();
        if (moneda[1].equalsIgnoreCase(DOLAR)){
            convertTheDolarAnPesos(moneda);
        }
        else if(moneda[1].equalsIgnoreCase(EURO)){
            convertTheEurosAnPesos(moneda);
        }
        else{
            System.out.println("El sistema no puedo convertir ese tipo de moneda"); 
        }
    }
    public static void convertTheDolarAnPesos(String moneda[]){
        double valueInPesos;
        double dolar = Integer.parseInt(moneda[0]);
        valueInPesos = dolar * VALOR_DOLAR;
        System.out.println(dolar+" dolares son "+valueInPesos+" pesos colombianos");
    }
    public static void convertTheEurosAnPesos(String moneda[]){
        double valueInPesos;
        double euro = Integer.parseInt(moneda[0]);
        valueInPesos = euro * VALOR_EURO;
        System.out.println(euro+" dolares son "+valueInPesos+" pesos colombianos");
    }
}
