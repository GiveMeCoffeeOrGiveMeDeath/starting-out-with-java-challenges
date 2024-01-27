/*
chapter 2 challenge 8

rounding up to second decimal 
*/
 import java.util.Scanner;
 
public class Challenge8 {
    public static void main(String[] args) {
       
       int cookies = 0;
       int calories = 300;
       int caloriesPerCookies = 0;
       int totalCalories = 0;
       
       Scanner keyboard = new Scanner(System.in);
       
       caloriesPerCookies = calories / 40;
       
       System.out.print("Enter the amount of cookies you eat: ");
        cookies = keyboard.nextInt();
       
       totalCalories = cookies * caloriesPerCookies;
       
       System.out.print("Total amount of calories consumed: " + totalCalories);
       
    }
}
