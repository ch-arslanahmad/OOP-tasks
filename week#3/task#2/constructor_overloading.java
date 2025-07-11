// constructor_overloading
// Constructor overloading is a feature of OOP available in Java. It allows multiple constructors to have same (variable) names but of different type, to distinguish themselves.

class constructor_overloading {
// instance variables
    int a;
    int b;

// 1st constructor
    Testing(int a, int b) {
        this.a=a;
        this.b=b;
    }
    
// 2nd constructor, same as before just different data_type
    Testing(float a, float b) {
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
        Testing int_num = new Testing(1,2);
    // follows 2nd contructor

        Testing float_num = new Testing(1f,2f);
        
        int_num.sum();
        System.out.println();
        float_num.sum();
        
    }
}
