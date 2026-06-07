import java.util.ArrayList;
class Student {
    int id;
    String name;
    String course;

    Student(int id, String name,String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
    }
}
class foreach {
    public static void main(String[] args) {
        
        ArrayList <Student> students = new ArrayList<>();

        students.add(new Student(1, "Yash", "Java"));
        students.add(new Student(2, "Yashu", "HTML"));
        students.add(new Student(3, "Rashmi", "React"));

        for (Student student : students ) {
            System.out.println("===============");
            student.display();

        }
         
    }
}