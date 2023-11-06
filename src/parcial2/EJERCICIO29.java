
package parcial2;


public class EJERCICIO29 {
    public static final int AGE_LEGAL = 18;
    public static void main(String []args){
        int listAges[] = {12,19,18,30,11,50};
        identificatorTheAges(listAges);
    }
    public static void identificatorTheAges(int listAges[]){
        int accountantMayor =0;
        int accountantMenor =0;
        for(int age:listAges){
            if(age>=AGE_LEGAL){
                accountantMayor++;
            }
            if(AGE_LEGAL>0 && age<AGE_LEGAL){
                accountantMenor++;
            }
        }
        System.out.println("Hay "+accountantMayor+" mayores de edad");
        System.out.println("Hay "+accountantMenor+" menores de edad");
    }
}
