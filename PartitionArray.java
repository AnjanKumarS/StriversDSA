public class PartitionArray {

    public static boolean threeWayPartition(int[] arr, int a, int b) {
        int start = 0, end = arr.length - 1, i = 0;

        while (i <= end) {
            if (arr[i] < a) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                i++;
                start++;
            } else if (arr[i] > b) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            } else {
                i++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 4};
        int[] arr2 = {1, 4, 3, 6, 2, 1};

        System.out.println(threeWayPartition(arr1, 1, 2));
        System.out.println(threeWayPartition(arr2, 1, 3));
    }
}
