class main {
    int a = 10;

    main() {
        System.out.println("The number is: "+ a);

    }
    void display(){
        System.out.println("Hello from method");
    }
}

public class constructor {
    public static void main(String[] args) {
        main m = new main();
        m.display();
    }
}
