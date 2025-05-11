import java.util.*;

public class MinSumTwoNumbers {
    public static String minSum(int[] arr) {
        Arrays.sort(arr);
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                num1.append(arr[i]);
            else
                num2.append(arr[i]);
        }

        String sum = addStrings(num1.toString(), num2.toString());
        return removeLeadingZeros(sum);
    }

    private static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            int sum = d1 + d2 + carry;
            res.append(sum % 10);
            carry = sum / 10;
        }

        return res.reverse().toString();
    }

    private static String removeLeadingZeros(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') i++;
        return (i == str.length()) ? "0" : str.substring(i);
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 8, 4, 5, 2, 3};
        int[] arr2 = {5, 3, 0, 7, 4};
        int[] arr3 = {9, 4};

        System.out.println(minSum(arr1)); // Output: 604
        System.out.println(minSum(arr2)); // Output: 82
        System.out.println(minSum(arr3)); // Output: 13
    }
}
