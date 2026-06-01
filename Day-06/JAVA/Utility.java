class Math{

    static int square(int n){
        return n*n;
    }

    static int area(int n){
        return 2*n;
    }

}

public class Utility {
    public static void main(String[] args) {
        System.out.println("Square of 2 is: "+Math.square(2));
        System.out.println("Area of Square is: "+Math.area(10));
    }
}
