import java.util.ArrayList;

public class SearchingInArrayList {
    public static int search(int k, ArrayList<Integer> arr) {
        // int c = 0;
        // for (int a : arr) {
        //     c++;
        //     if (k == a) {
        //         return c;
        //     }
        // }
        // return -1;

        //OR

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(15);
        arr.add(16);
        arr.add(16);
        arr.add(10);
        int k = 16;
        System.out.println(search(k,arr));
    }
}
