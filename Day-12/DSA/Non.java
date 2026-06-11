import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Non {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int firstNonRepeating = findFirstNonRepeating(arr);
        if (firstNonRepeating == Integer.MIN_VALUE) {
            System.out.println("No non-repeating element found.");
        } else {
            System.out.println("First non-repeating element: " + firstNonRepeating);
        }

        sc.close();
    }

    private static int findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Integer.MIN_VALUE;
    }
}
