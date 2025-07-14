#include <iostream>
using std::cout;
using std::string;
class Animal {
public:
    void run(string name) {
        cout<<"The "<<name<<" is running.";
    }
};

class Dog: public Animal {
};


int main() {
    Dog dog;
    dog.run("Dog");
}
