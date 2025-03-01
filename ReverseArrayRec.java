public class ReverseArrayRec {

    static void print(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    static void revArr(int[] arr, int s, int e) {
        if (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            revArr(arr, s + 1, e - 1);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        revArr(arr, 0, n - 1);
        print(arr);
    }
}
