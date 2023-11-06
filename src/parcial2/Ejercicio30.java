
package parcial2;


public class Ejercicio30 {
    public static void main(String []args){
        String partsTheBody[] = {"head","arms","face","feet"};
        print(partsTheBody);
    }
    public static void print(String partsTheBody[]){
        int size = partsTheBody.length;
        for (int i = 0; i < size; i++) {
            System.out.println(partsTheBody[size-i-1]);
            
        }
    }
}
