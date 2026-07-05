import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        StringBuilder A = new StringBuilder(sc.nextLine());
        StringBuilder rev = new StringBuilder(A).reverse();
        System.out.println(rev.toString());
        if (A.toString().equals(rev.toString())){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Palindrome not");
        }
    }
}
