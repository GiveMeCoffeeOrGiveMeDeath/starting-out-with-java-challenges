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
      String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
      
      Random rand = new Random();
      int numRand = rand.nextInt(5);
      machineColor = colors[numRand];
      
      //System.out.println(machineColor);
      
      
      System.out.println("ESP (extrasensory perception) program: ");
      System.out.println("Enter one of the option: Red, Green, Blue, Orange, Yellow \nto try guess the one already pick");
      
      for(int i = 0; i < 10; i++){
         
         userColor = keyboard.nextLine();
         userColor = userColor.substring(0, 1).toUpperCase() + userColor.substring(1).toLowerCase();
         ++total;
         
         if(userColor.equals(machineColor)){
           System.out.println("You have a strong ESP with: " + total + " Tries guessing color "+ userColor);
           break;
         }else{
            System.out.println("Try again:");
         }
      }
      
      System.out.println("You still need to train your ESP.");
   
   }  
}