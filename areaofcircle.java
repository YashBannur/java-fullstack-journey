import java.util.Scanner;
public class areaofcircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the circle: ");
        double r = sc.nextDouble();
        double result = Math.PI*r*r;
        System.out.printf("Area of the Circle is: %.2f",result);
        sc.close();
    }

    
}
