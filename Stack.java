//Ricreare ex-novo a livello logico lo Stack/Pila
class Stack<T>{
    class Node<T>{
        T data;
        Node<T> next;
        
        Node(T data){
            this.data = data;
        }
        
    }
    
    Node<T> top;
    
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(top!=null){
          newNode.next = top;
        }
        top = newNode;
    }
    public void remove(){
        top = top.next;
    }
    public void print(){
        Node<T> current=top;
        while(current!=null){
          System.out.print(current.data+"->");
          current=current.next;
        }
    System.out.println("null");
    }
}

public class Main{
    public static void main(String[] args){
        Stack<String> pila = new Stack<>();
        
        pila.add("CIAO");
        pila.add("NO");
        pila.add("SI");
        pila.print();
        pila.remove();
        pila.print();
    }
}