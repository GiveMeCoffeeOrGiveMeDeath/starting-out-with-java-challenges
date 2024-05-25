/* Chapter 4 challenge 17*/

import java.util.Scanner;
import java.util.Random;

public class Challenge17   {
   public static void main(String[]args)  {
      
      int numGuess = 0;
      
      Random rand = new Random();

      int numRandom = rand.nextInt(100) + 1;
      
      Scanner keyboard = new Scanner(System.in);
      
      while(numGuess != numRandom)  {
         
         System.out.println("Enter the number to guess the random number.");
         numGuess = keyboard.nextInt();
         
         if(numGuess < numRandom){
            System.out.println("Too Low");
         
         }else if(numGuess > numRandom){
            System.out.println("Too High");
         
         }else{
            System.out.println("Congrats! You got the correct number!.");
         }
      }
      
      keyboard.close();
   }
}