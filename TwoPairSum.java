import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TwoPairSum {
    public static ArrayList<ArrayList<Integer>> twoPairSum(int arr[]) {
        Arrays.sort(arr);
        HashSet<String> hs = new HashSet<>();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    ArrayList<Integer> pair = new ArrayList<>(Arrays.asList(arr[i], arr[j]));
                    String pairkey = arr[i] + " " + arr[j];

                    if (!hs.contains(pairkey)) {
                        al.add(pair);
                        hs.add(pairkey);
                    }
                }
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(twoPairSum(arr));
    }
}
