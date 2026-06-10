import java.util.HashMap;
import java.util.Scanner;

public class SRS {
    public static void main(String[] args) {
        HashMap<Integer,Integer> marks = new HashMap<>();
        marks.put(101, 85);
        marks.put(102, 62);
        marks.put(103, 52);
        marks.put(104, 89);
        marks.put(105, 95);
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Add Student Marks
            // Search Marks
            // Update Marks
            // Delete Student
            // Display All Records
            System.out.println("1.Add Student");
            System.out.println("2.Search Marks");
            System.out.println("3.Update Marks");
            System.out.println("4.Delete Student");
            System.out.println("5.Display All Records");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    int mark = sc.nextInt();
                    marks.put(id, mark);
                    break;
                case 2:
                    System.out.print("Enter Id to search marks: ");
                    int search = sc.nextInt();
                    if (marks.containsKey(search)){
                        System.out.println("ID: "+search+"->"+"Marks: "+marks.get(search));
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to Update Marks: ");
                    int upid = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    int upmark = sc.nextInt();

                    marks.put(upid, upmark);
                    break;

                case 4:
                    System.out.print("Enter ID to Delete: ");
                    int del = sc.nextInt();
                    if (marks.containsKey(del)) {
                        marks.remove(del);
                        System.out.println("Record deleted for ID: " + del);
                    } else {
                        System.out.println("ID not found.");
                    }
                    break;

                case 5:
                    for(HashMap.Entry<Integer,Integer> entry : marks.entrySet() ) {
                        System.out.println("ID: "+entry.getKey()+"  Marks: "+entry.getValue());
                    }
                default:
                    break;
            }
        }
    }
}
