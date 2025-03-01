public class ReverseAString2 {

    static String reverseStr(String s) {
        return new StringBuffer(s).reverse().toString();
    }
    public static void main(String[] args) {
        String s = "anjankumar";
        System.out.println(reverseStr(s));
    }
}
