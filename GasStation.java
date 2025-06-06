public class GasStation {

    public static int startStation(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return totalGas >= totalCost ? start : 1;
    }
    public static void main(String[] args) {
        int gas[] = {4, 5, 7, 4};
        int cost[] = { 6, 6, 3, 5 };
        System.out.println(startStation(gas, cost));
    }
}
