import java.util.HashMap;

public class Student {
    public static void main(String[] args) {
//         Store student ID and name
// Search student by ID
// Check if a key exists
// Print all keys

HashMap<Integer,String> students = new HashMap<>();

        students.put(101, "Yash");
        students.put(102, "Yashu");
        students.put(103, "Rashmi");

        int search = 101;

        for (Integer key : students.keySet()) {

            if (search == key) {
                System.out.println("Found student: ID: " + key + ", Name: " + students.get(key));
            }
           else {
            System.out.println("Student not found");
           }
           break;
        }

        students.containsKey(105);

         for (Integer key : students.keySet()) {
            System.out.println("ID: "+ key);
         }
    }

}