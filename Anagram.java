import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char arr1[] = s1.toLowerCase().toCharArray();
        char arr2[] = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String s1 = "greek";
        String s2 = "keegr";
        System.out.println(isAnagram(s1,s2)?"Anagram":"Not a Anagram");
    }
}
