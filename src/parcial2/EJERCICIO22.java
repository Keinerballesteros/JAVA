
package parcial2;
import java.util.Scanner;
public class EJERCICIO22 {
    public static final String COLORS_PRYMARIES[] ={"Yellow","Blue","Red"};
    public static void main(String []args){
        Scanner read = new Scanner (System.in);
        System.out.println("Cuantos colores va a ingresar:");
        int size = read.nextInt();
        read.nextLine(); // consume the newline
        
        String listColors[] = new String [size];
        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un color");
            String color = read.nextLine();
            listColors[i]= color;
        }
        isColorPrymary(listColors);
    }
    public static void isColorPrymary(String listColors[]){
        for(String color : listColors){
            boolean isPrimary = false;
            for(String colorPrymary:COLORS_PRYMARIES){
                if(color.equalsIgnoreCase(colorPrymary)){
                    isPrimary = true;
                    break;
                }
            }
            if(isPrimary){
                System.out.println(color+" es un color primario");
            }
            else{
                System.out.println(color+" No es un color primario");
            }
        }
    }
}
