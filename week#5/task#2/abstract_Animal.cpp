// C++ uses abstract functions using pure virtual methods as it does not have `abstract` keyword.
// to simulate interface: you make a class where you only use abstract functions.
#include<iostream>
using namespace std;

class Animal {
// this is a pure virtual method
    virtual void speak() = 0;
    
};

class Dog : public Animal {
public:
    void speak() {
        cout<<"Bow bow bow"<<endl;
    }
};

class Cat : public Animal {
public:
    void speak() {
        cout<<"Meow meow"<<endl;
    }
};


int main() {
    Dog dog;
    dog.speak();

}
