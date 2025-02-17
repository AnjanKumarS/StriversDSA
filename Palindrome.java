public class Palindrome {

    static String isPalindrome(String str) {
        String ch = "";
        for (int i = str.length()-1; i >= 0; i--) {
            ch = ch + str.charAt(i);
        }
        return ch;
    }
    public static void main(String[] args) {
        String str = "ABCDCBA";
        System.out.println(isPalindrome(str)+" "+str);
        System.out.println(isPalindrome(str)==str?"True":"False");
    }
}
