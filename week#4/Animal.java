// This program uses polymorphism and inheritance
// parent_class
class Animal {
    boolean alive;
// method of animal: run
    void run(String name) {
        System.out.println("The "+ name + " is running.");
    }
// method of animal: speak
    void speak() {
        System.out.println("Generic sounds");
    }

// main method
    public static void main(String[] args) {
    // create an instance/object of Dog with Animal class reference
        Animal dog = new Dog();
    // call run method of Animal Class that Dog inherited.
    dog.run("Dog");
    // call overriden speak method
    dog.speak();
    // Use super in method: had to use downcasting, which essentially temporarily makes you use the Dog class specific method in polymorphism. 
    ((Dog) dog).superWork();
    }    
}
// child_class
class Dog extends Animal{
    // method of dog: speak (overriding method)
    @Override void speak() {
        // use of super in method;
        System.out.println("Dog says: Woof Woof!");
    }
    
    void superWork() {
        super.run("Super");
        // use of super in class;
        super.alive = true;
        System.out.println("Alive: " + super.alive);
    }
}
