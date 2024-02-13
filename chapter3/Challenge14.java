import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Challenge14 {
   public static void main(String[]args){
      char packageDeal;
      int input = 0;
      int hours = 0;
      int overHours = 0;
      double total = 0;
      double overPay = 0;
      double savings1 = 0;
      double savings2 = 0;
   
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.00");
   
      System.out.println("Enter your internet package:  ");
      packageDeal = keyboard.next().charAt(0);
      System.out.println("Enter the total hours used: ");
      input = keyboard.nextInt();
   
   
   
      if(packageDeal == 'A' || packageDeal == 'a'){
      
         hours = 10;
      if(input > hours){
         overHours = input - hours;
         overPay = overHours * 2;
         savings1 = overHours * 1;
      } 
         total = 9.95 + overHours;
         savings1 = 13.95 +savings1;
         savings1 = total - savings1;
      }else if (packageDeal == 'B' || packageDeal == 'b') {
         hours = 20;
      if(input > hours){
         overHours = input - hours;
         overHours = overHours * 1;
      }
         total = 13.95 + overHours;
         
      } else if (packageDeal == 'C' || packageDeal == 'c') {
      
         total = 19.95;
      }
   
      String package1 = Character.toString(packageDeal);
      package1 = package1.toUpperCase();
   
      System.out.println("Your package is : " + package1 + " The total: $" + df.format(total));
      
      
   }

}