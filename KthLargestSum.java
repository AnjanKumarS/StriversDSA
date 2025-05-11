import java.util.Arrays;

public class KthLargestSum {
    public static void sortDecending(int arr1[]) {
        int n = arr1.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                while (arr1[j]<arr1[j+1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
    }
    
    public static int kthLargest(int[] arr, int k) {
        int n = arr.length;
        int total =  n * (n + 1) / 2;
        int arr1[] = new int[total];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                arr1[index++] = sum;
            }
        }
        System.out.println(Arrays.toString(arr1));
        sortDecending(arr1);
        System.out.println(Arrays.toString(arr1));
        return arr1[k - 1];
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 1};
        int k = 3;
        System.out.println(kthLargest(arr, k));
    }
}