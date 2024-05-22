/*Chapter 4 Challenge 22 Slot machine Simulation*/

import java.util.Scanner;
import java.util.Random;

public class Challenge22   {
   public static void main(String[]args)  {
      int userMoney = 0;
      int number = 0;
      char again = '';
      int[] randomNums;
      String[] randomItems; 
      Random rand = new Random();
      
      Scanner keyboard = new Scanner(System.in);
      
      
      String[] machineOptions = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
      
      do{
      
      System.out.println("Enter the amount you want to bet: ");
      userMoney = keyboard.nextInt();
      
      for(int i = 0; i< 3; i++){
         number = rand.nextInt(6);  // random number
         //randomNums[i] = number;    // storing the random number in one of the 3 spaces for the slot
         randomItems[i] = randomNums[number]; //storing the item for the slot
         
      }
      
      if(randomItems[0] == randomItem[1] || randomItem[0] == randomItem[2]){
         userMoney = userMoney * 2;
         System.out.println("Two items are the same you get double: " + userMoney);
         
      }else if(randomItems[0] == randomItem[1] && randomItem[0] == randomItem[2]){
         userMoney = userMoney * 3;
         System.out.println("Three items are the same you get triple: " + userMoney);
      
      }else{
         System.out.println("None of the items match you lost your bet.");
         userMoney = 0;
      }
         
      }while(again != 'n' || userMoney < 1);
      
      keyboard.close();
   }
}