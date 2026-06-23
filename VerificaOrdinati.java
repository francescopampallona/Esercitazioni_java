//Array 1: 123456. Array 2: 264153. Dimostrare se l’array è ordinato oppure no

public class Main{
    public static boolean isOrdered(int[] array){
        boolean decrescente = true;
        boolean crescente = true;
        
        for(int i=0; i<array.length-1;i++){
            if(array[i]>array[i+1]){
                crescente=false;
            }else if(array[i]<array[i+1]){
                decrescente = false;
            }
        }
        return crescente || decrescente;
    }
    
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {2,6,4,1,5,3};
        System.out.println(isOrdered(a1));
        System.out.println(isOrdered(a2));
    }
    
}