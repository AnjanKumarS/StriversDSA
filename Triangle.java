public class Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            int num = 0;
            for (int c = 1; c <= n * 2 - 1; c++) {
                if (r + c > n && c - r <= n - 1) {
                    if (c <= n * 2 / 2) {
                        num++;
                        System.out.print(num + " ");
                    }
                    else {
                        num--;
                        System.out.print(num+" ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
