import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder S = new StringBuilder(sc.nextLine());
        System.out.print(S.delete(1, 3));
    }
}
