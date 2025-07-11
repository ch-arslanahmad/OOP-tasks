class Product {
// instance variables 
    String n;
    String ID;
    private float c;
    private int quan;
    float pri;

// Constructor for object variables
    Product (String name, String Product_ID, float cost, int quantity, float price) {
        this.n = name;
        this.ID = Product_ID;
        this.c = cost;
        this.quan = quantity;
        this.pri = price;
    }
    // main method
    public static void main(String[] args) {
        Product Apple = new Product("Apple", "A0001", 1.5f, 100, 3);
    // simply prints the variable of cost
     System.out.print(Apple.c);
    }
    
}
