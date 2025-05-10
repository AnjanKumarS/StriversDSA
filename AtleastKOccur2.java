import java.util.HashMap;

public class AtleastKOccur2 {
    public static int firstElementKTime(int[] arr, int k) {
        HashMap<Integer, Integer> countmap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            countmap.put(arr[i], countmap.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (countmap.get(arr[i]) >= k) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        System.out.println(firstElementKTime(arr1, k));
    }
}
