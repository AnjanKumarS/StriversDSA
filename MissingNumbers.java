import java.util.ArrayList;

public class MissingNumbers {

    static ArrayList<Integer> missingNum(int arr[]) {
        int l=arr[0];
        int h = arr[arr.length - 1];
        
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = l; i < h; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (i == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                al.add(i);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        System.out.println(missingNum(arr));
    }
}
