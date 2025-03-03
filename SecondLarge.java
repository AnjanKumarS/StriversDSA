public class SecondLarge {

    static void secondLar(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            } else if (arr[i] > sec_max && arr[i] != max) {
                sec_max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(sec_max);
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 3, 4, 7, 8, 5, 6 };
        secondLar(arr);
    }
}
