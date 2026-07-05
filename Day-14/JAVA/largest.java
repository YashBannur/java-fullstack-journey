import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c){
            System.out.println("All numbers are equal");
        }
        else if(a>b && a>c){
            System.out.println("Largest number is: "+a);
        }else if(b>a && b>c){
            System.out.println("Largest number is: "+b);
        }else{
            System.out.println("Largest number is: "+c);
        }

    }
}
