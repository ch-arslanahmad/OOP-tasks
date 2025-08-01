// for file reading
import java.io.FileReader;
// for handling I/O errors
import java.io.IOException;

// public main class
public class readFile {
    // variable that holds file address
    private String filePath = "../details.txt";

    // fileReader method
    public void fileReader() {
        try {
            FileReader file = new FileReader(filePath);
            boolean a = file.ready();
            System.out.println(a);
            /*
            int i;
            while ((i = file.read()) != -1) {
                System.out.print((char)i);
            } */

        char[] charArray = new char[20];

            // Using read method for to get character array
            file.read(charArray);
            System.out.print(charArray);
            System.out.println("");
            file.close();

        }
        catch (IOException e) {
            System.out.println("Error Occured.");
            e.printStackTrace();
        }
    }

    // main-method
    public static void main(String[] args) {
        // creating object to run fileReader method
        readFile newFile = new readFile();
        newFile.fileReader();
    }
    
}
