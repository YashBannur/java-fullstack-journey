import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        File obj = new File("hi.txt");
        System.out.println("File created");
        System.out.println(obj.getAbsolutePath());


//         Create a file
// Write data to a file
// Read data from a file
// Append data to a file

        try {
            FileWriter writer = new FileWriter("hi.txt");
            writer.write("Yash\n");
            writer.write("Java\n");

            writer.close();
            System.out.println("Data Entered");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

       

        try {
            FileWriter writer = new FileWriter("hi.txt", true);
            writer.write("\nName:Yash");
            writer.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


         try {
            BufferedReader br = new BufferedReader(new FileReader("hi.txt"));
            String line;

            while((line = br.readLine()) != null){ 
                System.out.println(line);
            }
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}