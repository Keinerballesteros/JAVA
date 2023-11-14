
package parcial2;


public class Ejercicio4 {
    public static void main(String []args){
        String student1[] = {"Keiner","5.0","4.0","3.8","3"};
        String student2[] = {"Kaleth","4.0","2.5","4","4"};
        String student3[] = {"Kaner","3.5","4","2","3.5"};
        String student4[] = {"Marlon","4.2","3.5","3.9","4.2"};
        String matrizStudents[][]={student1,student2,student3,student4};
        averageScore(matrizStudents);
        double arrayScores[]= seventyPercent(matrizStudents);
        double arrayScoreExamen[]= thirtyPercent(matrizStudents);
        checkScore(arrayScores,arrayScoreExamen, matrizStudents);
    }
    public static void averageScore(String matrizStudents[][]){
        double sumScores=0;
        double average;
        int size = matrizStudents.length;
        for (int i = 0; i < size; i++) {
            double score = Double.parseDouble(matrizStudents[i][1]);
            sumScores += score; 
        }
        average = sumScores/size;
        System.out.println(average);
    }
    public static double[] seventyPercent(String matrizStudents[][]){
        int size = matrizStudents.length;
        double seventyPercent;
        double arrayScore[] = new double [size]; 
        for (int i = 0; i < size; i++) {
            double score1 = Double.parseDouble(matrizStudents[i][1]);
            double score2 = Double.parseDouble(matrizStudents[i][2]);
            double score3 = Double.parseDouble(matrizStudents[i][3]);
            seventyPercent = ((score1+score2+score3)/3)*0.7; 
            arrayScore[i] =seventyPercent;
        }
        for (int i = 0; i < size; i++) {
        System.out.println("El estudiante "+matrizStudents[i][0]+" tiene de 70% "+arrayScore[i]);
        }
        return arrayScore;
    }
    public static double[] thirtyPercent(String matrizStudents[][]){
        int size = matrizStudents.length;
        double thirtyPercent;
        double arrayScoreFinal[] = new double [size];
    for (int i = 0; i < size; i++) {
        double scoreFinal = Double.parseDouble(matrizStudents[i][4]);
        thirtyPercent = scoreFinal*0.3;
        arrayScoreFinal[i]= thirtyPercent;
    }
        for (int i = 0; i < size; i++) {
            System.out.println("El estudiante "+matrizStudents[i][0]+" tiene de 30% "+arrayScoreFinal[i]);
        }
        return arrayScoreFinal;
    }
    public static void checkScore(double arrayScoreExamen[], double arrayScore[], String matrizStudents[][]){
        double scoreFinal;
        int size = arrayScoreExamen.length;
        for (int i = 0; i < size; i++) {
            scoreFinal = arrayScore[i] + arrayScoreExamen[i];
            if(scoreFinal<3){
                System.out.println("El estudiante "+matrizStudents[i][0] +" desaprobo la mataria con una nota de: "+scoreFinal);
            }
            else{
                System.out.println("El estudiante "+matrizStudents[i][0] +" aprobo la mataria con una nota de: "+scoreFinal);
            }
        }
    }
    }

