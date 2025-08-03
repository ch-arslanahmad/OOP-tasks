import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
public class Auth {

    ArrayList <String> username = new ArrayList<>();
    String userRegex = "^[A-Za-z]\\w{5, 29}$";


    void makeUser(Scanner input) {
        Pattern userPattern = Pattern.compile(userRegex);
        try {
            System.out.println("Enter your username: ");
            String User = input.nextLine();
                if(!User.isEmpty()) {
                    // write some exception
                    System.out.println("smthin");

                }
            
            Matcher match = userPattern.matcher(User);
            System.out.println(match.matches());
            // username.add(input.nextLine());

            
        } catch (Exception e) {
            System.out.println("Error Occured.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Auth user = new Auth();
        Scanner input = new Scanner(System.in);

        user.makeUser(input);
        
    }
    
}
