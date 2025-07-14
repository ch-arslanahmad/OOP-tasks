class Animal {
    
    void run(String name) {
        System.out.print("The"+ name + "is running");
    }


    boolean Alive;

    public static void main(String[] args) {
        Dog dog = new Dog();
    dog.run("Dog");
    dog.speak();
    }    
}

class Dog{
    void speak() {
        System.out.print("Woof Woof");
    }

}
