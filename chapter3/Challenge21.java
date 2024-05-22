/* Chapter 4 Challenge 21
*/

import java.util.Scanner;
import java.util.Random;

public class Challenge21   {
   public static void main(String[]args)  {
      int machineRand = 0;
      int userRand = 0;
      int machineScore = 0;
      int userScore = 0;
      
      Scanner keyboard = new Scanner(System.in);
      Random rand = new Random();
      
      for(int i = 0; i < 10; i++){
      
      machineRand = rand.nextInt(6) + 1;
      userRand = rand.nextInt(6) + 1;
      
      if(userRand > machineRand){
         System.out.println("You won this hand, you get 1 point. ");
         ++userScore;
      } else if(userRand < machineRand){
         System.out.println("The house wom this hand we get a point.");
         ++machineScore;
      }else{
         System.out.println("Nobody wins this hand, no points given.");
      }
              
      }
      
      if(userScore > machineScore){
         System.out.println("You won the game! Congratulation! with: " + userScore + " points");
      
      }else{
         System.out.println("The house won the game! you can always try again");
      }
      
      
      keyboard.close();
   }
}