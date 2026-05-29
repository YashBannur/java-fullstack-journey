package JAVA;
class Binary {
    public static void main(String[] args) {
        int arr[] = new int [100];
        int target = 56;

        int low = 0;
        int high = arr.length-1;


        for (int i=0;i<arr.length;i++){
            arr[i] = i;
        }

        int result = -1;
        while(low<=high){
            int mid = (low+high)/2;

            if (arr[mid] == target){
                result = mid;
                break;
             } else if(target>arr[mid]) {
                low = mid+1;

            } else {
                high = mid-1;
            }
        }
        if (result == -1) {
            System.out.println("Target not found in the array.");
        }
        else {
            System.out.println("Target found at index: " + result);
        }
    }
}