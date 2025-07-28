// Implement method overriding examples
// finding speed of a specific model using polymorphism
#include<iostream>
using std::string;
using std::cout;
using std::cin;

class Vehicle {
public:
    int speed;
    virtual void showSpeed() {
        cout<<"Vehice max speed depends on type, model & company.";
    }

};

class Car : public Vehicle {
public:
    Car(int speed) {
        this->speed = speed;
    }

    virtual void showSpeed() {
        cout<<"Car max speed is around "<<speed<<"kmh.\n";
    }

};

class Honda : public Car {
public:
    Honda(int speed) : Car(speed) {}
    virtual void showSpeed() {
        cout<<"Honda max speed is around "<<speed<<"kmh.";
    }    

};



int main() {
    Vehicle* car = new Car(200);
    car->showSpeed();
    Car* honda = new Honda(100);
    honda->showSpeed();

}