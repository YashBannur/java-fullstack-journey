class majority {
    public static void main(String[] args) {
        
        int arr[] = {2,2,1,1,1,2,2};
        int count = 0;
        int element = 0;
        for(int i=0; i<arr.length; i++){
            if(count == 0){
                element = arr[i];
            }
            if(element == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(element);
        System.out.println(count);
    }
}