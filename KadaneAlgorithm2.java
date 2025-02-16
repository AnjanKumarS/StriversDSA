public class KadaneAlgorithm2 {
    static int kadaneAlgorithm(int[] arr) {
        int maxsofar = arr[0];
        int maxendinghear = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxendinghear = Math.max(arr[i], maxendinghear + arr[i]);
            maxsofar = Math.max(maxsofar,maxendinghear);
        }
        return maxsofar;
    }


    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = kadaneAlgorithm(arr);
        System.out.println("Maximum contiguous sum is " + maxSum);
    }
}
