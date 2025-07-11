class Book {
// relevent instance variables for Book class
    private String bname;
    private String author;
    private float  author_commission;
    int year_published;
// constructor
    Book(String bname, String author, float author_commission, int year_published) {
        this.bname = bname;
        this.author = author;
        this.author_commission = author_commission;
        this.year_published = year_published;
    }
    
    //  getter for name
    String getbName() {
        return bname;
    }
    //  getter for private author
    String getAuthor() {
        return author;
    }
    // setter for author to update the variable
    public void setAuthor(String new_Author) {
        this.author = new_Author;
    }
    
    public static void main(String[] args) {

// Making an object named: Book1
        Book Book1 = new Book("How to write in Java?", "Ali", 5.5f, 2000);

// call a getter to print book name
        System.out.print("Book: " + Book1.getbName());
// call a getter to print author name
        System.out.print("\nAuthor: " + Book1.getAuthor());
// call the setter to update the author variable
        Book1.setAuthor("Arslan");
// now call the updated (done using the previous setter) author variable using getter
        System.out.print("\nUpdated Author: " + Book1.getAuthor());
    }
}
