//Capire se una matrice è identità o no

public class Main{
    
    public static boolean isIdentity(int[][] matrix){
        //Verifico che sia una matrice quadrata
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i].length != matrix.length){return false;}
            
        }
        //Verifico che sia una matrice identità
        for(int i=0;i< matrix.length; i++){
            for(int j=0;j<matrix[i].length; j++){
                if(j==i){
                    if(matrix[i][j]!=1){
                        return false;
                    }
                }else{
                    if(matrix[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        int [][] m1 = {{1,3},{3,5}};
        int[][] m2=  {{1,0},{0,1}};
        int[][] m3=  {{1,0},{0,4}};
        System.out.println(isIdentity(m1));
        System.out.println(isIdentity(m2));
        System.out.println(isIdentity(m3));
    }
}