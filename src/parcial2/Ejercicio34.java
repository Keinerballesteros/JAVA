
package parcial2;

import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args){
        String listColors[]={"Yellow","blue","black","white","red","purple"};
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese un color:");
        String color = read.nextLine();
        String listNowColors[]=theColorIsInTheList(listColors, color);
        for(String colors:listNowColors){
            System.out.println(colors);
        }
    }
    public static String[] theColorIsInTheList(String listColors[], String color){
        int size = listColors.length;
        for (int i = 0; i < size; i++) {
            if(color.equalsIgnoreCase(listColors[i])){
                listColors[i] = "green";
            }
            else{
                System.out.println("El color no esta en la lista");
            break;
            }
        }
       return listColors;
    }
}
