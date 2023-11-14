
package parcial2;

import java.util.Scanner;
public class EJERCICIO17 {
    public static final String LANGUAGES[] = {"Español","Ingles"};
    public static void main(String []args){
        Scanner read = new Scanner (System.in);
         System.out.println("Ingrese el idioma:");
        String language = read.nextLine();
        System.out.println("Ingrese el digito");
        int digit = read.nextInt();
       
        comprobarLenguaje(language,digit);
    }
    public static void comprobarLenguaje(String language, int digit){
        if(language.equalsIgnoreCase(LANGUAGES[0])){
            digitInSpanish(digit);
        }
        else if(language.equalsIgnoreCase(LANGUAGES[1])){
            digitInEnglish(digit);
        }
        else{
            System.out.println("El sistema no tiene ese idioma");
        }
    }
    public static void digitInSpanish(int digit){
        switch (digit){
            case 0:
                System.out.println("Cero");
            break;
            case 1:
                System.out.println("Uno");
            break;
            case 2:
                System.out.println("Dos");
            break;
            case 3:
                System.out.println("Tres");
            break;
            case 4:
                System.out.println("Cuatro");
            break;
            case 5:
                System.out.println("Cinco");
            break;
            case 6:
                System.out.println("Seis");
            break;
            case 7:
                System.out.println("Siete");
            break;
            case 8:
                System.out.println("Ocho");
            break;
            case 9:
                System.out.println("Nueve");
            break;
            default:
                System.out.println("El numero no es un digito");
                    
        }
    }
    public static void digitInEnglish(int digit){
        switch (digit){
            case 0:
                System.out.println("Zero");
            break;
            case 1:
                System.out.println("One");
            break;
            case 2:
                System.out.println("Two");
            break;
            case 3:
                System.out.println("Three");
            break;
            case 4:
                System.out.println("Four");
            break;
            case 5:
                System.out.println("Five");
            break;
            case 6:
                System.out.println("Six");
            break;
            case 7:
                System.out.println("Seven");
            break;
            case 8:
                System.out.println("Eight");
            break;
            case 9:
                System.out.println("Nine");
            break;
            default:
                System.out.println("The number not is a digit");
        }
    }
}
