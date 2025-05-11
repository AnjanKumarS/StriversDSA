public class SmallestElements {
    public static String findTwoSmallest(int[] arr) {
        int n = arr.length;
        if (n < 2) return "-1";

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num > first && num < second) {
                second = num;
            }
        }

        if (second == Integer.MAX_VALUE) return "-1";
        return first + " " + second;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3, 5, 6};
        int[] arr2 = {1, 1, 1};
        int[] arr3 = {5};

        System.out.println(findTwoSmallest(arr1)); // Output: 2 3
        System.out.println(findTwoSmallest(arr2)); // Output: -1
        System.out.println(findTwoSmallest(arr3)); // Output: -1
    }
}
