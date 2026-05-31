 abstract class  Vehicle1 {
    public abstract void Start();

    public void moving(){
        System.out.println("Vehicle is moving ");
    }
}

class car extends Vehicle1 {
    public void Start(){
        System.out.println("Car is Starting");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        car c = new car();
        c.Start();
        c.moving();
    }
}