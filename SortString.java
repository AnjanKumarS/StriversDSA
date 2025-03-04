import java.util.Arrays;

public class SortString {

    static String sortString(String str) {
        StringBuffer sb = new StringBuffer();
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        Arrays.sort(ch);
        for (char c : ch) {
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(sortString(str));
    }
}
