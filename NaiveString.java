public class NaiveString {
    public static void String(String s, String p) {
        int n = s.length() - 1;
        int m = p.length() - 1;
        for (int i = 0; i < n - m; i++) {
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (s.charAt(i + j) != p.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
    public static void main(String[] args) {
        String s = "abcabcabc";
        String p = "cab";
        String(s,p);
    }
}
