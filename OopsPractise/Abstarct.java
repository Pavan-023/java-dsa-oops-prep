package OopsPractise;
abstract class Vehicle{
    abstract  void startEngine();
}
class Car extends Vehicle{
    void startEngine(){
        System.out.println("Car have 4 wheels");
    }
}
class Bike extends Vehicle {

    void startEngine(){
        System.out.println("Bike have 2 wheels");
    }
}

public class Abstarct {
    public static void main(String[] args) {
        Car c =new Car();
        c.startEngine();
        Bike b= new Bike();
        b.startEngine();
    }
}
