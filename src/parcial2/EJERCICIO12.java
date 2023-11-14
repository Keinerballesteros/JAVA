
package parcial2;


public class EJERCICIO12 {
    public static final double SALARY_MINIMO = 1130000;
    public static void main(String[]args){
        String person1[] = {"Keiner","1350000"};
        String person2[] = {"Kaleth","1400000"};
        String person3[] = {"Kaner","1020000"};
        String matrizPersons[][] = {person1,person2,person3};
        salary(matrizPersons);
    }
    public static void salary(String matrizPersons[][]){
        int size = matrizPersons.length;
        int accountantOne = 0;
        int accountantTwo = 0;
        double salary;
        for (int i = 0; i < size; i++) {
            salary = Double.parseDouble(matrizPersons[i][1]);
            if(salary<SALARY_MINIMO){
                accountantOne++;
            }
            else{
                accountantTwo++;
            }
        }
        System.out.println(accountantOne+" personas seran contratadas y "+ accountantTwo+" no seran contratadas");
    }
}
