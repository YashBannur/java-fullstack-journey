import java.util.Arrays;
public class largest {
    public static void main(String[] args) {
       /*  int arr[] = {10, 20, 5, 30, 15};
        int n = arr.length;
        int largest = arr[0];

        for (int i=0; i<n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest: "+largest);
        */

        /* 
        int arr[] = {10, 20, 5, 30, 15};
        int i = 0;
        int n = arr.length;
         int sum = 0;
         while (i<n) {
            sum = sum + arr[i];
            i++;
         }
        System.out.println("Sum of an Array: " + sum);
        
        */

         int arr[] = {10, 20, 5, 30, 15};
         int temp;
         int i = 0;
         int j = arr.length-1;
         while (i <j) {
            temp = arr[i];
            arr[i] = arr[j];
            i++;
            j--;

         }
            System.out.println("Reversed Array: " + Arrays.toString(arr));

    }
}
