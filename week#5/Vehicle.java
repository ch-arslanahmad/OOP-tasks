// This is a simple example of base class polymorphism, can also be called runtime polymorphism in which child method is the selected/overidded method during runtime.
// public class
public class Vehicle {

    // parent method
    void run() {
        System.out.print("Vehicle is running");
    }

    // main methid
    public static void main(String[] args) {
    // creating object of car in Vehicle class
        Vehicle car = new Car();
    // calling run overriden method
        car.run();
    }

}
// child class
class Car extends Vehicle {

    // overriden method
    @Override
    void run() {
        System.out.println("Car is running.");
    }
}