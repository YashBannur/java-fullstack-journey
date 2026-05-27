public class Palindrome {
    public static void main(String[] args) {
        int num = 450;
        int reversedNum = 0;
        int original = num;

        while (num > 0) {
            int remainder = num % 10;
            reversedNum = reversedNum *10 + remainder;
            num = num/10;
        }

        if (reversedNum == original) {
            System.out.println("The number is Palindrome");
        } else {
            System.out.println("The number is not Palindrome");
        }
    }
}
