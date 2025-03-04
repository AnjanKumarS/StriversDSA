import java.util.Arrays;

public class SortZeroOneTwo {

    static void sort(int[] arr) {
        Arrays.sort(arr);
        for(int a:arr){
            System.out.print(a);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 0, 2, 1 };
        sort(arr);
    }
}
