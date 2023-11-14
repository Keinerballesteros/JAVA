
package parcial2;


public class EJERCICIO23 {
    public static void main(String []args){
        int listNumbers[] = {2,6,7,9,6,5,8};
        int size = listNumbers.length;
        sum(listNumbers,size);
    }
    public static void sum(int listNumbers[],int size){
        int sum;
        sum =listNumbers[0]+listNumbers[size/2]+listNumbers[size-1];
        System.out.println(sum);
    }
}
