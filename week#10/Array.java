
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

    int max(int v1, int v2) {
        return (v1 > v2 ? v1 : v2);
    }

    // using Kadane Algo

    /*
     * So basically, you make 2 variables and set its valeu of first index (as
     * maxSoFar and currentMax.). Then, for each iteration:
     * currentMax = You find the maximum between the element itself (A[i]) or the
     * sum of currentMax + A[i],
     * maxSoFar: Then, find the maximum between currentMax and maxSoFar and assign
     * it to maxSoFar. When the loop finishes,
     * you will have the maximum subarray sum stored in maxSoFar.
     * This is Kadane Algo, however this is the process not the reason.
     * 
     * The algo reasoning is between local and global variables (not in general
     * sense):
     * Local means the max value that is the array till now depends on where the i
     * has reached in loop.
     * Global means the greatest sum overall of subarrays, which compares currentMax
     * in literal & variable terms & the next value of array.
     * 
     * Local is the max you have got so far, while the global is the greatest sum
     * you will get.
     */
    // finding maximum subarray sum value
    int maxSum(int[] a) {
        int currentMax, maxSoFar;
        currentMax = maxSoFar = a[0];
        for (int i = 0; i < a.length; i++) {
            currentMax = max(a[i], currentMax + a[i]);
            maxSoFar = max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    /*
     * you can flip the logic to find min or any other metric.
     * The general principle is the same that finding the sub-metric value based on
     * the data currently accessed ('current' value), hence called currentanything
     * and then finding a absolute value based on the total data available, so far.
     */

    int min(int a, int b) {
        return (a > b ? b : a);
    }

    int minSum(int[] a) {
        int currentMin, minSoFar;
        currentMin = minSoFar = a[0];
        for (int i = 0; i < a.length; i++) {
            currentMin = min(a[i], a[i] + currentMin);
            minSoFar = min(minSoFar, currentMin);
        }
        return minSoFar;
    }

    public static void main(String[] args) {
        Array array = new Array();
        Sorting sort = new Sorting();
        int[] arr = { 5, -100, 10, 1000, 5, -10 };
        int[] arr2 = { 1, 2, 3, 4, 1, 4, 1, 3, 1, 2 };

        System.out.println(array.minSum(arr));
        System.out.println(array.maxSum(arr));

        /*
         * // template for printing array
         * for (int i : arr) {
         * System.out.print(i + "\t");
         * }
         */
    }
}