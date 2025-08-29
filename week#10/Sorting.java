public class Sorting {

    // bubble sort is the most inne
    public int[] bubbleSort(int[] a) {
        // {5,4,-1,-100,100}
        int size = a.length; // 5
        // outer loop
        for (int i = 0; i < size; i++) { // run 4 times

            // inner loop
            for (int o = 0; o < size - i - 1; o++) { // run n - 1 times
                /*
                 * if i = 0
                 * It means it will first be 4-1 = 3; -- total 3 inner runs as o = 0
                 * then o = 1; 4-1 = 3 -- total 2 runs
                 * then o = 2; 4-1 = 3 -- total 1 runs
                 * the reason we are doing this is because we do not need to compare again what
                 * is sorted
                 */
                // compare n value to n+1 value of array
                if (a[o] > a[o + 1]) {

                    // replace values
                    int t = a[o];
                    a[o] = a[o + 1];
                    a[o + 1] = t;
                }
            }
        }
        return a;

    }

}
