/*chapter 4 challenge 19
*/

import java.util.Scanner;
import java.util.Random;

public class Challenge19   {
   public static void main(String[]args)  {
   
      Scanner keyboard = new Scanner(System.in);
      String machineColor = " ";
      String userColor = " ";
      int total = 0;
      
      Random rand = new Random();
      int numRand = rand.nextInt(5);
      
      String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
      
      System.out.println("ESP (extrasensory perception) program: ");
      Syestem.out.println("Enter one of the option: Red, Green, Blue, Orange, Yellow \nto try guess the one already pick");
      
      for(int i = 0; i < 10; i++){
         
         userColor = keyboard.nextLine();
         
         if(userColor == colors[numRand]){
         
         }   
      }
   
   }  
}