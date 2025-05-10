import java.util.Arrays;

public class ReverseAnArray {
    public static void reverseArray(int[] arr) {
        int arr1[] = new int[arr.length];
        int i = 0;
        for (int x : arr) {
            arr1[i] = x;
            i++;
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverseArray(arr);
    }
}
