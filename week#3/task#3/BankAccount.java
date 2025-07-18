import java.util.Scanner;
class BankAccount {
    static int withdrawal_Limit = 10000;
    static int deposit_Limit = 10000;

    private String name;
    private int balance;
    
    BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    
    int getChoice(Scanner input) {
        System.out.print("1. See Balance\n2. See Balance with Limits\n3. Deposit Money\n4. Withdraw Money\n5. Exit\n\nEnter your choice (1-5): ");
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
        System.out.println("Withdrawal Limit: " + withdrawal_Limit);
        System.out.println("Deposit Limit: " + deposit_Limit);
    }
    
    void deposit(Scanner input) {
        System.out.print("Enter amount to deposit: ");
        int deposit = input.nextInt();
        if(deposit<= deposit_Limit) {
        balance = deposit + balance;
        deposit_Limit = deposit_Limit - deposit;
        System.out.println(deposit + "Rs have been successfully deposited.");
        }
        else {
            System.out.println("ERROR! Deposit money exceeds the deposit limit.");
        }
    }
    
    void withdrawal(Scanner input) {
        System.out.print("Enter amount to Withdraw: ");
        int withdrawal = input.nextInt();
        System.out.print("Rs.");
        if(balance>= withdrawal) {
            if(withdrawal<= withdrawal_Limit) {
        balance = balance - withdrawal;
        withdrawal_Limit = withdrawal_Limit - withdrawal;
            }
            else {
                System.out.println("It exceeds Withdrawl Limit.");
            }
        }
        else {
            System.out.println("ERROR! Not Enough Balance");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount Person1 = new BankAccount("Arslan", 100000);        

        while(true) {
        int choice = Person1.getChoice(input);
            switch(choice) {
                case 1:
                    System.out.println("The balance is = " + Person1.getBalance() + "Rs");
                break;
                case 2:
                    System.out.println("The balance is = " + Person1.getBalance() + "Rs");
                    Person1.getLimit();
                break;
                case 3:
                    Person1.deposit(input);
                break;
                case 4:
                    Person1.withdrawal(input);
                break;
                case 5:
                    System.out.println("Goodbye. Have a good day.");
                        input.close();
                        return;
                    default:
                    System.out.println("Enter VALID input... or press 5 for exit.");
            }
        }
    }
}
