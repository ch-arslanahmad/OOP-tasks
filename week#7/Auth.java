// import
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
import java.util.logging.*;
import java.io.File;

// Exception classes

    class invalidUsername extends Exception {

        invalidUsername(String m) {
        super(m);
        }
    }

    class weakPassword extends Exception {

        weakPassword(String m) {
            super(m);
        }
    }


// main public class
public class Auth {
    // array list for username
    ArrayList <String> username = new ArrayList<>();
    ArrayList <String> password = new ArrayList<>();
    // regex for username & password
    String userRegex = "^[0-9a-z]{6,16}$";
    String passRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";

    // creating logger object
    private static final Logger logger = Logger.getLogger(Auth.class.getName());
    // creating a variable for logger Filehandler
    private static FileHandler fh;

    static {
    // 
    try {
        // so logging is not shown in console
        LogManager.getLogManager().reset();
        String a = "Authlog.txt";
        File file = new File(a);
        // if file does not exist, create it
        if(!(file.exists())) {
            file.createNewFile();
        }
        fh = new FileHandler(a, true);
        logger.addHandler(fh);
        fh.setFormatter(new SimpleFormatter());
    } catch (Exception e) {
        e.printStackTrace();
    }
    finally {
        logger.info("Log File is created!");
    }
        
    }



    boolean setUser(Scanner input) {
        boolean addedUser = false;
        Pattern userPattern = Pattern.compile(userRegex);
        // try accept to validate username
        try {
                // username input
                String User = input.nextLine();

            // validation of username
                // if empty
                if(User.isEmpty()) {
                    System.out.println("Username cannot be empty.");
                }
                // now does it match regex
                else {
                    
                    // actual pattern matching 
                    Matcher match = userPattern.matcher(User);
                        if(match.matches()) {
                            username.add(User);
                            System.out.println("...");
                            addedUser = true;
                        }
                        else {
                            logger.warning("Invalid Username Entered");
                            throw new invalidUsername("Maybe try in lowercase & without space.\\nTRY AGAIN.");
                        }        
                }
            
        } catch (Exception e) {
            System.out.println("Username errors are Occuring.");
            e.printStackTrace();
        }
    return addedUser;
      
    }

    boolean setPass(Scanner input) {
        boolean addedPass = false;
        Pattern passPattern = Pattern.compile(passRegex);
        // try accept to validate password
        try {
                // password input
                String pass = input.nextLine();

            // validation of password
                // if empty
                if(pass.isEmpty()) {
                }
                // now does it match regex
                else {
                    
                    // actual pattern matching 
                    Matcher match = passPattern.matcher(pass);
                        if(match.matches()) {
                            password.add(pass);
                            addedPass = true;
                            System.out.println("User Successfully added.");
                            logger.info("User logged in.");
                        }
                        else {

                            logger.warning("Invalid Password Entered");

                            throw new weakPassword("Invalid Password. Maybe try 8 characters long with lowercase & upercase & number.\\nTRY AGAIN.");
                        }
                                       
                }

            
        } catch (Exception e) {
            System.out.println("Password errors are Occuring.");
            e.printStackTrace();
        }
        return addedPass;
      
    }



    boolean makeUser(Scanner input) {
        int n = 1;
        // variable to see if user is made
        boolean verifiedUser = false;
        boolean validPass = false;
        while (n <= 3) {
            // if user is not made run this otherwise not
            if(!verifiedUser) {
                System.out.print("Username: ");
                verifiedUser = setUser(input);
            }
            // ask password only if username is added
            if(verifiedUser) {
                System.out.print("Password: ");
                validPass = setPass(input);
                n++;
                if(validPass) {
                    input.close();
                    return true;

                }
            }
        }
        // closing the input
        input.close();
        return false;


    }

    public static void main(String[] args) {
        Auth user = new Auth();
        Scanner input = new Scanner(System.in);
        user.makeUser(input);
        

        // closing the logger
        fh.close();
        
    }
    
}
