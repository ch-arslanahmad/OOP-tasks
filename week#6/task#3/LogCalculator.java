// imports
import java.util.logging.*;
import java.util.Scanner;
// logCalculator
class LogCalculator {
    // private variables
    private float a;
    private float b;
    private int c;
    // private logger object
    private static final Logger logger = Logger.getLogger(LogCalculator.class.getName());

    // input method
    void getInput(Scanner input) {
        System.out.print("Enter 1st value: ");
        a = input.nextFloat();
        System.out.print("Enter 2nd value: ");
        b = input.nextFloat();
        System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter choice: ");
        c = input.nextInt();
    }

    // add method
    void add() {
        System.out.println("The sum is " + (a+b));
    }

    // subtract method
    void subtract() {
        System.out.println("The subtraction is " + (a-b));
        
    }
    // multiplication method
    void multiply() {
        System.out.println("The multiplication is " + (a*b));
    }
    // division method
    void divide() {
        // try-catch
        try {
            // conditional
            if(b == 0) {
            // filehandler to create a log file
            FileHandler fh = new FileHandler("OOP-tasks/week#6/task#3/log.txt", true);
            // formatter to format it into simple, not XML etc
            fh.setFormatter(new SimpleFormatter());
            // adding handler
            logger.addHandler(fh);

            // setting logger level: INFO: permits all messages
            logger.setLevel(Level.INFO);
            // print (& write) these messages 
            logger.severe("ILLEGAL Operation");
            logger.info("Divisor(b) shouldn't be zero.");

            }
        } catch (Exception e) {
            System.out.println("Error Occured.");
            e.printStackTrace();
        }
        System.out.println("The division is " + (a/b));
    }
    
    // choose method
    void choose() {
        switch (c) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args) {
        // Scanner object for input
        Scanner input = new Scanner(System.in);
        // calculator object
        LogCalculator calculator = new LogCalculator();
        // running the methods.a
        calculator.getInput(input);
        calculator.choose();
    }
}
