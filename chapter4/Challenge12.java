/* Chapter 4 Challenge 12
*/
import java.util.Scanner;

public class Challenge12   {
   public static void main(String[]args)  {
      
      int store = 0;
      int num = 1;
      String chart1 = " ";
      String stars = "*";
      int total = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      
      
      System.out.println("Enter todays sales for the 5 stores: ");
       for(int j = 1; j <= 5; j++){
         System.out.println("Eneter today's sales for store " + num + ": ");
         store = keyboard.nextInt();
         total = store/100;
         
        
         
         System.out.println("Sales Bar Chart:");
         for(int i = 0; i< total; i++) {
            chart1 += stars; 
          }   
         System.out.println("Store " + num + ":" + chart1);
         num++;
         chart1 = " ";
      }
      
   }
}