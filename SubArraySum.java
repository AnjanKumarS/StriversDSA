class SubArraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int t = 12;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == t) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}