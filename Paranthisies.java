import java.util.Arrays;

public class Paranthisies {
    public static void main(String[] args) {
        String str = "[{()}]";
        int n = str.length();
        char arr1[] = new char[n / 2];
        char arr2[] = new char[n / 2];
        int i = 0, j = 0;
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                arr1[i++] = c;
            } else if (c == ')' || c == '}' || c == ']') {
                arr2[j++] = c;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int h = 0;
        for (int k = arr1.length; i > 0; i--) {
            if (arr1[k] == '(' && arr2[h] == ')') {
            }
        }
    }
}
