/*
chapter 2 challenge 9

rounding up to second decimal 
*/
 import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
       
       Scanner keyboard = new Scanner(System.in);
       
       
       int miles = 0;
       int gas = 0; 
       int mpg = 0;
       
       
       System.out.print("Enter the miles driven: ");
       miles = keyboard.nextInt();
       
       System.out.print("Enter the gallons of gas used: ");
       gas = keyboard.nextInt();
       
       mpg = miles / gas;
       
       System.out.print("The miles per gallon: " + mpg);
       
    }
}
