
package parcial2;
import java.util.Scanner;
public class EJERCICIO21 {
    public static final String LIST_VOCALS[] = {"a","e","i","o","u"};
    public static final String LIST_VOCALS2[] = {"A","E","I","O","U"};
    public static final String MATRIZ_VOCALS[][] = {LIST_VOCALS,LIST_VOCALS2};
    public static void main(String []args){
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese una letra:");
        String letter = read.nextLine();
        isVocal(letter);
    }
    public static void isVocal(String letter){
        boolean isVocal=true;
        for(String listVocals[]:MATRIZ_VOCALS){
        for(String vocals:listVocals){
               if(letter.equals(vocals)){
                    isVocal = true;
                    break;
                }
            }
            if(isVocal){
                break;
            }
        }
        if(isVocal){
            System.out.println("Is a vocal");
        }
        else{
                    System.out.println("Is not a vocal");
                
                }
            }
        }



