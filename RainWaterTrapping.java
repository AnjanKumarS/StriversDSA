public class RainWaterTrapping {

    public static int rainWaterTrap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        return totalWater;
    }

    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 0, 4, 0 ,2};
        System.out.println(rainWaterTrap(arr));
    }
}
