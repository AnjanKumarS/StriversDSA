public class Encryption {
    public static void main(String[] args) {
        int arr[] = { 16, 18, 15, 7, 18, 1 };
        int n = 6;
        int e = 7;
        int mod = 26;

        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int m = arr[i];
            int c = (int) (Math.pow(m, e) % mod);

            char encryptedChar = (char) (c + 'a' - 1);
            encryptedMessage.append(encryptedChar);
        }
        System.out.println(encryptedMessage.toString());
    }
}
