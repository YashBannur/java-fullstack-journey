public class Words {
    public static void main(String[] args) {
        String a = "Hello Students how are you there";
        int left = 0;
        int count = 1;
        while (left<a.length()){
            if (a.charAt(left) == ' ') {
                count++;
            }
            left++;
        }

        System.out.println(count);

    }
}
