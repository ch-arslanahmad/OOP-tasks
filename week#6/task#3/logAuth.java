import java.util.Scanner;
import java.util.logging.*;
public class logAuth {
    private String name;
    private String pass;
    private static String PASSWORD = "1234";
    private static final Logger logger = Logger.getLogger(logAuth.class.getName());

    void getInput(Scanner input) {
        System.out.print("Enter name: ");
        name = input.nextLine();

        System.out.print("\nEnter Password: ");
        pass = input.nextLine();
    }

    boolean doAuth(int n) {

        boolean isCorrect = false;
        try {
        FileHandler fh = new FileHandler("OOP-tasks/week#6/task#3/log.txt", true);
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.setLevel(Level.FINE);
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

        return isCorrect;
    }


    public static void main(String[] args) {
        logAuth file = new logAuth();
        Scanner input = new Scanner(System.in);

        int n = 1;
        while(n <=3) { 
        file.getInput(input);
        boolean a = file.doAuth(n);
        n++;
            if(a) {
                break;
            }
            else {
                System.out.println("\nTry Again");
            }
        }
    }
    
}
