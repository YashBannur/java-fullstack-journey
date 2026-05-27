public class Reverse {
    public static void main(String[] args) {
        int num = 56897423;
        int reversed = 0;

        while (num>0){
            int remainder = num %10;
            reversed = reversed *10 + remainder;
            num = num/10;
        }
        System.out.println("Reversed Number is: " + reversed);
    }
}
