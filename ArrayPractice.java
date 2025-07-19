public class ArrayPractice {

    static int largetNumber(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Find Larget Number in Array
        int[] arr = { 10, 15, 80, 25, 60 };
        System.out.println(largetNumber(arr));
    }
}
