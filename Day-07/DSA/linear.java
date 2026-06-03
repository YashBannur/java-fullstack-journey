

public class linear {
    public static void main(String[] args) {
        int arr[] = {10,25,1,26,39,12,8,6};
        int target = 26;
        int result = 0;
        boolean found  = false;
        for (int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                result = i;
                found = true;
                break;
            }
        }
        System.out.println("The target number found at the index: "+ result);
    }
}
