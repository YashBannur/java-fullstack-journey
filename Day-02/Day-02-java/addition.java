import java.util.Scanner;

class addition {

    static int add (int a ,int b){
        return a+b;
    }



    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Two Numbers to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("Result is: " + add(a, b));

    }
}