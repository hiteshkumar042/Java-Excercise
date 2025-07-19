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

    public static void main(String[] args) {
        // Find Larget Number in Array
        int[] arr = { 10, 15, 80, 25, 60 };
        System.out.println(largetNumber(arr));
        // Find Smallest Number in Array
        System.out.println(smalletNumber(arr));
        // Find the Smallest and largest element in an array
        System.out.println(Arrays.toString((maxMinNumber(arr))));

    }
}
