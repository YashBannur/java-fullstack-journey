import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
//Print all keys
// Print all values
// Print both key and value
// Find if a student ID exists
        int target = 101;
HashMap<Integer,String> students = new HashMap<>();

        students.put(101, "Yash");
        students.put(102, "Yashu");
        students.put(103, "Nisuu");
        students.put(104, "Rashmi");

        for (Integer key : students.keySet()){
            //Print all keys
            System.out.println("Key: "+key);

            // Print all values
            System.out.println("Value: "+ students.get(key));
        }

        for (HashMap.Entry<Integer,String> entry: students.entrySet()) {
            // Print both key and value
            System.out.println("ID: "+entry.getKey() +"->"+"Name: "+entry.getValue());
        }

        // Find if a student ID exists
        if (students.containsKey(target)){
            System.out.println("Student Found:"+target);
            System.out.println(students.get(target));
        }
    }
}