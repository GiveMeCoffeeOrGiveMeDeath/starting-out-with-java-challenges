import java.util.Scanner;
import java.io.*;

/* Chapter 4 challenge 6

*/
public class Challenge6 {
   public static void main(String[]args) throws IOException {
      //declaring variables
      String fileName = " ";
      char fileChar = ' ';
      int count = 0;
      
      //decalring the scanner object and file
      Scanner keyboard = new Scanner(System.in);
      
      //output info to enter correct input
      System.out.println("Enter the name of the file to open: ");
      fileName = keyboard.nextLine();
      System.out.println("Enter the character to get a count from file: ");
      fileChar = keyboard.next().toLowerCase().charAt(0);
      
      
      File file = new File("fileName.txt");
      
      if(file.exists()){
         //declaring the file reader object
         Scanner inputFile = new Scanner(new File(fileName));
      
         while(inputFile.hasNext()) {
         
            String text = inputFile.nextLine().toLowerCase();
            for(int i = 0; i < text.length(); i++){
               if(text.charAt(i) == fileChar){
                  count++;
               }
            }
         
         }
      }else{
         System.out.println("The file " + fileName + " is not found.");
         }
      
      System.out.println("Number of occurrences of charecter on the file '" + fileChar + "': " + count);
      
   }
}