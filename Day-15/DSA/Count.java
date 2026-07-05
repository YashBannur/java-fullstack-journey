import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        HashMap<Character ,Integer> hs = new HashMap<>();
        List<Character> toRemove = new ArrayList<>();
        int n = s.length();
        for (int i=0; i<n;i++) {
            char c = s.charAt(i);
            if (hs.containsKey(c)){
                hs.put(c, hs.get(c)+1);
            } else {
                hs.put(c, 1);
            }
        }

        for (Character c : hs.keySet()){
            System.out.println(c + " : " + hs.get(c));
        }
        //there is some error fix it 
        for (Character c : hs.keySet()){
            if (hs.get(c) > 1){
                toRemove.add(c);
            }
        }

        for (Character c : toRemove){
            hs.remove(c);
        }
        System.out.println("After removing duplicates: " + hs);
        System.out.println(s);
    }
}
