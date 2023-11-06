
package parcial2;

import java.util.Scanner;
public class EJERCICIO28 {
    public static String wordsSpanish[]={"carro","hola","amarillo"};
    public static String wordsEnglish[]={"car","hello","yellow"};
    public static String wordsFrances[]={"chariot","salut","jaune"};
    public static String languages[] = {"español","ingles","frances"};
   public static void main(String []args){
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese una palabra:");
        String word = read.nextLine();
        System.out.println("En que idioma quiere traducirla");
        String language = read.nextLine();
        identificatorLanguage(language,word);
   }
   public static void identificatorLanguage(String language, String word){
              if(language.equalsIgnoreCase(languages[0])){
                  convertWordAnSpanish(word);
              }
              else if(language.equalsIgnoreCase(languages[1])){
                  convertWordAnEnglish(word);
              }
              else if(language.equalsIgnoreCase(languages[2])){
                  convertWordAnFrances(word);
              }
              else{
                  System.out.println("El sistema no tiene ese lenguaje");
              }
   }
   public static void convertWordAnSpanish(String word){
       int i = 0;
       for(String words:wordsEnglish){
       if(words.equalsIgnoreCase(word)){
           System.out.println(wordsSpanish[i]); 
       }
       i++;
           }
       i = 0;
       for(String words:wordsFrances){
       if(words.equalsIgnoreCase(word)){
           System.out.println(wordsSpanish[i]); 
       }
       i++;
   
   }
   }
   public static void convertWordAnEnglish(String word){
       int i = 0;
       for(String words:wordsSpanish){
       if(word.equalsIgnoreCase(words)){
           System.out.println(wordsEnglish[i]);  
       }
       i++;
           }
       i = 0;
       for(String words:wordsFrances){
       if(word.equalsIgnoreCase(words)){
           System.out.println(wordsEnglish[i]);
       }
       i++;

   }
   }
   public static void convertWordAnFrances(String word){
       int i = 0;
       for(String words:wordsEnglish){
       if(word.equalsIgnoreCase(words)){
           System.out.println(wordsFrances[i]);   
       }
       i++;
           }
       i = 0;
       for(String words:wordsSpanish){
       if(word.equalsIgnoreCase(words)){
           System.out.println(wordsFrances[i]); 
       }
       i++;
   
   }
   }
   

}
