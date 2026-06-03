import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String name;
    String author;
    int year;

    Book(int id,String name,String author,int year){
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("Year of Published: "+ year);
    }
}

public class Library {
    public static void main(String[] args) {
        ArrayList <Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            
        
            System.out.println("1.Add Book");
            System.out.println("2.View All Books");
            System.out.println("3.Search By Book ID");
            System.out.println("4.Remove Book");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Book Published Year: ");
                    int year = sc.nextInt();
                    Book book = new Book(id,name,author,year);
                    books.add(book);
                    break;
                

                case 2:
                    for (Book Book : books) {
                        Book.display();
                        System.out.println("======================");
                    }

                    break;


                case 3:
                System.out.print("Enter Book ID to Search: ");
                int searchId = sc.nextInt();
                boolean found = false;
                for (Book Book : books) {
                    if (Book.id == searchId) {
                        Book.display();
                        found = true;
                        break;
                    }
                }
                if (found) {
                    System.out.println("Book found.");
                } else {
                    System.out.println("Book not found.");
                }
                System.out.println("======================");
                break;


                case 4:
                //help me to remove book by id
                System.out.print("Enter Book ID to Remove: ");
                int removeId = sc.nextInt();
                boolean removed = false;
                for (Book Book : books) {
                    if (Book.id == removeId) {
                        books.remove(Book);
                        removed = true;
                        System.out.println("Book removed successfully.");
                        break;
                    }
                }
                if (!removed) {
                    System.out.println("Book not found.");
                }
                

                default:
                    break;
            }

        }
    }
}
