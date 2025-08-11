// The following is the example of Interface
public class Interface {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        vehicle1.speed(10);
    }
}

// Interface is like model to classes that implement it.
// Like Models, in Interface you can only declare method;
interface Vehicle {
    // variables are static final by default
    String MAKER = "Toyota";

    // can only declare method not define it - & abstract & public by default
    public void speed(int speed);

    public void milage(int milage);
}

// Implementing interface forces the class to use the methods of interface,
// 'Vehicle' akin to a requirenment.
class Car implements Vehicle {

    @Override
    public void speed(int speed) {
        System.out.println("Car speed is " + speed + "kmh.");
    }

    @Override
    public void milage(int milage) {
        System.out.println("Car milage is " + milage + "kg per km.");
    }

}
