public class ReverseAString {

    static String reverseStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "anjankumar";
        System.out.println(reverseStr(s));
    }
}