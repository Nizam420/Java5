import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 19, 14};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int s, int e) {
        int maxVal = arr[s];
        for (int i = s; i < e; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
