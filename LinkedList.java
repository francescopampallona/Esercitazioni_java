//Ricreare ex-novo a livello logico una LinkedList (rami e foglie)
class LinkedList<T>{
    // Nodo della lista
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    // Primo elemento della lista
    private Node<T> head;

    // Inserimento in coda
    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Stampa della lista
    public void print() {
        Node<T> current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

}

public class Main{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        
        list.add("A");
        list.add("B");
        list.add("C");

        list.print();
    }
}