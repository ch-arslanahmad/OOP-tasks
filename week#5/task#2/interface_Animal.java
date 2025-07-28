// this code uses interface, in interface every method is abstract, hence can only declared and not initilized, it is used alongside inheritance to be useful.
// e., animal can speak but what can it speak depends upon the animal dog speaks() bow bow while cat speak() meow.
public interface interface_Animal {
    void speak();

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
    }
    
}  


class Dog implements interface_Animal{

    public void speak() {
        System.out.println("Bow bow bow");
    }


}

class Cat implements interface_Animal {
    public void speak() {
        System.out.println("Meow");
    }
}
