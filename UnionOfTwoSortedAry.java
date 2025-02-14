import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoSortedAry {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = { 1, 2, 3, 6, 7 };
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < a1.length; i++) {
            set.add(a1[i]);
        }
        for (int j = 0; j < a2.length; j++) {
            set.add(a2[j]);
        }
        for (int i : set) {
            list.add(i);
            System.out.print(i + " ");
        }
        for (int val : list) {
            System.out.print(val+" ");
        }
    }
}
