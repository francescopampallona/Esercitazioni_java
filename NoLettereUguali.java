//«la casa è bella». Individuare le parole che non contengono lettere uguali
import java.util.*;

public class Main{
    
    public static boolean noLettereUguali(String parola){
        HashSet<Character> caratteri=new HashSet<>();
        for(char c: parola.toCharArray()){
           if(caratteri.add(c)==false){
               return false;
           }
        }
        return true;
    }
    
    public static List<String> filtraNoLettereUguali(String[] parole){
        List<String> res = new ArrayList<>();
        for(int i=0; i<parole.length; i++){
            if(noLettereUguali(parole[i])){
                res.add(parole[i]);
            }
        }
        return res;
    }
    
    public static void main(String[] args){
        String frase = "la casa è bella";
        String[] parole = frase.split(" ");
        System.out.println(Arrays.stream(parole).toList());
        List<String> filtered = filtraNoLettereUguali(parole);
        System.out.println(filtered);
    }
}