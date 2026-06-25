/**
 * Definire la classe immutabile MyObject avente un unico attributo "value" di tipo String.
 * Fornire un metodo per accedere dall'esterno a value.
 *
 * Implementare l'interfaccia AnagramChecker. Esempio di anagrammi: TEATRO == ATTORE
 *
 * Fornire un esempio di test automatico per il metodo isAnagram.
 *
 * Definire o rifattorizzare l'interfaccia AnagramChecker in modo che il metodo isAnagram sia in grado di lavorare non solo con
 * oggetti di tipo MyObject.
*/

import java.util.*;

class MyObject{
    private final String value;
    
    public MyObject(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}

interface AnagramChecker<T>{
    public boolean isAnagram(T o1, T o2);
}

class AnagramCheckerImpl implements AnagramChecker<MyObject>{
    
    private boolean isAnagram(String s1, String s2){
        HashMap<Character, Integer> occorrenze=new HashMap<>();
        for(char c: s1.toCharArray()){
            if(occorrenze.containsKey(c)){
                occorrenze.put(c, occorrenze.get(c)+1);
            }else{
                occorrenze.put(c, 1);
            }
        }
        for(char c: s2.toCharArray()){
            if(occorrenze.containsKey(c)){
                occorrenze.put(c, occorrenze.get(c)-1);
            }else{
                return false;
            }
        }
        for(Character c: occorrenze.keySet()){
            if(occorrenze.get(c)!=0){
                return false;
            }
        }
        return true;
        
    }
    
    public boolean isAnagram(MyObject o1, MyObject o2){
        return isAnagram(o1.getValue(), o2.getValue());
    }
}

public class Main{
    public static void main(String[] args){
        AnagramChecker<MyObject> checker = new AnagramCheckerImpl();
        
        if (!checker.isAnagram(new MyObject("TEATRO"), new MyObject("ATTORE"))) {
            throw new RuntimeException("Test fallito");
        }
        
        System.out.println("Test superato");
    }
}

