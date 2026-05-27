public class Fibanocci {
    public static void main(String[] args) {
        int n = 10;
        int first = 0;
        int second = 1;
        int next;

        for (int i=0; i<=n; i++) {
            System.out.print(first +", ");
            next = first+second;
            first = second;
            second = next;
        }
    }
}
