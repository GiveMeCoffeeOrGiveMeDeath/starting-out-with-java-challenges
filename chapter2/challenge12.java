
/*
chapter 2 challenge 12

rounding up to second decimal 
*/
 import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        
       String favoriteCity;
       
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Enter your favotite city: ");
       favoriteCity = keyboard.nextLine();
       
       System.out.print(favoriteCity.length() + "\n");
       System.out.print(favoriteCity.toUpperCase() + "\n");
       System.out.print(favoriteCity.toLowerCase() + "\n");
       System.out.print(favoriteCity.charAt(0));
       
       //extra getting the lact character on the string
       System.out.print(favoriteCity.charAt(favoriteCity.length()-1));
       
    }
}
