import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Challenge14 {
   public static void main(String[]args) {
   
   char packageDeal;
   int input = 0;
   int hours = 0;
   int overHours = 0;
   double total = 0;
   double savings1 = 0;
   double savings2 = 0;
   String package2 = "";
   String package3 = "";
   
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("#.00");
   
   System.out.println("Enter your internet package:  ");
   packageDeal = keyboard.next().charAt(0);
   System.out.println("Enter the total hours used: ");
   input = keyboard.nextInt();
   
   String package1 = Character.toString(packageDeal);
   package1 = package1.toUpperCase();
   
   
   if(packageDeal == 'A' || packageDeal == 'a'){
      
      hours = 10;
   if(input > hours){
      overHours = input - hours;
      overHours = overHours * 2;
   }
      total = 9.95 + overHours;
      System.out.println("Your package is : " + package1 + " The total: $" + df.format(total));
      
      //savings package b
      savings1 = 13.95 + overHours;
      savings1 = savings1 - total;
      package2 = "B";
      
      System.out.println("You would save with package " + package2 +" is : a total of: $" + df.format(savings1) + " month");
      
      //savings package c
      savings2 = total - 19.95;
      package3 = "C";
      System.out.println("You would save with package " + package3 +" is : a total of: $" + df.format(savings2) + " month");
      
   
   }else if (packageDeal == 'B' || packageDeal == 'b') {
      hours = 20;
   if(input > hours){
      overHours = input - hours;
      overHours = overHours * 1;
   }
      total = 13.95 + overHours;
      System.out.println("Your package is : " + package1 + " The total: $" + df.format(total));
      
      //package c
      savings2 = total - 19.95;
      package3 = "C";
      System.out.println("You would save with package " + package3 +" is : a total of: $" + df.format(savings2) + " month");
      
   } else if (packageDeal == 'C' || packageDeal == 'c') {
      
      total = 19.95;
      System.out.println("Your package is : " + package1 + " The total: $" + df.format(total));
      System.out.println("This is the best package to get for this service.");
      
   }
   
   
   
   //System.out.println("Your package is : " + package1 + " The total: $" + df.format(total));
   keyboard.close();   
   }
}
