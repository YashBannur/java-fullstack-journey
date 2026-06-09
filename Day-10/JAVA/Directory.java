import java.util.HashMap;
import java.util.Scanner;

public class Directory {
    public static void main(String[] args) {
//         Add Student
// Search Student
// Remove Student
// Display All Students
        HashMap<Integer,String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            
        
        System.out.println("1.Add Student");
        System.out.println("2.Search Student");
        System.out.println("3.Remove Student");
        System.out.println("4.Display All Students");
        System.out.print("Select the option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                students.put(id,name);
                
                break;

            case 2:
                System.out.print("Enter Student Id: ");
                int searchid = sc.nextInt();
                
                if (students.containsKey(searchid)){
                    System.out.println("ID: "+searchid+ "  Name: "+students.get(searchid));
                }
                else {
                    System.out.println("Student Not Found!");
                }
                break;
            case 3:
                System.out.print("Enter Student ID to Delete: ");
                int delete = sc.nextInt();

                if (students.containsKey(delete)){
                    students.remove(delete);
                    System.out.println("Student Deleted");
                }else{
                    System.out.println("Student Not Found");
                }
                break;

            case 4:
                for (Integer key : students.keySet()){
                    System.out.println("ID: "+key+ " "+"Name: "+ students.get(key));

                }
                System.out.println("=============================");
                break;

            default:
                break;
        }
    }
    }
}
