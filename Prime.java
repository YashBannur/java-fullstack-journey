class Prime{
    public static void main(String[] args) {
        boolean isPrime = true;
        int num = 29;

       for (int i=2 ; i<=num/2 ; i++){
        if (num % i == 0){
            isPrime = false;
        }
       }
       if (isPrime){
        System.out.print("The number is Prime");
       } else {
        System.out.println("The number is not Prime");
       }
            
    }
}