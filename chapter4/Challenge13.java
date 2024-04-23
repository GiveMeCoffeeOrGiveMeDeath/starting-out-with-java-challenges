/*   Chapter 4- Challenge 13 File head display                                                                                                                                                                                                                                                                                                                     

*/

import java.util.Scanner;
import java.io.*;

public class Challenge13   {
   public static void main(String[]args) throws IOException {
   
      String fileName = " ";
      int num = 0;
   
      Scanner keyboard = new Scanner(System.in);
      
      //output info to enter correct input
      System.out.println("Enter the name of the file to open: ");
      fileName = keyboard.nextLine(); 
      
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);
            
      if(file.exists()){
         System.out.println("Didplay file content line 1-5: ");
         
         
         while(inputFile.hasNext() && num < 5){
            String line = inputFile.nextLine();
            System.out.println(line);
            num++;
         }
         
      }else{
         System.out.println("The file " + fileName + " is not found.");
      }
      
      System.out.println("Ene of file.");
      
      inputFile.close();
      keyboard.close();
   }
}