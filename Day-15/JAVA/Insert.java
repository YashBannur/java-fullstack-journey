import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter A String: ");
        StringBuilder S = new StringBuilder(sc.nextLine());
        S.insert(5, " Java");
        System.out.println(S.toString());
    }
}
