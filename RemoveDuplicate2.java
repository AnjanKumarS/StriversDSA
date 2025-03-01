public class RemoveDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2,2,2, 3, 4,5,5,5};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print(arr[arr.length - 1]);
    }
}