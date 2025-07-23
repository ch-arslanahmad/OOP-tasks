#include<iostream>
using std::string;
using std::cout;

class Shapes {
public:
    float radius;
    static float PI;

    float height;
    float width;


};

class Circle : Shapes {
    Circle(float radius): radius(radius) {}

    virtual void findArea() {
        float area = (radius * radius) * PI;
        cout<<"The area of Circle: "<<area;
    }
};

int main() {
    Shapes::PI = 3.14f;
    Shapes circle(10);
    circle.findArea();
}