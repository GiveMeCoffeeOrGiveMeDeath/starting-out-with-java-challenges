/* Chapter 5-  Challenge 2 - Retail Price Calculator 
*/

import java.util.Scanner;

public class Challenge2 {
   public static void main(String[] args) {

      double wholeSale = 0;
      int percent = 0;
      double total = 0;
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter the wholesale price of the product: ");
      wholeSale = keyboard.nextDouble();
      System.out.println("Enter the percentage: ");
      percent = keyboard.nextInt();

      System.out.println();
      total = calculateRetail(wholeSale, percent);
      System.out.print("Retail price: $" + total);

      keyboard.close();
   }

   public static double calculateRetail(double wholeSale, int percent) {

      double retailPrice = percent * (wholeSale / 100) + wholeSale;
      return retailPrice;
   }
}
