
package parcial2;


public class Ejercicio8 {
    
    public static void main(String []args){
        String person1[] = {"Keiner","1091657442","18"};
        String person2[] = {"Camilo","1003674621","19"};
        String person3[] = {"Carlos","1013643221","19"};
        String matrizPerson[][] = {person1,person2,person3};
        averageAge(matrizPerson);
    }
    public static void averageAge(String matrizPerson[][]){
        int size = matrizPerson.length;
        int sumAge=0;
        int average;
        for (int i = 0; i < size; i++) {
            int age = Integer.parseInt(matrizPerson[i][2]);
            sumAge += age;
        }
        average = sumAge / size;
        System.out.println("El promedio de las edades es igual a: "+average);
    }
}
