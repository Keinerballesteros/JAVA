
package parcial2;

import java.util.Scanner;
public class EJERCICIO19 {
    public static final String STATIONS[]={"Primavera","Invierno","Otoño","Verano"};
    public static final String PRIMAVERA[] = {"Marzo","Abril","Mayo","Junio"};
    public static final String INVIERNO[] = {"Dicimebre","Enero","Febrero","Marzo"};
    public static final String OTOÑO[] = {"Septiembre","Octubre","Noviembre","Diciembre"};
    public static final String VERANO[] = {"Junio","Julio","Agosto","Septiembre"};
    public static void main(String []args){
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese una estación del año");
        String station = read.nextLine();
        months(station);
    }
    public static void months(String station){
        if(station.equalsIgnoreCase(STATIONS[0])){
            for(String month:PRIMAVERA){
                System.out.println(month);
            }
        }
        else if(station.equalsIgnoreCase(STATIONS[1])){
            for(String month:PRIMAVERA){
                System.out.println(month);
            }
        }
        else if(station.equalsIgnoreCase(STATIONS[2])){
            for(String month:OTOÑO){
                System.out.println(month);
            }
        }
        else if(station.equalsIgnoreCase(STATIONS[3])){
            for(String month:VERANO){
                System.out.println(month);
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
