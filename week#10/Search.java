public class Search {

    int LinearSearch(int[] a, int value) {

        for (int i = 0; i < a.length; i++) {
            if (value == a[i]) {
                System.out.println("Value EXISTS!!!.");
                return i + 1;
            }
        }

        System.out.println("Value doesnt exist.");
        return 0;
    }

    int BinarySearch(int[] a, int value) {
        int middleValue = a.length / 2;

        if (value < a[middleValue]) {
            for (int i = 0; i < middleValue; i++) {
                if (value == a[i]) {
                    System.out.println("Value EXISTS!!!.");
                    return i + 1;
                }
            }
        } else if (value > a[middleValue]) {
            for (int i = middleValue; i < a.length; i++) {
                if (value == a[i]) {
                    System.out.println("Value EXISTS!!!.");
                    return i + 1;
                }
            }
        }

        System.out.println("Value doesnt exist.");
        return -1;
    }

    public static void main(String[] args) {
        Search main = new Search();
        int[] a = { 1, 3, 4, 100, 300, -6, 6, 7, 8 };
        System.out.println("Value is at position: " + main.LinearSearch(a, 8));
        // for binary searching an array must be sorted,
        Sorting sort = new Sorting();
        int[] sortedA = sort.selectionSort(a);

        // after sorting it will be: {-6,1,3,4,6,7,8,100,300}
        System.out.println("Binary - Value is at position: " + main.BinarySearch(sortedA, 8));

    }
}
