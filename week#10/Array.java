
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

    int[] reverseArray(int[] array) {
        int size = array.length;
        int[] reverse = new int[size];
        int j = 0;
        for (int i = (array.length - 1); i >= 0; i--) {
            // reverse []
            reverse[j] = array[i];
            j++;
        }
        return reverse;
    }

    // sum of 2 arrays
    int arraysSum(int[] array1, int[] array2) {
        int sum1 = sumArray(array1);
        int sum2 = sumArray(array2);
        return sum1 + sum2;
    }

    // sum of an array
    int sumArray(int[] array) {
        int sum = 0;
        for (int s : array) {
            sum += s;
        }
        return sum;
    }

    // max value in an array
    int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return 1;
    }

    // min value in an array
    int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Array array = new Array();
        int[] arr = { 5, -100, 10, 1000, 5 };
        int[] arr2 = { 1, 2, 3, 4 };
        System.out.println(" Largest value in array: " + array.findLargest(arr));
        System.out.println(" Smallest value in array: " + array.findSmallest(arr));

        System.out.println("Reversed Array: ");
        int[] reverseArr = array.reverseArray(arr);
        for (int a : reverseArr) {
            System.out.print(a + "\t");
        }
        System.out.println("\n");

        System.out.println(array.arraysSum(arr, arr2));
    }
}