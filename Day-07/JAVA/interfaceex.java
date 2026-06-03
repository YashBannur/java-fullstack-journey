interface Car {
    void start();
    void run();
}

class BMW implements Car {
    public void start(){
        System.out.println("The car is Starting");
    }

    public void run(){
        System.out.println("The car is running");
    }
}


public class interfaceex {
    public static void main(String[] args) {
        BMW b = new BMW();

        b.start();
        b.run();
    }
}
