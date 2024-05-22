/* Chapter 4 Challenge 20 Square display
*/

import java.util.Scanner;

public class Challenge20   {
   public static void main(String[]args)  {
      
      int square = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      do{
         System.out.println("Enter a positive integer to display a square:");
         square = keyboard.nextInt();
      }while(square < 1);
      
      for(int i = 0; i < square; i ++){
         System.out.println("");
         for(int x = 0; x < square; x++){
            System.out.print("x");
         }
      
      }
      
      keyboard.close();
   
   }
}