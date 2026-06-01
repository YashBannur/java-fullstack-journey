import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        

        int arr[] = {10,25,36,9,5,2,62};
        System.out.println("Original Array: "+Arrays.toString(arr));
        for (int i=0; i<arr.length-1;i++){

            int maxIndex = i;

            for (int j=i+1; j<arr.length;j++){

                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }
}
