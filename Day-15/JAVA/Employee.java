import java.io.*;
import java.util.*;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Department: %s, Salary: %.2f", id, name, department, salary);
    }

    public String toDataString() {
        return id + "|" + name + "|" + department + "|" + salary;
    }

    public static Employee fromDataString(String line) throws IllegalArgumentException {
        String[] parts = line.split("\\|");
        if (parts.length != 4) {
            throw new IllegalArgumentException("Invalid employee record: " + line);
        }
        int id = Integer.parseInt(parts[0].trim());
        String name = parts[1].trim();
        String department = parts[2].trim();
        double salary = Double.parseDouble(parts[3].trim());
        return new Employee(id, name, department, salary);
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.run();
    }

    private static class EmployeeManager {
        private final List<Employee> employees = new ArrayList<>();
        private final File dataFile = new File("employees.txt");

        public void run() {
            Scanner sc = new Scanner(System.in);
            loadFromFile();

            while (true) {
                printMenu();
                System.out.print("Choose option: ");
                String option = sc.nextLine().trim();

                switch (option) {
                    case "1" -> addEmployee(sc);
                    case "2" -> viewEmployees();
                    case "3" -> searchEmployeeById(sc);
                    case "4" -> deleteEmployeeById(sc);
                    case "5" -> saveToFile();
                    case "6" -> loadFromFile();
                    case "0" -> {
                        System.out.println("Exiting program.");
                        sc.close();
                        return;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
                System.out.println();
            }
        }

        private void printMenu() {
            System.out.println("=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee");
            System.out.println("5. Save Employees to File");
            System.out.println("6. Load Employees from File");
            System.out.println("0. Exit");
        }

        private void addEmployee(Scanner sc) {
            try {
                System.out.print("Enter employee ID: ");
                int id = Integer.parseInt(sc.nextLine().trim());
                if (findById(id) != null) {
                    System.out.println("Employee with this ID already exists.");
                    return;
                }

                System.out.print("Enter employee name: ");
                String name = sc.nextLine().trim();
                System.out.print("Enter department: ");
                String department = sc.nextLine().trim();
                System.out.print("Enter salary: ");
                double salary = Double.parseDouble(sc.nextLine().trim());

                Employee employee = new Employee(id, name, department, salary);
                employees.add(employee);
                System.out.println("Employee added successfully.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter valid ID and salary.");
            }
        }

        private void viewEmployees() {
            if (employees.isEmpty()) {
                System.out.println("No employees found.");
                return;
            }
            System.out.println("Employee List:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }

        private void searchEmployeeById(Scanner sc) {
            try {
                System.out.print("Enter employee ID to search: ");
                int id = Integer.parseInt(sc.nextLine().trim());
                Employee employee = findById(id);
                if (employee == null) {
                    System.out.println("Employee not found.");
                } else {
                    System.out.println(employee);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID format.");
            }
        }

        private void deleteEmployeeById(Scanner sc) {
            try {
                System.out.print("Enter employee ID to delete: ");
                int id = Integer.parseInt(sc.nextLine().trim());
                Employee employee = findById(id);
                if (employee == null) {
                    System.out.println("Employee not found.");
                } else {
                    employees.remove(employee);
                    System.out.println("Employee deleted successfully.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID format.");
            }
        }

        private Employee findById(int id) {
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    return employee;
                }
            }
            return null;
        }

        private void saveToFile() {
            try (PrintWriter writer = new PrintWriter(new FileWriter(dataFile))) {
                for (Employee employee : employees) {
                    writer.println(employee.toDataString());
                }
                System.out.println("Employees saved to " + dataFile.getName());
            } catch (IOException e) {
                System.out.println("Error saving employees: " + e.getMessage());
            }
        }

        private void loadFromFile() {
            if (!dataFile.exists()) {
                System.out.println("No saved employee file found. Starting with an empty list.");
                return;
            }
            try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
                employees.clear();
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.isBlank()) {
                        continue;
                    }
                    employees.add(Employee.fromDataString(line));
                }
                System.out.println("Loaded " + employees.size() + " employee(s) from " + dataFile.getName());
            } catch (IOException | IllegalArgumentException e) {
                System.out.println("Error loading employees: " + e.getMessage());
            }
        }
    }
}
