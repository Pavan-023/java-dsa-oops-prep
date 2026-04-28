package OopsPractise;
class Emp{
    String name;
    int id;
    void setDetails(String name,int id){
        this.name=name;
        this.id=id;
    }
    void displayDetails(){
         System.out.println(name);
        System.out.println(id);
    }
}
class Manager extends Emp{
    void displayDetails(String name, int id){
        System.out.println(name);
        System.out.println(id);
    }
}
public class InherritanceEx {
    public static void main(String[] args) {
        Emp e= new Manager();
        e.setDetails("Kalyan", 052);
        Manager m=new Manager();
        m.displayDetails("pavan",5474);
    }
}
