// NOTE: OUTPUT IS ZERO: fix that

// header file
#include<iostream>
// using these for easy string & output
using std::string;
using std::cout;

// main/parent class
class Shapes {
// public modifier: everything is private by default in C++
public:
// members/attributes
    float radius;
// only declaring static as it cannot be initilized in class
    static float PI;
};
// initilized the static variables
float Shapes::PI = 3.14;

// child class
class Circle : public Shapes {
public:
// Circle constructor using attributes from parent
    Circle(float radius) {
    }
// findArea method
    void findArea() {
        float area = (radius * radius) * PI;
        cout<<"The area of Circle: "<<area;
    }
};

int main() {
    // creating the object
    Circle circle(10);
    // calling the method of the object
    circle.findArea();
}
