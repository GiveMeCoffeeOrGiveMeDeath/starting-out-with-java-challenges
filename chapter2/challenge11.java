
/*
chapter 2 challenge 11

rounding up to second decimal 
*/
 import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        
        double profit = 0;
        double retailPrice;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is the retail price of the circuit board: ");
        retailPrice = keyboard.nextDouble();
        
        profit = retailPrice * 0.4;
        
        System.out.print("The profit of the board is: " + profit);
        
       
       
       
    }
}
