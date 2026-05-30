package JAVA;
import java.util.Arrays;

class Bubble{
    public static void main(String[] args) {
        int arr [] = {10,24,9,8,26,1,35,7};
        int temp;
        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr [j];
                    arr[j] = temp;
                }
            }
        }

       System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}