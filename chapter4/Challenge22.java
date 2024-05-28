/*Chapter 4 Challenge 22 Slot machine Simulation*/

import java.util.Scanner;
import java.util.Random;

public class Challenge22   {
   public static void main(String[]args)  {
      int userMoney = 0;
      int number = 0;
      char again = 'y';
      int[] randomNums;
      Random rand = new Random();

      Scanner keyboard = new Scanner(System.in);


      String[] machineOptions = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
      String[] randomItems = new String[3];

      while(again != 'n'){

      System.out.println("If you want to play press enter y to play again and n to end:");
      again = keyboard.next().charAt(0);

      if(again == 'n'){
         System.out.print("Thank you for playing.");
         break;
      }

      System.out.println("Enter the amount you want to bet: ");
      userMoney = keyboard.nextInt();

      for(int i = 0; i< 3; i++){

         number = rand.nextInt(6);  // random number
         randomItems[i] = machineOptions[number]; //storing the item for the slot

      }

      //System.out.println(randomItems[0]);
      //System.out.println(randomItems[1]);
      //System.out.println(randomItems[1]);

      System.out.println("Slot Machine Results: ");
      for(int i = 0; i <3; i++){
         System.out.print(randomItems[i] + " ");
      }
      System.out.println();


      if(randomItems[0] == randomItems[1] || randomItems[0] == randomItems[2]){
         userMoney = userMoney * 2;
         System.out.println("Two items are the same you get double: " + userMoney);

      }else if(randomItems[0] == randomItems[1] && randomItems[0] == randomItems[2]){
         userMoney = userMoney * 3;
         System.out.println("Three items are the same you get triple: " + userMoney);

      }else{
         System.out.println("None of the items match you lost your bet.");
         userMoney = 0;
         }

      }

      keyboard.close();
   }
}

