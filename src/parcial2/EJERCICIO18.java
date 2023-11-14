
package parcial2;

import java.util.Scanner;
public class EJERCICIO18 {
    public static final String MONTHS[]={"December","November","October","September","August","July","June","May","April","March","February","January"};
    public static void main(String []args){
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese un mes:");
        String month = read.nextLine();
        monthsForDecember(month);
    }
    public static void monthsForDecember(String month){
        int size = MONTHS.length;
        for (int i = 0; i < size; i++) {
            if(month.equalsIgnoreCase(MONTHS[i])){
                System.out.println("Faltan "+i +" meses para diciembre");
            }
        }
    }
}
