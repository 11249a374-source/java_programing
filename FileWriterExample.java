import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("output.txt")) {

            writer.write("Hello World!\n");
            writer.write("Welcome to Java FileWriter.\n");
            writer.write("This is a file handling example.");

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
