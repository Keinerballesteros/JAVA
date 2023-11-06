
package parcial2;
import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String []args){
        String listTallas[] ={"XS","S","M","L","XL"};
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese una talla");
        int talla = read.nextInt();
        valorNumerico(talla,listTallas);
    }
    public static void valorNumerico(int talla, String listTallas[]){
        if(talla>=0 && talla<=2){
            System.out.println(listTallas[0]);
        }
        else if(talla>=4 && talla<=6){
            System.out.println(listTallas[1]);
        }
        else if(talla>=8 && talla<=10){
            System.out.println(listTallas[2]);
        }
        else if(talla>=12 && talla<=14){
            System.out.println(listTallas[3]);
        }
        else if(talla>=16 && talla<=18){
            System.out.println(listTallas[4]);
        }
        else{
            System.out.println("Esa talla no la reconoce el sistema");
        }
    }
}
