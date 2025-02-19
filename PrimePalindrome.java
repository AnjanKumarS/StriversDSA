import java.util.Scanner;

public class PrimePalindrome {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        int temp=n;
        int a = 0;
        while (n > 0) {
            int r = n % 10;
            a = (a * 10) + r;
            n = n / 10;
        }
        if (temp == a) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            if (isPrime(n) && isPalindrome(n)) {
                System.out.println(n);
                break;
            }
            n++;
        }
        sc.close();
    }
}
