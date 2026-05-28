public class linear {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int value = 6;

        boolean found = false;
        int index = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == value){
                found = true;
                index = i;
            }
        }
        if(found){
        System.out.println("Value found at the index: " + index);
        }
        else {
            System.out.println("value not found");
        }

    }
}
