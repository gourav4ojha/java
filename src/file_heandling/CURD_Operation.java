package file_heandling;
import java.io.*;

public class CURD_Operation {

    static String filePath = "example.txt";

    // CREATE FILE
    public static void createFile() {
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // WRITE TO FILE
    public static void writeFile() {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("Hello, this is the initial content.\n");
            writer.write("Java File CRUD operations.\n");
            writer.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // READ FROM FILE
    public static void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // UPDATE FILE (APPEND DATA)
    public static void updateFile() {
        try {
            FileWriter writer = new FileWriter(filePath, true); // true = append mode
            writer.write("This line is added during update.\n");
            writer.close();
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // DELETE FILE
    public static void deleteFile() {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void main(String[] args) {

        createFile();   // Create
        writeFile();    // Write
        readFile();     // Read
        updateFile();   // Update
        readFile();     // Read again after update
        // deleteFile(); // Uncomment to delete the file
    }
}
