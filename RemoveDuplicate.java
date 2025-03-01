public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 7, 8 };
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }
        
        for (int a : arr) {
            if (a != -1) {
                System.out.print(a+" ");
            }
        }
    }
}
