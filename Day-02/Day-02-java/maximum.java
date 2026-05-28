import java.util.Scanner;

public class maximum {
    static int result;


    static int max(int a , int b){
        if (a>b){
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Two numbers: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         sc.close();
         System.out.println("Maximum among two numbers is: " +max(a, b));
    }
}