import java.util.HashSet;

public class LongestSubString {

    static int longestSubString(String str) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0,max=0;

        for (right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubString(str));
    }
}
