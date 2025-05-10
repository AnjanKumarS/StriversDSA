public class AtleastKOccur {

    public static int firstElementKTime(int[] arr, int k) {
        // Traverse the array to find the first element that occurs at least k times
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            
            // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
            // If the element occurs at least k times, return it
            if (count >= k) {
                return arr[i];
            }
        }
        
        // If no element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 7, 4, 3, 4, 8, 7};
        int k1 = 2;
        System.out.println(firstElementKTime(arr1, k1));  // Output: 4

        int[] arr2 = {3, 1, 3, 4, 5, 1, 3, 3, 5, 4};
        int k2 = 3;
        System.out.println(firstElementKTime(arr2, k2));  // Output: 3

        int[] arr3 = {10, 8, 2};
        int k3 = 10;
        System.out.println(firstElementKTime(arr3, k3));  // Output: -1
    }
}
