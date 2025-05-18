import java.util.Arrays;
import java.util.HashSet;

public class TwoRepeatedElements2 {
    public static int[] twoRepeated(int[] arr, int n) {
        HashSet<Integer> seen = new HashSet<>();
        int res[] = new int[2];
        int index = 0;

        for (int a : arr) {
            if (seen.contains(a)) {
                res[index++] = a;
                if (index == 2)
                    break;
            } else {
                seen.add(a);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 3 };
        int n = 4;
        System.out.println(Arrays.toString(twoRepeated(arr,n)));
    }
}
