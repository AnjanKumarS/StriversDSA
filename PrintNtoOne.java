public class PrintNtoOne {
    static void number(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        number(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        number(n);
    }
}
