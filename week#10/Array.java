
// Write a program to find the largest and smallest element in an array.
import java.util.ArrayList;
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

    // remove element in array
    int[] removeElement(int[] arr, int p) {
        int size = arr.length;
        if ((p > size || (p <= 0))) {
            System.out.println("Position is either 0 or bigger/smaller than array");
            return arr;
        }
        // real array 5;
        // removed value array = 4;
        p = p - 1; // to convert into 0-based index
        int[] newArr = new int[size - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < p) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }

        return newArr;

    }

    int[] removeDuplicate(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                a = removeElement(a, i + 1); // remove the duplicate
                i--; // step back to re-check current position
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Array array = new Array();
        Sorting sort = new Sorting();
        int[] arr = { 5, -100, 10, 1000, 5 };
        int[] arr2 = { 1, 2, 3, 4, 1, 4, 1, 3, 1, 2 };

        System.out.println(" Largest value in array: " + array.findLargest(arr));
        System.out.println(" Smallest value in array: " + array.findSmallest(arr));

        System.out.println("Reversed Array: ");
        int[] reverseArr = array.reverseArray(arr);
        for (int a : reverseArr) {
            System.out.print(a + "\t");
        }

        System.out.println("\n");

        System.out.println(array.arraysSum(arr, arr2));

        int[] dupArr = array.removeDuplicate(sort.bubbleSort(arr2));
        for (int i : dupArr) {
            System.out.print(i + "\t");
        }
    }
}