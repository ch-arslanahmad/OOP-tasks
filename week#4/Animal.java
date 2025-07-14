/* Inheritance in Java is a mechanism where one (child) class can inherit fields and methods from another (parent) class.
 * In this example, we have a parent class `Animal` and a child class `Dog` that extends/inherits `Animal`.
 * The `Dog` class inherits the `run` method from `Animal` and has its own method `speak`.
 * The `main` method creates an object/instance of `Dog`, calls the `run` method from `Animal`, and the `speak` method from `Dog`.
*/
// parent_class
class Animal {
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
        System.out.println("Woof Woof!");
    }
}
