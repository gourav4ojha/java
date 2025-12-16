package file_heandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class create_new_file {

   public static void main(String args[]) {
   
      try {
          File file = new File("/Users/gourav/eclipse-workspace/practice_model_test/src/file_heandling/text.txt");
          
          //Create the file
          if (file.createNewFile()) { 
             System.out.println("File is created!");
          } else {
             System.out.println("File already exists.");
          } 
          
          // Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data");
          writer.close();
          
          
          // read content
          FileReader reader = new FileReader(file);
          
          int c;
          while ((c = reader.read()) != -1) {
        	  char ch = (char) c;
              System.out.print(ch);
          }
      } catch (IOException e) {
         System.out.print("Exception");
      }	
   }
}