/**
 * 1) Definire una classe BracketObj per identificare un oggetto con un solo attributo immutabile che rappresenti una parentesi valida.
 *
 * Parentesi valide: '{', '}', '[', ']', '(', ')'
 *
 * 2) Fornire un'implementazione dell'interfaccia BracketValidator per verificare se l'array di parentesi passato in input
 * rappresenti una sequenza di parentesi bilanciate.
 *
 * Sequenza bilanciata: (([]))
 * Sequenza non bilanciata: ([)]
 *
 * 3) Fornire un esempio di test automatico per il metodo isValid.
 *
 * 4) Definire o rifattorizzare l'interfaccia BracketValidator in modo che il metodo isValid sia in grado di lavorare non solo con
 * oggetti di tipo BracketObj.
 */
import java.util.*;

class BracketObj{
    private final String value;
    
    public BracketObj(String value){
        if (!value.equals("(") && !value.equals(")") && !value.equals("[") &&
            !value.equals("]") && !value.equals("{") && !value.equals("}")) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}
interface BracketValidator<T>{
    public boolean isValid(T input);
}
class BracketValidatorImpl implements BracketValidator<BracketObj[]>{
    public boolean isValid(BracketObj[] bracketObjs){
        Stack<String> stack=new Stack<>();
        for(BracketObj bo: bracketObjs){
            String currentValue = bo.getValue();
            if(currentValue.equals("(") || currentValue.equals("[") || currentValue.equals("{")){
                stack.push(bo.getValue());
            }else if (currentValue.equals(")") || currentValue.equals("]") || currentValue.equals("}")) {
                if(stack.isEmpty()){
                    return false;
                }
                String open = stack.pop();
                if(currentValue.equals(")") && !open.equals("(")){ return false;}
                if(currentValue.equals("]") && !open.equals("[")){return false;}
                if(currentValue.equals("}") && !open.equals("{")){return false;}
            }else{
                return false;
            }
        
        }
        return true;
    }
}

public class Main{
    public static void main(String[] args){
        BracketValidator<BracketObj[]> bracketValidator = new BracketValidatorImpl();
        BracketObj[] brackets1 = {new BracketObj("("),new BracketObj("("),new BracketObj("["),
                                 new BracketObj("]"),new BracketObj(")"),new BracketObj(")") };
        BracketObj[] brackets2 = {new BracketObj("("),new BracketObj("["),new BracketObj(")"),
                                 new BracketObj("]") };
        BracketObj[] brackets3 = {new BracketObj("("),new BracketObj(")"),new BracketObj("["),
                                 new BracketObj("]") };
        boolean expected1 = true;
        boolean expected2 = false;
        boolean expected3 = true;
        boolean actual1 = bracketValidator.isValid(brackets1);
        boolean actual2 = bracketValidator.isValid(brackets2);
        boolean actual3 = bracketValidator.isValid(brackets3);
        if(expected1==actual1 && expected2==actual2 && expected3==actual3){
            System.out.println(actual1 +" "+actual2 + " " +actual3);
        }else{
            System.out.println("ERROR");
        }
    }
}
 