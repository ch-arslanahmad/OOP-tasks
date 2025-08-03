import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;


import java.util.logging.*;
public class Auth {

    ArrayList <String> username = new ArrayList<>();
    ArrayList <String> password = new ArrayList<>();
    String userRegex = "^[0-9a-z]{6,16}$";
    String passRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";

    private static final Logger logger = Logger.getLogger(Auth.class.getName());

    private static FileHandler fh;

    static {
    
    try {
        fh = new FileHandler("authlog.txt", true);
        logger.addHandler(fh);
        fh.setFormatter(new SimpleFormatter());
    } catch (Exception e) {
        e.printStackTrace();
    }
        
    }


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
        
        input.close();
        return false;


    }

    public static void main(String[] args) {
        Auth user = new Auth();
        Scanner input = new Scanner(System.in);
        user.makeUser(input);
        

        fh.close();
        
    }
    
}
