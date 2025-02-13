public class MaxContiniousOnes {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 1};
        int c = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c++;
            } else {
                if (c > max) {
                    max = c;
                }
                c = 0;
            }
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
