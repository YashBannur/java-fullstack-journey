import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        // Add Note
        // View Notes
        // Exit

        File file = new File("Student.txt");
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1.Add Note");
            System.out.println("2.View Notes");
            System.out.println("3.Exit");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Text: ");
                    String text = scanner.nextLine();

                    try (FileWriter writer = new FileWriter("Student.txt", true)) {
                        writer.write(text + System.lineSeparator());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:
                    try (BufferedReader br = new BufferedReader(new FileReader("Student.txt"))) {
                        String line;
                        System.out.println("============================");
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                        System.out.println("===========================");
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
