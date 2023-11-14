
package parcial2;


public class EJERCICIO14 {
    public static void main(String []args){
        int listNumbers[] = {2,10,7,5,3,2,18};
        mayorNumber(listNumbers);
        menorNumber(listNumbers);
        isPar(listNumbers);
        isImpar(listNumbers);
        int sum = sum(listNumbers);
        System.out.println(sum);
        if(sum % 2 ==0){
            System.out.println("Es un numero par");
        }
        else{
            System.out.println("Es un numero impar");
        }
    }
    public static void mayorNumber(int listNumbers[]){
        int mayorNumber = listNumbers[0];
        for(int number:listNumbers){
            if(number>mayorNumber){
                mayorNumber = number;
            }
        }
         System.out.println(mayorNumber);
    }
    public static void menorNumber(int listNumbers[]){
        int menorNumber = listNumbers[0];
        for(int number:listNumbers){
            if(number<menorNumber){
                menorNumber = number;
            }
        }
         System.out.println(menorNumber);
    }
    public static void isPar(int listNumbers[]){
        int accountant=0;
        for(int number:listNumbers){
            if(number % 2 ==0 ){
                accountant++;
            }
        }
        System.out.println("Hay "+accountant+" numeros pares");
    }
    public static void isImpar(int listNumbers[]){
        int accountant=0;
        for(int number:listNumbers){
            if(number % 2 !=0 ){
                accountant++;
            }
        }
        System.out.println("Hay "+accountant+" numeros impares");
    }
    public static int sum(int listNumbers[]){
        int accumulator=0;
        for(int number:listNumbers){
            accumulator+=number;
        }
        return accumulator;
    }
}
