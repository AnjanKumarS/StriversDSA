public class Fibonanci {

    static int fibonaci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonaci(n-2)+fibonaci(n-1);
    }
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonaci(i)+" ");
        }
    }
}
