public class MaxMin {
    public static int maxmin(int[] arr, int N) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min+max;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 1, -4, 5, 3};
        int N = arr.length;
        System.out.println(maxmin(arr,N));
    }
}
