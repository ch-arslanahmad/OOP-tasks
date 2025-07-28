// Implement method overriding examples
// finding speed of a specific model using polymorphism
// Dynamic dispatch in C++ is done by vTables, This is achieved by creating a reference of object in a base class pointing to the child class. Enabling overriding via C++ by virtual methods (using virtual keyword), that allows it to execute method not based on reference type rather where the object is i.e., child class, this is done during runtime, This is called runtime polymorphism.

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

     void showSpeed() override{
        cout<<"Car max speed is around "<<speed<<"kmh.\n";
    }

};

class Honda : public Car {
public:
    Honda(int speed) : Car(speed) {}
    void showSpeed() override {
        cout<<"Honda max speed is around "<<speed<<"kmh.";
    }    

};



int main() {
    Vehicle* car = new Car(200);
    car->showSpeed();
    Car* honda = new Honda(100);
    honda->showSpeed();

}