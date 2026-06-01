import java.util.ArrayList;
import java.util.Scanner;

class Student{

    int id;
    String name;
    String course;


    Student(int id, String name, String course ){
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

public class Management {
 
    public static void main(String[] args) {
        ArrayList <Student> students = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("=====================");
        System.out.println("1.Add Student");
        System.out.println("2.Show All Students");
        System.out.println("3.Search Student by ID: ");
        System.out.println("4.Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
           
            System.out.println("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Student course: ");
            String course = sc.nextLine();
            Student s = new Student(id, name, course);
            students.add(s);

            break;

            case 2:

            for (Student student : students) {
                student.display();
                System.out.println("=====================");
            }

            break;

            case 3:
            System.out.println("Enter Student ID to search: ");
            int searchId = sc.nextInt();
            boolean found = false;
            for (Student student : students) {
                if (student.id == searchId) {
                    student.display();
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Student found.");
            } else {
                System.out.println("Student not found.");
            }
            
            break;
        }
    }
}
}
