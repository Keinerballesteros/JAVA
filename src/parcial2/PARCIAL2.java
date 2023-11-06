
package parcial2;


public class PARCIAL2 {

public static final double salaryPerDay = 30000;   
public static final double SALARY_MINIMO = 1300000; 
    public static void main(String[] args) {
        String empleado1[] = {"Keiner","15"};
        String empleado2[] = {"Kaleth","18"};
        String matrizEmployes[][]={empleado1,empleado2};
        salary(matrizEmployes);
        int size = matrizEmployes.length;
        for (int i = 0; i < size; i++) {
            System.out.println("Al empleado "+matrizEmployes[i][0]+" recibira "+ matrizEmployes[i][1] +" de salario");
        }
        bonifitation(matrizEmployes);
        System.out.println("El nuevo salario de los empleados es de: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Al empleado "+matrizEmployes[i][0]+" recibira "+ matrizEmployes[i][1] +" de salario");
        }
    }
    public static String[][] salary(String matrizEmployes[][]){
        int size = matrizEmployes.length;
        double totalSalary;
            for (int i = 0; i < size; i++) {
            double days = Integer.parseInt(matrizEmployes[i][1]);
            totalSalary = days * salaryPerDay;
           String salary = String.valueOf(totalSalary);
            matrizEmployes[i][1]= salary;
        }
            return matrizEmployes;
    }
    public static String[][] bonifitation(String matrizEmployes[][]){
        int size = matrizEmployes.length;
        double salaryNow;
            for (int i = 0; i < size; i++) {
             double salary = Integer.parseInt(matrizEmployes[i][1]);
            if(salary<=SALARY_MINIMO){
               salaryNow  = salary*(salary*0.2);
               String nowSalary= String.valueOf(salaryNow);
               matrizEmployes[i][1] = nowSalary;
            }
            
            }
            return matrizEmployes;
    }
}
