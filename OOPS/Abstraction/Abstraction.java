
abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car start With Key");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike start with Kick");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Bike b = new Bike();
        b.start();
    }
}
