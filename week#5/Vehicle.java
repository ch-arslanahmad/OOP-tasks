// Implement method overriding examples
// finding speed of a specific model using polymorphism
/* this program uses dynamic dispatch as its the necesscity of run-time polymorphism.
Dynamic Dispatch is a method in which the method that is to run in inheritance classes is decided in runtime.
This is achieved by creating a reference of object in a base class pointing to the child class. Enabling overriding via Java built-in virtual methods, that allows it to execute method not based on reference type rather where the object is i.e., child class, this is done during runtime, This is called runtime polymorphism.
 */
// public class
public class Vehicle {
    int speed;
    // parent method
    void showSpeed() {
        System.out.print("Speed of Vehicle depends on type & company.");
    }

    // main methid
    public static void main(String[] args) {
    // creating object of car in Vehicle class
        Vehicle car = new Car(100);
    // creating object of Honda in Car class
        Car honda = new Honda(70);
    // calling run overriden method
        car.showSpeed();
        honda.showSpeed();
    }

}
// child class
class Car extends Vehicle {

    Car(int speed){
        this.speed = speed;
    }

    // overriden method
    @Override
    void showSpeed() {
        System.out.println("Car max speed is around " + speed + "kmh.");
    }
}

class Honda extends Car {

    Honda(int speed) {
        super(speed);
    }

    // overriding the overridden method
    @Override
    void showSpeed() {
        System.out.println("Honda max speed is around " + speed + "kmh.");
    }
}