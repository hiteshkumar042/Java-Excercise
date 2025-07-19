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

    public static void main(String[] args) {
        // Find Larget Number in Array
        int[] arr = { 10, 15, 80, 25, 60 };
        System.out.println(largetNumber(arr));
        // Find Smallest Number in Array
        System.out.println(smalletNumber(arr));
    }
}
