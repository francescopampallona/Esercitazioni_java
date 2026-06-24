//Fare una classe di nome «employed» che abbia come unico attributo un’intero e fornire un’implementazione delle classi «manager» ed «employed administrator»
class Employed{
    private Integer id;
    
    public Employed(Integer id){
        this.id = id;
    }
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
}

class Manager extends Employed{
    
    public Manager(Integer id){
        super(id);
    }
}

class EmployedAdministrator extends Employed{
    
    public EmployedAdministrator(Integer id){
        super(id);
    }
}

public class Main{
    public static void main(String[] args){
        Employed e = new Manager(2);
        System.out.println(e.getId());
    }
}