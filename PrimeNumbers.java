

public class PrimeNumbers {

    public static void primeNumber(int n) {
        
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 20;
        primeNumber(n);
    }
}
