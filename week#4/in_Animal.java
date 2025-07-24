// main class: the parent(inheritor)
public class in_Animal {

    String name;

// inheritor method
    void run() {
        System.out.println(name +" is running.");
    }

    public static void main(String[] args) {
    // declaring object of the child classes
        in_Dog dog = new in_Dog("Dog");
        in_Cat cat = new in_Cat("Cat");
    // inherited methods of objects
        dog.run();
        dog.speak();

        cat.run();
        cat.speak();

    }
}
// child method
class in_Dog extends in_Animal {
    // constructor
    in_Dog(String name) {
        this.name = name;
    }
    // unique method
    void speak() {
        System.out.println("Bow Bow!!");
    }
}
// child method#2
class in_Cat extends in_Animal {
    // constructor
    in_Cat(String name) {
        this.name = name;
    }
    // unique method
    void speak() {
        System.out.println("Meow Meouw");
    }

}