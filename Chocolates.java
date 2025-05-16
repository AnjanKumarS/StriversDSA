class Chocolates {

    public static int chokolate(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (arr[start] >= arr[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 6, 9 };
        int n = arr.length;
        System.out.println(chokolate(arr,n));
    }
}