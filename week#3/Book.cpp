#include <iostream>
class Book {
// private members
private:
// relevent instance variables for Book class
    std::string bname;
    std::string author;
    float  author_commission;
    int year_published;

// public members
public:
// constructor
    Book(std::string bname, std::string author, float author_commission, int year_published) : bname(bname), author(author), author_commission(author_commission), year_published(year_published) {}
    
    //  getter for name
    std::string getbName() {
        return bname;
    }
    //  getter for private author
    std::string getAuthor() {
        return author;
    }
    // setter for author to update the variable
    void setAuthor(std::string new_Author) {
    // updates the variable only if they are empty.
        if(author.empty())
        author = new_Author;
    }
    
};

int main() {
// Making an object named: Book1
        Book Book1("How to write in Java?", "", 5.5f, 2000);

// call a getter to print book name
        std::cout<<"Book: "<<Book1.getbName();
// call a getter to print author name
        std::cout<<"\nAuthor: "<<Book1.getAuthor();
// call the setter to update the author variable
        Book1.setAuthor("Arslan");
// now call the updated (done using the previous setter) author variable using getter
        std::cout<<"\nUpdated Author: "<<Book1.getAuthor();
        

// The following part is shows the usefulness of validation in Getter

// call the setter to update the author variable
        Book1.setAuthor("Salman"); // fails as variable is not empty.
        std::cout<<"\nAuthor: "<<Book1.getAuthor();
    }
    
