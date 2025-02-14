public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int t = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == t) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
