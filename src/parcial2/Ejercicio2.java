package parcial2;

public class Ejercicio2 {
    public static void main(String []args){
        double patient1[]={72,1.80};
        double patient2[]={70,1.72};
        double patient3[]={80,1.75};
        double matrizPatients[][]={patient1,patient2,patient3};
        double[] imcCalculator = imc(matrizPatients);
        for(double imces:imcCalculator){
            System.out.println(imces);
        }
        mayorImc(imcCalculator);
    }
    public static double[] imc(double matrizPatients[][]){
        int size = matrizPatients.length;
         double imcCalculator[] = new double [size];
        for (int i = 0; i < size; i++) {
            double imc;
            imc = matrizPatients[i][0]/(matrizPatients[i][1]*matrizPatients[i][1]);
            imcCalculator[i]= imc;
        }
        return imcCalculator;
    }
   public static void mayorImc(double imcCalculator[]){
    int size = imcCalculator.length;
    double mayorImc = imcCalculator[0];
    for (int i = 0; i < size; i++) {
        if(imcCalculator[i] > mayorImc){
            mayorImc = imcCalculator[i];
        }
    }
    System.out.println("El mayor Imc calculado es: "+mayorImc);
}
}


