
package parcial2;


public class Ejercicio35 {
    public static void main(String []args){
        int listNumbers[]= {5,4,2,4,7,4,2,4,5};
        sumNumbers(listNumbers);
    }
    public static void sumNumbers(int listNumbers[]){
        int size= listNumbers.length;
        int sum=0;
        for (int i = 1; i < size; i=i+2) {
            sum += listNumbers[i];
        }
        System.out.println(sum);
    }
}
