import java.util.ArrayList;
import java.util.TreeSet;

public class ThirdLarNum {
    public static int thirdLar(int arr[]) {
        TreeSet<Integer> sort = new TreeSet<>();
        for (int a : arr) {
            sort.add(a);
        }
        if(sort.size()<3) return -1;
        return new ArrayList<>(sort).get(arr.length-3);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5};
        System.out.println(thirdLar(arr));
    }
}
