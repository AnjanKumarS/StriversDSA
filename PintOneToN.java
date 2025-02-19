public class PintOneToN {

    static void number(int a,int n){
        if (a > n) {
            return;
        }
        System.out.println(a);
        number(a + 1, n);
    }
    public static void main(String[] args) {
        int n = 10;
        number(1, n);
    }
}
