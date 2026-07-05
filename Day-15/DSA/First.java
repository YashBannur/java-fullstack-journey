import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        char result = firstNonRepeatingChar(s);
        if (result == '\0') {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }

    private static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}
