/* Chapter 4 challenge 18*/

import java.util.Scanner;
import java.util.Random;

public class Challenge18   {
   public static void main(String[]args)  {
      
      int numGuess = 0;
      int numTried = 0;
      
      Random rand = new Random();

      int numRandom = rand.nextInt(100) + 1;
      
      Scanner keyboard = new Scanner(System.in);
      
      while(numGuess != numRandom)  {
         
         System.out.println("Enter the number to guess the random number.");
         numGuess = keyboard.nextInt();
         
         numTried += 1;
         
         if(numGuess < numRandom){
            System.out.println("Too Low");
         
         }else if(numGuess > numRandom){
            System.out.println("Too High");
         
         }else{
            System.out.println("Congrats! You got the correct number!.");
            System.out.println("Total amount of tries: " + numTried);
         }
      }
      
      keyboard.close();
      
   }
}