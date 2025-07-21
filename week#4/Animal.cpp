// Virtual functions are specifically used in runtime polymorphism as they target the object rather than the class that is referencing. If not used,  child class will not override. Hence virtual is used for this specific purpose. It makes it so

// final keyword: final simply stops a virtual function from overriding: hence this function cannot be overrided (rather will casue an error!)

// Library files
#include <iostream>
// uploading cout & string data-type
using std::cout;
using std::string;
// main (parent) class - the inherited
class Animal {
public:
    // function
    // virtual function is needed to do overriding
    virtual void run(){
        cout<<"Animal is running.\n";
    }
    // final used to stop overriding
    virtual void speak() final {
        cout<<"Generic Animal Signs";
    }
    
};
// child class (the inheritor)
class Dog: public Animal {
public:
    // overiding function
    void run() override{
        cout<<"Dog is running\n";
    }   
};

// main function
int main() {
// instance of Dog class
    Animal* dog = new Dog();
// print of the inherited function.
    dog->run();
    dog->speak();
}
