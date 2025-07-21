// Use `final` and `virtual` keywords for control
// parent_class
class Animal {
// method of animal: run
// there is no virtual keyword in java, all public methods are virtual by default: hence i will simply use final to stop overriding.
    final void run() {
        System.out.println("The animal is running.");
    }
// method of animal: speak
    void speak() {
        System.out.print("Generic sounds");
    }

// main method
    public static void main(String[] args) {
    // create an instance/object of Dog with Animal class reference
        Animal dog = new Dog();
    // call run method of Animal Class that Dog inherited.
    dog.run();
    // call overriden speak method
    dog.speak();
    }
}

// child_class
class Dog extends Animal{
    // method of dog: speak (overriding method)
    @Override void speak() {
        System.out.print("Dog says: Woof Woof!");
    }
}
