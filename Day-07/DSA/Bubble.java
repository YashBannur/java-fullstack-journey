import java.util.Arrays;

public class Bubble {
    

    public static void main(String[] args) {
        int arr[] = {10,15,6,12,14,18,7,3};
        int temp;
        for (int i=0;i<arr.length-1;i++) {
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
}
