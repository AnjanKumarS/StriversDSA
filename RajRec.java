public class RajRec {

    static void pri(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Raj");
        pri(n - 1);
    }
    public static void main(String[] args) {
        pri(4);
    }
}
