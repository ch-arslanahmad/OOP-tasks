public class Palindrome {

    boolean isPalindrome(String word) {
        string str = new string();
        String newWord = str.reverseString(word.toLowerCase());

        if (word.toLowerCase().equals(newWord)) {
            return true;
        }
        return false;
    }

    boolean isPalindrome(int num) {
        String number = String.valueOf(num);

        string str = new string();

        if (number.equals(str.reverseString(number))) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String a = "aba";
        int b = 121;
        int c = 12345678;

        if (p.isPalindrome(a)) {
            System.out.println(a + " is a palindrome.\n");
        }

        if (p.isPalindrome(b)) {
            System.out.println(b + " is a palindrome.\n");
        }

        if (p.isPalindrome(c)) {
            System.out.println(c + " is a palindrome.\n");
        }

    }

}
