import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;

    Student(int id,String name,String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("-----------------------------");
    }
}

public class SRM {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
      while (true) {
        System.out.println("1.Add Student");
        System.out.println("2.Show All Students");
        System.out.println("3.Search Student");
        System.out.println("4.Delete Student");
        System.out.print("Enter  your choice: ");
        int choice = sc.nextInt();
        System.out.println("-----------------------------");

        switch (choice) {
            case 1:
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Student Course: ");
                String course = sc.nextLine();
                students.add(new Student(id,name,course));
                break;
            
            case 2:
                if (students.isEmpty()){
                    System.out.println("No students to display");
                } else {
                    for (Student s : students){
                        s.display();
                    }
                }
                break;

            case 3:
                System.out.print("Enter ID of Student You want to search: ");
                int searchid = sc.nextInt();

                for (Student s : students){
                    if (s.id == searchid){
                        s.display();
                    }
                }
                break;

            case 4:
                System.out.print("Enter ID of student you want to delete: ");
                int delete = sc.nextInt();
                students.remove(delete);
            default:
                break;

         }
        }
    }
}
