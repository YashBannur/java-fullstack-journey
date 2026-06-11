

public class Index {
    public static void main(String[] args) {
         int arr[] = {1,2,5,6,8,9};

         try {
            System.out.println(arr[7]);
         }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
         }
    }
}
