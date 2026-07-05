import java.io.*;
import java.util.*;

public class StringProgram {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String A = sc.nextLine();
        System.out.print("Enter String 2: ");
        String B = sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        int lengtha = A.length();
        int lengthb = B.length();
        int result = lengtha+lengthb;
        System.out.println(result);
        if(A.compareTo(B) >0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String result1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String result2 = B.substring(0,1).toUpperCase() + B.substring(1);
        String result3 = result1+" "+result2;
        System.out.println(result3);
        
    }
}
