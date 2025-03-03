public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        
        int lar = 0;
        int seclar = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > seclar && arr[j] != lar) {
                seclar = arr[j];
            }
        }
        System.out.println(seclar);
    }
}
