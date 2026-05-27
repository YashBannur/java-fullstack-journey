import java.util.Scanner;

public class temperature {
    static class Methods{
         public static double ctof(double a){
            double result = (a*9/5)+32;
            return result;
         }

         public static double ftoc(double a){
            double result = (a*5/9)-32;
            return result;
         }

         public static double ctok(double a){
            double result = a+273.15;
            return result;
         }

         public static double ktoc(double a){
            double result = a-273.15;
            return result;
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature you want to convert: ");
        double a = sc.nextDouble();
        System.out.println("Which Conversion You Want");
        System.out.println("1.Celsius To Farhenheit");
        System.out.println("2.Farhenheit To Celsius");
        System.out.println("3.Celsius To Kelvin");
        System.out.println("4.Kelvin To Celsius");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.close();
        double result = 0;
        switch(choice){
            case 1:
             result = Methods.ctof(a);
            break;

            case 2:
            result = Methods.ftoc(a);
            break;

            case 3:
            result = Methods.ctok(a);
            break;

            case 4:
            result = Methods.ktoc(a);
            break;

            default:
            System.out.println("Invalid Choice");

        }
        System.out.println("Your Converted Temperature is: " + result);
    }
}
