public class SumOfNInteger {

    static void sumofint(int n,int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sumofint(n-1, sum);
    }
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        sumofint(n,sum);
    }
}
