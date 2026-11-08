// Experiment 7: File operations - create, write and read a text file
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileOperationsDemo {
    public static void main(String[] args) {
        String fileName = "student.txt";

        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Student Name: Ravi\n");
                writer.write("Department: CSE\n");
                writer.write("Year: Third Year\n");
            }
            System.out.println("Data written successfully.");

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                System.out.println("File contents:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
