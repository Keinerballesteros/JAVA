
package parcial2;

public class EJERCICIO24 {
    public static void main(String []args){
        double listDonations[] = {5,3.5,4,2.7};
        sumDonations(listDonations);
        totalDonations(listDonations);
    }
    public static void sumDonations(double listDonations[]){
        double sum = 0;
        for(double donation:listDonations){
            sum += donation;
        }
        System.out.println("El total de donaciones es de: "+sum);
    }
    public static void totalDonations(double listDonations[]){
        int accountant=0;
        for(double donation:listDonations){
            accountant++;
        }
        System.out.println("Se hicieron "+accountant+" donaciones");
    }
}
