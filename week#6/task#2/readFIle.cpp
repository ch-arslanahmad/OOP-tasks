// imports
#include<iostream>
#include<fstream>
using namespace std;
    
    // main file
    class readFile {
    // private modifier
    private:
        // variable that stores the address
        string filePath = "../details.txt";
    
    public:
        // fileReader function
        void fileReader() {
            ifstream file(filePath);
            string i;
            while (getline(file, i)) 
            {
                cout<<i<<endl;
            }
            file.close();
        }


    };

int main() {
    // making an object of class
    readFile file;
    // calling the function
    file.fileReader();

}