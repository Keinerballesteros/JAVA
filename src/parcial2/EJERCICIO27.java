
package parcial2;


public class EJERCICIO27 {
     public static void main(String []args){
         double matrizScores[][] = new double [2][3];
         matrizScores[0][0]=2.5;
         matrizScores[0][1]=3.2;
         matrizScores[0][2]=3.7;
         matrizScores[1][0]=4;
         matrizScores[1][1]=5;
         matrizScores[1][2]=3;
         average(matrizScores);
     }
     public static void average(double matrizScores[][]){
         double sum = 0;
         int accountant=0;
         double average;
         for (int i = 0; i < matrizScores.length; i++) {
             for (int j = 0; j < matrizScores[i].length; j++) {
                 sum += matrizScores[i][j];
                 accountant++;
             }
         }
         average = sum/accountant;
         System.out.println(average);
     }
}
