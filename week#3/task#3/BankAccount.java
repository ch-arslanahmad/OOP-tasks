import java.util.Scanner;
class BankAccount {
    static float withdrawl_Limit = 10000;
    static int deposit_Limit = 10000;

    private String name;
    private int balance;
    
    BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    

    String getName() {
        return name;
    }
    int getBalance() {
        return balance;
    }
    
    
    public static void main(String[] args) {
        BankAccount Person1 = new BankAccount("Arslan", 100000);
        System.out.println("Your balance is " + Person1.getBalance());
    }
}
