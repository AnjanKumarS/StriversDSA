public class ncr {

    public static int fact(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
        return sum;
    }

    public static int ncr(int n, int r) {
        if (n > r) {
            int sum = fact(n)/(fact(n-r)*fact(r));
            return sum;
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(ncr(n,r));
    }
}
