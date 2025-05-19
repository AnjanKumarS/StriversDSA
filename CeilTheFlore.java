import java.util.*;

public class CeilTheFlore {
    public static int[] ceil(int x, int[] arr) {
        int res[] = new int[2];
        TreeSet<Integer> sort = new TreeSet<>();
        for (int a : arr) {
            sort.add(a);
        }
        List<Integer> list = new ArrayList<>(sort);

        int idx = 0;
        while (idx < list.size() && list.get(idx) < x) {
            idx++;
        }

        if (idx == 0) {
            res[0] = -1;
        } else {
            res[0] = list.get(idx - 1);
        }

        if (idx == list.size()) {
            res[1] = -1;
        } else {
            res[1] = list.get(idx);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 9, 6, 5, 5, 6 };
        int x = 7;
        int[] result = ceil(x, arr);
        System.out.println("Floor: " + result[0]);
        System.out.println("Ceil: " + result[1]);
    }
}
