import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private int section;

    public Student(String name, int age, int section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Section: " + section;
    }

    public String toCSV() {
        return name + "," + age + "," + section;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String fileName = "Record.txt";

        loadStudentsFromFile(fileName, students);

        while (true) {
            System.out.println("\nStudent Record System V2");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Save Students to File");
            System.out.println("6. Load Students from File");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addStudent(scanner, students);
                    break;
                case "2":
                    viewStudents(students);
                    break;
                case "3":
                    searchStudent(scanner, students);
                    break;
                case "4":
                    deleteStudent(scanner, students);
                    break;
                case "5":
                    saveStudentsToFile(fileName, students);
                    break;
                case "6":
                    loadStudentsFromFile(fileName, students);
                    break;
                case "0":
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please enter a number from 0 to 6.");
            }
        }
    }

    private static void addStudent(Scanner scanner, ArrayList<Student> students) {
        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine().trim();
            System.out.print("Enter student age: ");
            int age = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Enter student section: ");
            int section = Integer.parseInt(scanner.nextLine().trim());

            students.add(new Student(name, age, section));
            System.out.println("Student added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid age and section.");
        }
    }

    private static void viewStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\nStudent List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    private static void searchStudent(Scanner scanner, ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available to search.");
            return;
        }

        System.out.print("Enter name to search: ");
        String query = scanner.nextLine().trim().toLowerCase();
        boolean found = false;

        for (Student student : students) {
            if (student.getName().toLowerCase().contains(query)) {
                System.out.println(student);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student found with the name '" + query + "'.");
        }
    }

    private static void deleteStudent(Scanner scanner, ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available to delete.");
            return;
        }

        viewStudents(students);
        System.out.print("Enter the number of the student to delete: ");

        try {
            int index = Integer.parseInt(scanner.nextLine().trim()) - 1;
            if (index < 0 || index >= students.size()) {
                System.out.println("Invalid student number.");
                return;
            }
            Student removed = students.remove(index);
            System.out.println("Removed: " + removed.getName());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid student number.");
        }
    }

    private static void saveStudentsToFile(String fileName, ArrayList<Student> students) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Student student : students) {
                writer.write(student.toCSV() + System.lineSeparator());
            }
            System.out.println("Students saved to " + fileName + ".");
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    private static void loadStudentsFromFile(String fileName, ArrayList<Student> students) {
        students.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    int section = Integer.parseInt(parts[2].trim());
                    students.add(new Student(name, age, section));
                }
            }
            System.out.println("Loaded " + students.size() + " student(s) from " + fileName + ".");
        } catch (IOException e) {
            System.out.println("No saved file found. Starting with an empty student list.");
        } catch (NumberFormatException e) {
            System.out.println("Saved file contains invalid data. Please check " + fileName + ".");
        }
    }
}
