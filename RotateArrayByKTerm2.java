public class RotateArrayByKTerm2 {

    static void reverse(int arr[], int start, int last) {
        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k=2;
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length - 1);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
