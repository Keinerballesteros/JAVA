package parcial2;

public class Ejercicio31 {
    public static void main(String []args){
        int listNumbers[]={20,10,11,2};
        identifityNumber(listNumbers);
    }
    public static void identifityNumber(int listNumbers[]){
        for(int number:listNumbers){
            if(isPrime(number)){
                System.out.println(number + " es un número primo.");
                break;
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

