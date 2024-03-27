/*
Chapter 4 challenge 1
Sum of numbers
*/

public class Challenge1 {
   public static void main(String[]args)  {
      int total = 0;
      
      
      for(int i = 1; i <= 50; i++) {
      
         total += i;
      }
      
      System.out.println("Adding all numbers from 1-50: " + total);
   }
}