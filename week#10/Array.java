
// Write a program to find the largest and smallest element in an array.
import java.util.Arrays;

class Array {

    // finds the largest value
    int findLargest(int[] array) {
        int max = array[1];
        for (int a : array) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }

    // finds the smallest value
    int findSmallest(int[] array) {
        int min = array[1];
        for (int a : array) {
            if (min > a) {
                min = a;
            }
        }
        return min;
    }

    // FIX THIS REVERSE METHOD ARRAY
    int[] reverseArray(int[] array) {
        int size = array.length;
        int[] reverse = new int[size];
        // for example: size = 5;
        /* so i = 4, 4>= 0; 4-- = 3 */
        for (int i = (size - 1); i >= 0; i--) {
            // reverse []
            reverse[size - i] = array[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        Array array = new Array();
        int[] arr = { 5, -100, 10, 1000, 5 };
        System.out.println(" Largest value in array: " + array.findLargest(arr));
        System.out.println(" Smallest value in array: " + array.findSmallest(arr));

        System.out.println("Reversed Array: ");
        Arrays.stream(array.reverseArray(arr)).forEach(System.out::println);
    }
}