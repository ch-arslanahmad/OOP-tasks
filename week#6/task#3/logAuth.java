import java.util.Scanner;
import java.util.logging.*;
public class logAuth {
    private String name;
    private String pass;
    private static String PASSWORD = "1234";
    private static final Logger logger = Logger.getLogger(logAuth.class.getName());

    void getInput(Scanner input) {
        System.out.print("Enter name:");
        name = input.nextLine();
        System.out.print("Enter Password:");
        pass = input.nextLine();
    }

    void doAuth() {
        try {
        FileHandler fh = new FileHandler("OOP-tasks/week#6/task#3/log.txt", true);
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
            if(!pass.equals(PASSWORD)) {
                logger.setLevel(Level.FINE);
                logger.info("Entered Incorrect Password.");
                logger.severe("Illegal Authorization");
            }
            else {
                System.out.println("Welcome back, " + name);
            }
        } catch (Exception e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        logAuth file = new logAuth();
        Scanner input = new Scanner(System.in);
        file.getInput(input);
        file.doAuth();
    }
    
}
