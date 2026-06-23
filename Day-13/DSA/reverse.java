class reverse{
    public static void main(String[] args) {
        String arr[] = {"h","e","l","o"};
        int left = 0;
        int right = arr.length-1;

        while (left<right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(String s : arr) {
            System.out.print(s);
        }
    }
}