public class minimum {
    public static void main(String[] args) {
        int arr[] = {10,25,14,63,1,14};
        int min =arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element is: "+ min);
    }
}
