import java.util.Arrays;

public class TwoRepeatedElements {
    public static int[] twoRepeated(int[] arr) {
        int n = arr.length;
        int[] arr1 = new int[2];
        int x = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }

            boolean alreadyAdded = false;
            for (int k = 0; k < x; k++) {
                if (arr1[k] == arr[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (c > 1 && !alreadyAdded) {
                arr1[x++] = arr[i];
                if (x == 2) break;
            }
        }

        return arr1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 3 };
        System.out.println(Arrays.toString(twoRepeated(arr)));
    }
}
