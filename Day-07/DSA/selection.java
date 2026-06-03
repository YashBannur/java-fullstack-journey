import java.util.Arrays;

public class selection {

    public static void main(String[] args) {
        
    
    int arr[] = {10,25,36,9,5,2,62};
    
    for (int i=0; i<arr.length-1;i++) {
        int minIndex = i;

        for (int j=i+1;j<arr.length;j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }

        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
}
