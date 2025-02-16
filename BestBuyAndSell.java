import java.util.Scanner;

public class BestBuyAndSell {

    static int bestBuySell(int arr[], int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = arr[j] - arr[i];
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(bestBuySell(arr, n));
        sc.close();
    }
}
