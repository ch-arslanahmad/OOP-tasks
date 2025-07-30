// take input of name, age and create & write the details into the file 
import java.io.File;  // the File class
import java.io.IOException; // the IOException class to handle errors
import java.io.FileWriter; // class to write in a file
import java.util.Scanner; // class for input
public class DetailsPrinter {
    private String name;
    private int age;

    // getter for name
    String getName(Scanner input) {
        System.out.println("What is your name?");
        name = input.nextLine();
        return name;
    }
    // getter for age
    int getAge(Scanner input) {
        System.out.println("What is your age?");
        age = input.nextInt();
        return age;
    }

    // create a file
    void makeFile() {
    try {
        File read = new File("details.txt");
        if(read.createNewFile()) {
            System.out.println(read.getName() + " is created");
        }
        else {
            System.out.println("File already exists");
        }

    }
    catch (IOException a) {
        System.out.println("An error occured");
        a.printStackTrace();
    }
    }

    // write in a file:
    void writeFile() {
    try {
    FileWriter writer = new FileWriter("details.txt" , true);
        writer.write("Name," + name + "\nAge," + age);
        writer.close();
        System.out.println("Added Text Successful.");
    } catch (Exception e) {
        System.out.println("An Error Occured");
        e.printStackTrace();
    }
    }


    // read in a file (line-by-line)
    void ReadFile() {

        try {
        // creates file object
        File thefile = new File("details.txt");
        // Scanner object for reading a line
        Scanner fileRead = new Scanner(thefile);
        // loop to read all lines in a loop
        while(fileRead.hasNextLine()) {
            String data = fileRead.nextLine();
            System.out.println(data);
        }
        // closing to prevent unexpected behaviour
        fileRead.close();
        }

        catch (IOException o) {
            System.out.println("Error Occured.");
            System.out.println(o);

        }
    }



    // main method
    public static void main(String[] args) {
    DetailsPrinter user = new DetailsPrinter();
    // Scanner object
    Scanner input = new Scanner(System.in);
    // Scanner object for file_read

    user.getName(input);
    user.getAge(input);
    input.close();
    user.makeFile();
    user.writeFile();
    user.ReadFile();
    }

}
