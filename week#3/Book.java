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

    String getbName() {
        return bname;
    }
    
    String getAuthor() {
        return author;
    }
    
    public static void main(String[] args) {
        Book Book1 = new Book("How to write in Java?", "Arslan", 5.5f, 2000);
        System.out.print("Book: " + Book1.getbName());
        System.out.print("\nAuthor: " + Book1.getAuthor());
    }
}
