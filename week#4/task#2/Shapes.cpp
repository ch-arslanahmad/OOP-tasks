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
    float width;
    float height;
//  UPDATED: declaring & initilizing static variable in class: only possible using constexpr
    constexpr static float PI = 3.14;
};

// child class
class Circle : public Shapes {
public:
// Circle constructor using attributes from parent
    Circle(float radius) {
        this->radius = radius;
    }
// findArea method
    void findArea() {
        float area = (radius * radius) * PI;
        cout<<"The area of Circle: "<<area<<"\n";
    }
};

class Rectangle : public Shapes {
public:

    Rectangle(float width, float height) {
        this->width = width;
        this->height = height;
    }

    void findArea() {
        float area = width * height;
        cout<<"The area of Rectangle: "<<area;
    }
};

int main() {
    // creating the object
    Circle circle(10);
    Rectangle rectangle(10, 10);
    // calling the method of the object
    circle.findArea();
    rectangle.findArea();
}
