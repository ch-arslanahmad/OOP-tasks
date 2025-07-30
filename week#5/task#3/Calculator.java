// runtime-polymorphism
// class
public class Calculator {

    // sum overloading methods

    // method#1
    public int sum(int a, int b) {
        return a+b;
    }

    // method#2
    public float sum(float a, float b) {
        return a+b;
    }

    // main method
    public static void main(String[] args) {
        // creating object
        Calculator calc = new Calculator();
        // calling methods
        System.out.println(calc.sum(1,1));
        System.out.println(calc.sum(1.1f,1.1f));
    }
}