
package parcial2;


public class Ejercicio3 {
    
    public static void main(String []args){
        String student1[]= {"Keiner","5","5","5","5"};
        String student2[]= {"Kaleth","4.5","4","3.8","2"};
        String student3[]= {"Kaner","3.8","2.9","3.2","4"};
        String matrizStudents[][]={student1,student2,student3};
        average(matrizStudents);
    }
    public static void average(String matrizStudents[][]){
        int size = matrizStudents.length;
        double nota1, nota2, nota3, examen, notaFinal, average, sumNotas=0;
        for (int i = 0; i < size; i++) {
            
            nota1 = Double.parseDouble(matrizStudents[i][1]);
            nota2 = Double.parseDouble(matrizStudents[i][2]);
            nota3 = Double.parseDouble(matrizStudents[i][3]);
            examen = Double.parseDouble(matrizStudents[i][4]);
            notaFinal = (((nota1+nota2+nota3)/3)*0.7)+examen*0.3;
            sumNotas += notaFinal;
        }
        average = sumNotas/size;
        System.out.println("El promedio de las notas es: "+average);
    }
}
