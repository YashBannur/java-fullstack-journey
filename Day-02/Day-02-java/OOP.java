class Student {

    int id;
    String name;
    String Class;

    public Student(int i,String n,String c){
       id = i;
       name = n;
       Class = c;   
    }

    void Display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Class: "+Class);
    }

    /*
    public static void main(String[] args) {
        Student s1 = new Student(101, "Yash", "10th");
        s1.Display();
    }   
        */ 

}



class Car{
    String brand;
    String model;
    int year;



    public Car(String b, String m, int y){
        brand = b;
        model = m;
        year = y;

    }

    void Display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}



public class OOP {
    public static void main(String[] args) {
        
    
    
    Car c = new Car("BMW", "M8", 2026);
    c.Display();

    Student s = new Student(102,"Yash","10th");
    s.Display();
    }

}
