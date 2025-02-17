import java.util.ArrayList;

public class MoveAllZeroAtEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 0, 5, };

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i : arr) {
            if (i != 0) {
                list.add(i);
                count++;
            }
        }
        while (count <arr.length) {
            list.add(0);
            count++;
        }
        for (int a : list) {
            System.out.print(a+" ");
        }
    }
}
