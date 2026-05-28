import java.util.Scanner;

public class evenodd {
  

    static int evenOdd(int a){
        if (a % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("the number is odd");
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd: ");
        int a = sc.nextInt();
        sc.close();
        evenOdd(a);
    }
}
