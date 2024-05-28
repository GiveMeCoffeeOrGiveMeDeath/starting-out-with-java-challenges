/*Chapter 4 Challenge 22 Slot machine Simulation*/

import java.util.Scanner;
import java.util.Random;

public class Challenge22   {
   public static void main(String[]args)  {
   
      int userMoney = 0;
      int number = 0;
      String input;
      char again = 'y';
      int[] randomNums;
      String[] randomItems = new String[3]; 
      Random rand = new Random();
      
      Scanner keyboard = new Scanner(System.in);
      
      
      String[] machineOptions = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
      
      do{
      
      System.out.println("Do you want to play (Enter in lowercase): y/n");
      input = keyboard.nextLine().trim();
      
      if (!input.isEmpty()) {
                again = input.charAt(0);  // Get the first character
            } else {
                System.out.println("Input cannot be empty. Please enter a character.");
                continue;  // Ask the question again
            }

            if (again == 'n') {
                break;  // Exit the loop if the user doesn't want to play
            }
      
      
      System.out.println("Enter the amount you want to bet: ");
       while (!keyboard.hasNextInt()) {
                System.out.println("That's not a valid integer. Try again.");
                keyboard.next();  // Consume the invalid input
            }
            userMoney = keyboard.nextInt();
            keyboard.nextLine();
      
      for(int i = 0; i< 3; i++){
         number = rand.nextInt(6);  // random number
      }
      
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
         
      }while(again != 'n' || userMoney < 0);
      
      keyboard.close();
   }
}