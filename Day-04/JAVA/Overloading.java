package JAVA;

public class Overloading {

    public int area(int l ,int b, int h){
        System.out.print("Area for Rectangle is: ");
        return l*b*h;
    }

    public double area(double r){
        System.out.print("Area for circle is: ");
        return 3.14*r*r;
    }

    public int area(int h){
        System.out.print("Area for Square: ");
        return h*h;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.print(obj.area(10) + "\n");
        System.out.print(obj.area(2.5) + "\n");
        System.out.print(obj.area(25, 20, 27));
        
    }
}
