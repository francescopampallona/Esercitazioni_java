//Array: «dog cat cat cow cow cow». Ricavare il numero di occorrenze per ogni elemento
import java.util.*;

public class Main{
    
    public static HashMap<String, Integer> occorenze(String[] strings){
        HashMap<String, Integer> occorrenze=new HashMap<>();
        for(String s: strings){
            if(occorrenze.containsKey(s)){
                occorrenze.put(s, occorrenze.get(s)+1);
            }else{
                occorrenze.put(s,1);
            }
        }
        return occorrenze;
    }
    
    public static void main(String[] args){
        String[] strings = {"dog", "cat", "cat", "cow", "cow", "cow"};
        System.out.println(occorenze(strings));
        
    }
}