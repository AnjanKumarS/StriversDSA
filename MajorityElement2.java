public class MajorityElement2 {

    static void majorityElement(int[] nums) {
        int cnt = 0;
        int ele = 0;
        int n = nums.length;

        // First loop: Find potential candidate
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                ele = nums[i];
                cnt = 1;
            } else if (nums[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
        }
        
        // Second loop: Verify the candidate
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele) {
                count++;
            }
        }

        // If count is greater than n / 2, it's the majority element
        if (count > n / 2) {
            System.out.println("The majority element is: " + ele);
        } else {
            System.out.println("No majority element found.");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        majorityElement(nums);
    }
}
