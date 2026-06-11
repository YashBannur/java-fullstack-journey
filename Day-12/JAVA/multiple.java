

public class multiple {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6};
        int a = 10;
        int b = 0;

        try {
            System.out.println(a/b);
            System.out.println(arr[5]);

            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
