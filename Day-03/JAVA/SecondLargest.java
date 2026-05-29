package JAVA;

public class SecondLargest {
    public static void main(String[] args) {
        


        int arr[] = {10,25,26,35,84,12,56,92,75,77};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }else if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }
            System.out.println("Largest Number Is: "+ largest);
            System.out.println("Second Largest Is: "+ second);
        


    }
}
