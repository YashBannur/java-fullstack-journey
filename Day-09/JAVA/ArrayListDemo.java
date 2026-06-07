import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
       ArrayList<Integer> num = new ArrayList<>();
       num.add(10);
       num.add(20);
       num.add(30);
       num.add(50);
       num.add(75);
       num.add(15);
       num.add(35);
       num.add(52);
       num.add(60);
       num.add(85);
       System.out.println(num);
       
       int max = num.get(0);
        int min = num.get(0);
       for (int i : num) {
         if (i> max) {
            max = i;
         }
       }
         System.out.println("Max number is: "+max);
         

         for (int i : num) {
            if (i<min) {
                min = i;
            }
         }
            System.out.println("Min number is: "+min);

        if (num.contains(50)) {
            System.out.println("50 is present in the list");
        } else {
            System.out.println("50 is not present in the list");
        }
    }
}
