import java.util.Scanner;
class BankAccount {
    static float withdrawal_Limit = 10000;
    static int deposit_Limit = 10000;

    private String name;
    private int balance;
    
    BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    
    int getChoice(Scanner input) {
        System.out.print("1. See Balance\n2. See Balance with Limits\n3. Deposit Money\n4. Withdraw Money\n\nEnter your choice (1-4): ");
        int choice =  input.nextInt();
        return choice;
    }

    String getName() {
        return name;
    }
    int getBalance() {
        return balance;
    }
    void getLimit() {
        System.out.print("Withdrawal Limit: " + withdrawal_Limit);
        System.out.print("Deposit Limit: " + deposit_Limit);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount Person1 = new BankAccount("Arslan", 100000);
        

        

        while(true) {

        int choice = Person1.getChoice(input);
        
            switch(choice) {
                case 1:
                    Person1.getBalance();
                break;
                case 2:
                    Person1.getBalance();
                    Person1.getLimit();
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                    System.out.println("Goodbye. Have a good day.");
                        input.close();
                        return;
                    default:
                    System.out.println("Enter VALID input...");
            }
        }
    }
}
