/* Chapter 4 Challenge 16- Budget file converter
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Challenge16   {
   public static void main(String[]args)  {
      
      double budget = 0;
      double total = 0; 
      double input = 0; 
      double finalTotal = 0;
      
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.00");
      
      System.out.println("Enter the budget for the month:");
      budget = keyboard.nextDouble();
      
      while(input != -99){
         System.out.println("Enter -99 to exit; ");
         System.out.println("Enter your expenses: ");
         input = keyboard.nextDouble();
         if(input > 0){
            total += input;
         }
         
         if(total > budget){
            finalTotal = total - budget;
         }else{
            finalTotal = budget - total;
         }
      }
      
      System.out.println("The total amount for your month budget is: "+ df.format(budget) + " ,The total you use this month: " + df.format(total) + " ,after paying all expenses: " + df.format(finalTotal));
      
      keyboard.close();
   }
}