import java.util.Arrays;

public class MinimumPlatform {
    
    public static int findPlatform(int[] arr, int[] dep) {
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformNeed = 1;
        int maxPlatform = 1;
        int i = 1;
        int j = 0;

        while (i<n && j<n) {
            if (arr[i] <= dep[j]) {
                platformNeed++;
                i++;
            }
            else {
                platformNeed--;
                j++;
            }
            maxPlatform = Math.max(maxPlatform,platformNeed);
        }
        return maxPlatform;
    }

    public static void main(String[] args){
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.print(findPlatform(arr,dep));
    }
}
