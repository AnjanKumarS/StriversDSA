public class SticklerThief {
    public static int stickerThief(int[] arr) {
        int osum = 0;
        int esum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                esum += arr[i];
            }
            else {
                osum += arr[i];}
        }
        return (esum>osum)?esum:osum;
    }
    public static void main(String[] args) {
        int arr[] = { 6, 5, 5, 7, 4 };
        System.out.println(stickerThief(arr));
    }
}
