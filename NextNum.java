import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NextNum {
    public static ArrayList<Integer> nextnum(ArrayList<Integer> list, int n) {
        ArrayList<Integer> l = new ArrayList<>();
        int sum = 0;
        for (int a : list) {
            sum = sum * 10 + a;
        }
        sum = sum + 1;
        System.out.println(sum);
        while (sum > 0) {
            l.add(sum % 10);
            sum /= 10;
        }
        Collections.reverse(l);
        return l;
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);
        System.out.println(list);
        System.out.println(nextnum(list, n));
    }
}
