import java.util.ArrayList;

public class FirstLastOccerence {

    static int firstOccur(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static int lastOccur(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static ArrayList<Integer> firLastOcc(int[] arr,int x) {
        ArrayList<Integer> al = new ArrayList<>();
        int a = firstOccur(arr, x);
        int b = lastOccur(arr, x);
        al.add(a);
        al.add(b);
        return al;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int x = 5;
        System.out.println(firLastOcc(arr,x));
    }
}
