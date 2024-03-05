import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Challenge15 {
   public static void main(String[]args) {
   
      double baseFee = 10;
      int checks = 0;
      double total = 0;
      
      //declaring the scanner object
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.00");
      
      System.out.println("Enter the number of checks writen for the month: ");
      checks = keyboard.nextInt();
      
      if(checks <= 20){
         total = (checks * .10) + baseFee;
               
      }else if(checks > 20 && checks <= 39){
         total = (checks * .08) + baseFee;
         
      }else if(checks >= 40 && checks <= 59){
         total = (checks * .06) + baseFee;
      }else if(checks >= 60){
         total = (checks * .04) + baseFee;
      }
      
      System.out.println("The total for the back fee and checks is: " + df.format(total));
      
      keyboard.close();
   }
}