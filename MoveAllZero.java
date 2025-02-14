import java.util.ArrayList;
import java.util.Scanner;

public class MoveAllZero {

    static void moveAllZero(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        for (int a : arr) {
            if (a != 0) {
                list.add(a);
                c++;
            }
        }
        while (c < n) {
            list.add(0);
            c++;
        }
        for (int out : list) {
            System.out.print(out+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveAllZero(arr, n);
        sc.close();;
    }
}
