import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
public class logAuth {
    private String name;
    private String pass;
    private static String PASSWORD = "1234";
    private static final Logger logger = Logger.getLogger(logAuth.class.getName());

    // creating a variable of the class FileHandler: so i can close it outside the static block
    private static FileHandler fh;

    // creating a static block so log file is made once
    static {
    try {
        fh = new FileHandler("OOP-tasks/week#6/task#3/log.txt", 0 /* limit */, 1 /* max files */, true );
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.setLevel(Level.FINE);
    }
    catch (IOException e) {
        System.out.println("Error Occured");
        e.printStackTrace();
    }
    }

    // input method
    void getInput(Scanner input) {
        System.out.print("Enter name: ");
        name = input.nextLine();

        System.out.print("\nEnter Password: ");
        pass = input.nextLine();
    }

    // authentication method
    boolean doAuth(int n) {
        // return true if correct password given
        boolean isCorrect = false;
        try {
            // if password is not correct run 'if'
            if(!pass.equals(PASSWORD)) {
                    logger.info("Try " + n + ": Entered Incorrect Password.");
                    logger.severe("Illegal Authorization");
                }
            else {
                    System.out.println("Welcome back, " + name);
                    isCorrect = true;
                    logger.info("User logged in");
                }
        } catch (Exception e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }

        // return if password isCorrect, 'false' or 'true'
        return isCorrect;
    }

    public static void main(String[] args) {
        // creating logAuth object
        logAuth file = new logAuth();
        // creating Scanner object
        Scanner input = new Scanner(System.in);

        // variable for loop
        int n = 1;

        // while loop
        while(n <=3) { 
        file.getInput(input);
        boolean a = file.doAuth(n);
        n++;
            if(a) {
                fh.close();
                break;
            }
            else {
                System.out.println("\nTry Again");
            }

            if(n == 3) {
                // closing the handler to prevent .lck file and multiple log files
                fh.close();
            }
        }
    }
    
}
