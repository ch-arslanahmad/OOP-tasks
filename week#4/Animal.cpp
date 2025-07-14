// Library files
#include <iostream>
// uploading cout & string data-type
using std::cout;
using std::string;
// main class
class Animal {

public:
    // function
    void run(string name) {
        cout<<"The "<<name<<" is running.";
    }
};
// child class
class Dog: public Animal {
};

// main function
int main() {
// instance of Dog class
    Dog dog;
// print of the inherited function.
    dog.run("Tommy");
}
