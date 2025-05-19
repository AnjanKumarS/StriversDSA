public class ThirdLargestNum {
    public static int thirdLar(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third=second;
                second=first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }
        return third;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(thirdLar(arr));
    }
}
