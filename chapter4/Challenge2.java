/* Chapter 4 Challenge 2

*/

import java.util.Scanner;

public class Challenge2 {
   public static void main(String[]args)  {
   
      int distance = 0;
      int speed = 0;
      int time = 0;
   
      Scanner keyboard = new Scanner(System.in);
   
      System.out.println("Enter the speed the train is traveling: ");
      speed = keyboard.nextInt();
   
      System.out.println("Enter the hours you have travel: ");
      time = keyboard.nextInt();
   
      System.out.println("Hours         Distance Traveled ");
      System.out.println("---------------------------------");
      speed = speed / time;
      
      for(int i = 1 ; i <= time; i++) {
         
         distance = speed * i;
         System.out.println(i + "\t\t\t\t\t\t\t" + distance);
      }
      keyboard.close();
   }
}