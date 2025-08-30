import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class string {

    boolean isVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        }
        return false;
    }

    char whichSound(char a) {
        if (isVowel(a)) {
            return 'v';
        } else {
            return 'c';
        }
    }

    String reverseString(String a) {
        char[] rev = new char[a.length()];
        int j = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            rev[j] = a.charAt(i);
            j++;
        }
        String reverse = String.valueOf(rev);
        return reverse;
    }

    public boolean isAnagram(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);

        if (Arrays.equals(A, B)) {
            System.out.println("It is an anagram");
            return true;
        } else {
            System.out.println("Not anagram");
            return false;

        }

    }

    public static void main(String[] args) {
        string str = new string();
        Sorting sort = new Sorting();

    }

}
