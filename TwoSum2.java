public class TwoSum2 {

    static String twoSum(int[] arr, int t) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == t) {
                return "Yes";
            }
            else if (sum<t) {
                l++;
            }
            else {
                r--;
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int t = 9;
        System.out.println(twoSum(arr,t));
    }
}
