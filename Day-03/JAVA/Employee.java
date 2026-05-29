package JAVA;
public class Employee {
    int id;
    String name;
    String department;
    float salary;


    Employee(int id, String name, String department, float salary){

        this.id = id;
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("ID: " + id);
        System.out.println("Department: "+department);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee(1,"Yash", "IT", 100000);
        e.display();
    }
}
