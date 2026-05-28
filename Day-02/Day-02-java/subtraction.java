import java.util.Scanner;

public class subtraction {
    
    static int sub (int a ,int b){
        return a-b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers subtract: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Your Result is: "+sub(a, b));
    }
}
