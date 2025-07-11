// constructor_overloading
// Constructor overloading is a feature of OOP available in Java. It allows multiple constructors to have same (variable) names but of different type, to distinguish themselves.

class constructor_overloading {
// instance variables
    int a;
    int b;

// 1st constructor
    constructor_overloading(int a, int b) {
        this.a=a;
        this.b=b;
    }
    
// 2nd constructor, same as before just different data_type
    constructor_overloading(float a, float b) {
        // changing the values to 
        this.a=(int) a;
        this.b=(int) b;
    }
    
// sum method
    void sum() {
        System.out.print(a+b);
    }
    
    
    public static void main(String[] args) {
        // creating objects
    
    // follows 1st contructor
        constructor_overloading int_num = new constructor_overloading(1,2);
    // follows 2nd contructor

        constructor_overloading float_num = new constructor_overloading(1f,2f);
        
        int_num.sum();
        System.out.println();
        float_num.sum();
        
    }
}
