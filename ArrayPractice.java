import java.util.Arrays;

public class ArrayPractice {

    // Find Larget Number in Array
    static int largetNumber(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Find smallest Number in Array
    static int smalletNumber(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // Find the Smallest and largest element in an array
    static int[] maxMinNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array should not be blank");
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return new int[] { min, max };
    }

    // Find Second Smallest Element in an Array
    static int secondSmallest(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;

    }

    public static void main(String[] args) {
        // Find Larget Number in Array
        int[] arr = { 10, 15, 80, 25, 60 };
        System.out.println("Largets in Array : " + largetNumber(arr));
        // Find Smallest Number in Array
        System.out.println("Smallest in Array : " + smalletNumber(arr));
        // Find the Smallest and largest element in an array
        System.out.println("Smallest and Largest in Array : " + Arrays.toString((maxMinNumber(arr))));
        // Find Second Smallest Element in an Array
        System.out.println("second smallest in Array : " + secondSmallest(arr));

    }
}
