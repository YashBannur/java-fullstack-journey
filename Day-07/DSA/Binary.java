public class Binary {
    public static void main(String[] args) {
        int arr[] = {10,12,13,15,18,25,35,62,89};
        int target = 25;
        int low = 0;
        int high = arr.length-1;
        
        int result = -1;
       while (low <= high) {
        int mid = (low+high)/2;
        if (arr[mid] == target) {
           result = mid;
           break;
        }
        else if(target>arr[mid]){
            low = mid+1;
        }
        else {
            high = mid-1;
        }
       }
       System.out.println("The target found at the index of: "+result);
    }
}
