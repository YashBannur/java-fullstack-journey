

public class finall {
    public static void main(String[] args) {
        int rr[] = {1,2,5,4,8,9};

        try {
            System.out.println(rr[7]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This is finally block of code ");
        }
    }
}
