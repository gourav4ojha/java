
package file_heandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class write_to_file {

   public static void main(String args[]) {
   
      try {
         byte bWrite [] = {65, 66, 67, 68, 69};
         OutputStream os = new FileOutputStream("/Users/gourav/eclipse-workspace/practice_model_test/src/file_heandling/text.txt");
         for(int x = 0; x < bWrite.length ; x++) {
            os.write( bWrite[x] );   // writes the bytes
         }
         os.close();
     
         InputStream is = new FileInputStream("/Users/gourav/eclipse-workspace/practice_model_test/src/file_heandling/text.txt");
         int size = is.available();

         for(int i = 0; i < size; i++) {
            System.out.print((char)is.read() + "  ");
         }
         is.close();
      } catch (IOException e) {
         System.out.print("Exception");
      }	
   }
}