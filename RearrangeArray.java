import java.util.ArrayList;

public class RearrangeArray {

    static ArrayList<Integer> reArr(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            if (l == r) {
                al.add(arr[r]);
                break;
            }
            al.add(arr[r]);
            al.add(arr[l]);
            l++;
            r--;
        }
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        System.out.println(reArr(arr));
    }
}
