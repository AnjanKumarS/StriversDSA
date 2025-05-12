import java.util.Arrays;

public class CoinChange {
    
    public static int minCoins(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, sum + 1);
        dp[0] = 0;

        for (int i = 1; i <= sum; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[sum] > sum ? -1 : dp[sum];
    }

    public static void main(String[] args) {
        int[] coins1 = {25, 10, 5};
        int sum1 = 30;
        System.out.println(minCoins(coins1, sum1));

        int[] coins2 = {9, 6, 5, 1};
        int sum2 = 19;
        System.out.println(minCoins(coins2, sum2));
    }
}
