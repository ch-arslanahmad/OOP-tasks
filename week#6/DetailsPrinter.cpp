// for input/output
#include<iostream>
// for file I/O handling
#include<fstream>
// namespace for simple string, input, output
using namespace std;

// main class
class DetailsPrinter {
// private modifier
private:
    string name;
    int age;
// public modifier
public:

    // name getter
    string getName() {
        cout<<"Enter your name: ";
        cin>>name;
        return name;
    }
    // age getter
    int getAge() {
        cout<<"Enter your age: ";
        cin>>age;
        return age;
    }

    // write in file method
    void writeFile() {
        // creating filewriter class
        ofstream fileWriter("details.txt");
        // writing in file
        fileWriter << "Name, "<< name << endl;
        fileWriter << "Age, " << age << endl;
        // closing file writing
        fileWriter.close();
    }

    void readFile() {
        // creating object
        ifstream fileRead("details.txt");
        // variable to store each line in file
        string i;
        // loop to print each line in a file
            while (getline(fileRead, i)) 
            {
                cout<<i<<endl;
            }
            // closing the fileRead
                fileRead.close();
        
    
    }

};

int main() {
    // creating an object of the class to use its functions
    DetailsPrinter file;
// getting name, age, 
    file.getName();
    file.getAge();
    
// writing in file
    file.writeFile();

// printing in the console what is in file
    file.readFile();

}