
package parcial2;

public class Ejercicio32 {
    public static void main(String []args){
        String listAnimals[]={"lion","cat","dog","tiger"};
        String listFoods[]={"pear","spaghetti","rice","burguer"};
        concatenar(listAnimals,listFoods);
    }
    public static void concatenar(String listAnimals[],String listFoods[]){
        int size = listAnimals.length;
        for (int i = 0; i < size; i++) {
            System.out.println(listAnimals[i]+" "+listFoods[i]);
        }
    }
}
