import java.util.Arrays;

public class ReverseAnArray2 {
    public static void reverseArray(int arr[], int n) {
        int s = 0;
        int e = n - 1;
        while (s<e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        reverseArray(arr, n);
    }
}
