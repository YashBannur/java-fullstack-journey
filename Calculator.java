import java.util.Scanner;
public class Calculator {
 static class Methods {
    public static int add(int a, int b){
        int result = a+b;
        return result;
    }

    public static int subtract(int a, int b){
        int result = a-b;
        return result;
    }

    public static int multiplication(int a, int b){
        int result = a*b;
        return result;
    }

    public static int division(int a, int b){
        int result = a/b;
        return result;
    }
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
           System.out.print("Enter First number: ");
           int a = sc.nextInt();
    
           System.out.print("Enter your second number: ");
           int b = sc.nextInt();
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
           System.out.println("Which operation do you want to perform: ");
           int choice = sc.nextInt();
           
           int result = 0;
           
        switch (choice) {
            case 1:
               result = Methods.add(a, b);
                break;
            case 2:
               result = Methods.subtract(a,b);
                break;

            case 3:
                result = Methods.multiplication(a,b);

                break;

            case 4:
                result = Methods.division(a,b);
                break;

            case 5:
                System.out.println("Exiting.....");
                System.exit(0);
                sc.close();
                 break;

            default:
                    System.out.println("Invalid choice! Please select a valid operation.");
                break;
            }
            System.out.println("Your Result is: " + result);
            System.out.println("-------------------------------");
        }
        
}
}