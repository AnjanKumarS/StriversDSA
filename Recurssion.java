public class Recurssion {

    static void num(int n) {
        if (n==0) {
            return;
        }
        System.out.println(n);
        num(n - 1);
    }
    public static void main(String[] args) {
        num(3);
    }
}
