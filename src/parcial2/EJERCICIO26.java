
package parcial2;
public class EJERCICIO26 {
    public static void main(String []args){
        int matrizNumbers[][] = new int [3][3];
        matrizNumbers[0][0] = 2;
        matrizNumbers[0][1] = 4;
        matrizNumbers[0][2] = 6;
        matrizNumbers[1][0] = 1;
        matrizNumbers[1][1] = 2;
        matrizNumbers[1][2] = 3;
        matrizNumbers[2][0] = 9;
        matrizNumbers[2][1] = 8;
        matrizNumbers[2][2] = 7;
        sum(matrizNumbers);
    }
    public static void sum(int matrizNumbers[][]){
        int sum = 0;
        for(int listNumbers[]:matrizNumbers){
            for(int number:listNumbers){
                sum+=number;
            }
        }
        System.out.println(sum);
    }
}
