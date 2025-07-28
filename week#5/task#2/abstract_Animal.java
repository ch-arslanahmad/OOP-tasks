// The following code applies Abstraction: Abstract Classes
// main public class
public abstract class abstract_Animal {
    // abstract method: mandatory to be initilized in derived classes
    abstract void speak();

    // non-abstract method
    void sleep() {
        System.out.println("Sleeping...................");
    }


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
        
    }

}

class Dog extends abstract_Animal{

    void speak() {
        System.out.println("Bow bow.");
    }

    public static void main(String[] args) {
    }

}

class Cat extends abstract_Animal{
    void speak() {
        System.out.println("Meow meow.");
    }

}
