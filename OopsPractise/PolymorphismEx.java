package OopsPractise;
class Shapes{
    int l1,l2,l3;
    void size(){
        System.out.println("Length");
    }
}
class Rectangle extends Shapes{
    int b1;
    Rectangle(int l1, int b1) {
        this.l1 = l1;
        this.b1 = b1;
    }
    void size(){
        System.out.println(l1*b1);
    }
}
class Triangle extends Shapes{
        Triangle(int l1, int l2, int l3) {
        this.l1 = l1; // base
        this.l2 = l2; // height
        this.l3 = l3; // unused for now
    }

    void size(){
        System.out.println(l1*l2*l3);
    }
}
public class PolymorphismEx {
    public static void main(String[] args) {
        Shapes s=new Shapes();
        s.size();

        Shapes s1=new Rectangle(12,2);
        s1.size();

        Shapes s2= new Triangle(2,2,2);
        s2.size();
    }
}
