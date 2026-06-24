import java.util.LinkedList;
import java.util.Queue;

class Tree<T> {

    class Nodo {
        T data;
        Nodo[] figli;
        int numeroFigli;

        @SuppressWarnings("unchecked")
        public Nodo(T data) {
            this.data = data;
            this.figli = new Tree.Nodo[n];
            this.numeroFigli = 0;
        }
    }

    Nodo root;
    int n;

    public Tree(int n) {
        this.n = n;
        this.root = null;
    }

    public void append(T data) {
        if (data == null) {
            return;
        }

        if (root == null) {
            root = new Nodo(data);
            return;
        }

        Queue<Nodo> coda = new LinkedList<>();
        coda.add(root);

        while (!coda.isEmpty()) {
            Nodo corrente = coda.poll();

            if (corrente.numeroFigli < n) {
                corrente.figli[corrente.numeroFigli] = new Nodo(data);
                corrente.numeroFigli++;
                return;
            }

            for (int i = 0; i < corrente.numeroFigli; i++) {
                coda.add(corrente.figli[i]);
            }
        }
    }
    
    public void printTree() {
    if (root == null) {
        System.out.println("Albero vuoto");
        return;
    }

    Queue<Nodo> coda = new LinkedList<>();
    coda.add(root);

    while (!coda.isEmpty()) {
        int nodiLivello = coda.size();

        for (int i = 0; i < nodiLivello; i++) {
            Nodo corrente = coda.poll();

            System.out.print(corrente.data + " ");

            for (int j = 0; j < corrente.numeroFigli; j++) {
                coda.add(corrente.figli[j]);
            }
        }

        System.out.println();
    }
    }
}

public class Main{
    public static void main(String[] args){
        Tree<Integer> tree = new Tree<>(3);
        tree.append(1);
        tree.append(2);
        tree.append(3);
        tree.append(4);
        tree.printTree();
        
    }
    
}