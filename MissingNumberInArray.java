public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6,9,8,5 };
        int n = arr.length + 1;
        int num = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(num-sum);
    }
}
