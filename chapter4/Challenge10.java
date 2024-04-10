/* Chapter 4 Challenge 10 largest and smallest
*/
import java.util.Scanner;


public class Challenge10   {
   public static void main(String[]args)  {
      int smallest = 0;
      int largest = 0;
      int input = 0;
   
      Scanner keyboard = new Scanner(System.in);
      
      while(input != -99){
         System.out.println("Enter -99 to exit.");
         System.out.println("Enter a positive integer:");
         input = keyboard.nextInt();
         
         
         if(input != -99){
            if(smallest < input){
               smallest = input;
               
            }else{
               largest = input; 
            }
             
         }
         }
      
      System.out.println("The largest number enter: " + largest);
      System.out.println("The smallest number enter: " + smallest);
      
      keyboard.close();
   }
}