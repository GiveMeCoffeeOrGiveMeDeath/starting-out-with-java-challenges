
/*
chapter 2 challenge 10

rounding up to second decimal 
*/
 import java.util.Scanner;
 import java.text.DecimalFormat;
 
public class Challenge10 {
    public static void main(String[] args) {
       
       double testOne = 0;
       double testTwo = 0;
       double testThree = 0;
       double average;
      
       
       Scanner keyboard = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#,###.00");
       
       System.out.print("Enter the result for test one: ");
       testOne = keyboard.nextDouble();
       System.out.print("Enter the result for test two: ");
       testTwo = keyboard.nextDouble();
       System.out.print("Enter the result for test three: ");
       testThree = keyboard.nextDouble();
       
       average = (testOne + testTwo + testThree) / 3;
       String avgTest = df.format(average);
       
       
       System.out.print("Your average test results are: " + avgTest);
       
    }
}
