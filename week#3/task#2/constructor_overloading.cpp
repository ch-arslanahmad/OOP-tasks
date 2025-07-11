// constructor_overloading
// Constructor overloading is a feature of OOP available in C++. It allows multiple constructors to have same (variable) names but of different type, to distinguish themselves.

#include<iostream>
class constructor_overloading {
// set all the members to public since by-default they are private.
public:
// instance variables
    int a;
    int b;

// 1st constructor
    constructor_overloading(int a, int b) {
        this->a=a;
        this->b=b;
    }
    
// 2nd constructor, same as before just different data_type
    constructor_overloading(float a, float b) {
        // changing the values to integer. 
        this->a=(int) a;
        this->b=(int) b;
    }
    
// sum method
    void sum() {
        std::cout<<(a+b);
    }
};
int main() {
    
        // creating objects
    // follows 1st contructor
        constructor_overloading int_num(1,2);
    // follows 2nd contructor
        constructor_overloading float_num(1.1f,2.1f);
        
        int_num.sum();
        std::cout<<std::endl;
        float_num.sum();
        
    }
