
// So basically a class that has benefits of both Interface and normal Class:
// 1. You can initilize methods that apply to itself & derived classes.
// 2. You can (only) make abstract methods that essentially become requirenment/model for derived classes
public class Abstract {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        // derived class inherits the method of abstract class
        animal1.getStatus(true);
    }
}

// Abstract classes are classes which can have abstract methods and also other
// type of methods..
abstract class Animal {

    // normal method
    boolean getStatus(boolean isAlive) {
        return isAlive;
    }

    // abstract (model) methods—initialized/defined or overridden by derived classes
    public abstract void speed(int speed);

    public abstract void age(int age);
}

class Dog extends Animal {

    // derived class overrides the parent abstract methods
    @Override
    public void speed(int speed) {
        System.out.println("Dog speed is " + speed);
    }

    @Override
    public void age(int age) {
        System.out.println("Dog age is " + age);
    }

}