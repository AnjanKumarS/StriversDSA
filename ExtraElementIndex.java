public class ExtraElementIndex {

    public static int findExtra(int[] a, int[] b) {
        int left = 0, right = b.length, mid;

        while (left < right) {
            mid = left + (right - left) / 2;
            if (a[mid] == b[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] a1 = {2, 4, 6, 8, 9, 10, 12};
        int[] b1 = {2, 4, 6, 8, 10, 12};
        System.out.println(findExtra(a1, b1)); // Output: 4

        int[] a2 = {3, 5, 7, 8, 11, 13};
        int[] b2 = {3, 5, 7, 11, 13};
        System.out.println(findExtra(a2, b2)); // Output: 3

        int[] a3 = {3, 5};
        int[] b3 = {3};
        System.out.println(findExtra(a3, b3)); // Output: 1
    }
}
