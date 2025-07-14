class Animal {
    
    void run(String name) {
        System.out.println("The "+ name + " is running.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
    dog.run("Dog");
    dog.speak();
    }    
}

class Dog extends Animal{
    void speak() {
        System.out.println("Woof Woof!");
    }
}
