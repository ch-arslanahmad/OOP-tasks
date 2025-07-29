// ConstructorOverloading
// Constructor overloading is a feature of OOP available in Java. It allows multiple constructors to have same (variable) names but of different type, to distinguish themselves.
// fixed the casing, and applying encapsulation
class ConstructorOverloading {
// instance variables
    private int a;
    private int b;

// 1st constructor
    ConstructorOverloading(int a, int b) {
        this.a=a;
        this.b=b;
    }
    
// 2nd constructor, same as before just different data_type
    ConstructorOverloading(float a, float b) {
        // changing the values to 
        this.a=(int) a;
        this.b=(int) b;
    }
    
// sum method
    int sum() {
        return a+b;
    }
    
    public static void main(String[] args) {
        // creating objects
    
    // follows 1st contructor
        ConstructorOverloading integerCalculator = new ConstructorOverloading(1,2);
    // follows 2nd contructor
        ConstructorOverloading floatCalculator = new ConstructorOverloading(1f,2f);
        
        System.out.println(integerCalculator.sum());
        System.out.println(floatCalculator.sum());
        
    }
}
