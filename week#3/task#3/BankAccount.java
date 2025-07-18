// import library for input
import java.util.Scanner;

// main class
class BankAccount {

    // main variables for 
    static int withdrawal_Limit = 10000;
    static int deposit_Limit = 10000;

    // added private variables for encapsulation
    private String name;
    private int balance;
    
    // constructor
    BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    
    // method for menu & input for choice
    int getChoice(Scanner input) {
        System.out.print("1. See Balance\n2. See Balance with Limits\n3. Deposit Money\n4. Withdraw Money\n5. Exit\n\nEnter your choice (1-5): ");
        int choice =  input.nextInt();
        return choice;
    }
    // getter for name
    String getName() {
        return name;
    }

    // getter for balance
    int getBalance() {
        return balance;
    }

    // Method to show transaction limits
    void getLimit() {
        System.out.println("Withdrawal Limit: " + withdrawal_Limit);
        System.out.println("Deposit Limit: " + deposit_Limit);
    }
    // Method for Deposit
    void deposit(Scanner input) {
        System.out.print("Enter amount to deposit: ");
        // store the input in 'deposit' variable
        int deposit = input.nextInt();
        // conditional for validation of deposit
        if(deposit<= deposit_Limit) {
        balance = deposit + balance;
        deposit_Limit = deposit_Limit - deposit;
        System.out.println(deposit + "Rs have been successfully deposited.");
        }
        else {
            System.out.println("ERROR! Deposit money exceeds the deposit limit.");
        }
    }
    // Method for WIthdrawal    
    void withdrawal(Scanner input) {
        System.out.print("Enter amount to Withdraw: ");
        // store the input in 'withdrawal' variable
        int withdrawal = input.nextInt();
        // nested conditional for validation of withdrawal for two things, comparison with balance & withdrawal limit.
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
    
    // main method
    public static void main(String[] args) {
        // Scanner Object (input)
        Scanner input = new Scanner(System.in);
        // person Object
        BankAccount person = new BankAccount("Arslan", 100000);        

        // Infinite While Loop
        while(true) {
        // storing the choice in a variable
        int choice = person.getChoice(input);
        // switch conditional statement for choosing different methods based on value of 'choice' variable
            switch(choice) {
                case 1:
                    System.out.println("The balance is = " + person.getBalance() + "Rs");
                break;
                case 2:
                    System.out.println("The balance is = " + person.getBalance() + "Rs");
                    person.getLimit();
                break;
                case 3:
                    person.deposit(input);
                break;
                case 4:
                    person.withdrawal(input);
                break;
                // case 5 for exit: if the user wants to stop.
                case 5:
                    System.out.println("Goodbye. Have a good day.");
                    // for closing the input
                        input.close();
                    // this will stop the infinite while loop.
                        return;
                default:
                    System.out.println("Enter VALID input... or press 5 for exit.");
            }
        }
    }
}
