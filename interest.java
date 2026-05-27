import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        System.out.print("Please Enter Principal amount: ");
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        System.out.print("Enter Your Rate Of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the Duration in Months: ");
        double t = sc.nextDouble();

        double result = (p*t*r)/100;
        System.out.println("Your Interest on Principal: " + p + " is: "+result);
        sc.close();
    }
}
