// parent_class
class Animal {
    boolean alive;
// method of animal: run
    void run(String name) {
        System.out.println("The "+ name + " is running.");
    }

// main method
    public static void main(String[] args) {
    // create an instance/object of Dog: dog
        Dog dog = new Dog();
    // call run method
    dog.run("Dog");
    // call speak method
    dog.speak();
    }    
}
// child_class
class Dog extends Animal{
    // method of dog: speak
    void speak() {
        // use of super in method;
        super.run("Super");
        // use of super in class;
        super.alive = true;
        System.out.println("Alive: " + super.alive);
        System.out.println("Dog says: Woof Woof!");
    }
}
