public class Student {
     int id;
     String name;
     String class1;

    public Student(int id,String name, String class1){

        this.id = id;
        this.name = name;
        this.class1 = class1;

        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Class: " + class1);
    }


    public static void main(String[] args) {
        Student s = new Student(1, "Yash", "10th");
        
    }
    
}