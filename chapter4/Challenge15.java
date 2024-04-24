
/* Chapter 4 Challenge 15- Uppercase File Converter
*/
import java.util.Scanner;
import java.io.*;

public class Challenge15 {
   public static void main(String[] args) throws IOException {
      String file1 = " ";
      String file2 = " ";

      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter the name of the first file: ");
      file1 = keyboard.nextLine();
      System.out.println("Enter the name of the second file: ");
      file2 = keyboard.nextLine();

      File file = new File(file1);
      Scanner inputFile = new Scanner(file1);

      PrintWriter outputFile = new PrintWriter(file2);

      if (file1.exists()) {
         System.out.println("Copying from file 1: ");
      } else {
         System.out.println("The file " + file1 + " is not found.");

      }

      inputFile.close();
      outputFile.close();
      keyboard.close();

   }
}