import java.util.Scanner;

public class Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        StringBuilder A = new StringBuilder(sc.nextLine());
        System.out.print("Enter Second String: ");
        StringBuilder B = new StringBuilder(sc.nextLine());
        A.append(B);
        System.out.println(A.toString());

    }
}
