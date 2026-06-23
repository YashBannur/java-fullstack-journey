public class Palindrome {
    public static void main(String[] args) {
        String text = "kadam";
        int left = 0;
        int right = text.length()-1;
        boolean palindrome = true;

        while (left < right){
            if (text.charAt(left) != text.charAt(right)) {
                palindrome = false;
            }

            left++;
            right--;
        }

        if(palindrome){
            System.out.println(text+" is Palindrome");
        }
        else {
            System.out.println(text+" is not palindrome");
        }
        
    }
}
