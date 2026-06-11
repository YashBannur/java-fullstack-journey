import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        java.lang.String input = sc.nextLine();

        Map<Character, Integer> frequencyMap = countFrequency(input);
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }

    private static Map<Character, Integer> countFrequency(java.lang.String text) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap;
    }
}
