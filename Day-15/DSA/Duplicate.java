import java.util.Scanner;
import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder S = new StringBuilder(sc.nextLine());
        StringBuilder S1 = new StringBuilder(S.toString().toLowerCase());
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S1.length(); i++) {
            char ch = S1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " : " + map.get(ch));
                
            }
        }
    }
}
