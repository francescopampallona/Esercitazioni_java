//Creare in Java una classe Arraystack con un vettore di 3 elementi contenente oggetti di una classe chiamata
// «punto» precedentemente creata
class Punto{
    float x;
    float y;
    float z;
    
    Punto(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
}

class Arraystack{
    Punto[] points;
    
    Arraystack(Punto p1, Punto p2, Punto p3){
       points  = new Punto[]{p1, p2, p3};
    }
}