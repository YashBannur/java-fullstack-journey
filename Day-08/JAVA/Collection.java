import java.util.ArrayList;

class Collection {
    public static void main(String[] args) {
        // Code for collection


        ArrayList<String> students = new ArrayList<>();

        //Store 5 student names in an ArrayList
        students.add("Yash");
        students.add("Yashu");
        students.add("Rashmi");
        students.add("Nisuu");
        students.add("Shekar");
        System.out.println(students);

        //Add, remove, and display elements
        students.add("Kruthika");
        System.out.println(students);

        //remove
        students.remove(5);
        System.out.println(students);
        //check
       System.out.println(students.get(3)); 
        
        //display
       System.out.println(students.contains("Nisuu"));


    }
}