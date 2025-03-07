import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepetingChar {

    static char nonRepeatingChar(String s) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
     
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
         for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "HelloWorld";
        System.out.println(nonRepeatingChar(s));
    }
}
