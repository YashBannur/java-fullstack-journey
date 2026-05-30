package JAVA;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {9,10,15,5,25,6,4,30};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int temp;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}