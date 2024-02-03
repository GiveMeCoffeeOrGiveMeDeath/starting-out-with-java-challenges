
/*
Challenge 17
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Challenge17 {
    public static void main(String[] args) {
        // declaring variables
        double sugar = 1.5 / 48;
        double butter = 1.0 / 48;
        double flour = 2.75 / 48;
        int amountCookies = 0;

        // declaring scanner function
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");
        
        // input
        System.out.print("Enter how many cookies you want to make: ");
        amountCookies = keyboard.nextInt();

        // calculating recipe for the amount
        double sugarAmount = amountCookies * sugar;
        double butterAmount = amountCookies * butter;
        double flourAmount = amountCookies * flour;

        // output
        System.out.print("Sugar needed for " + amountCookies + " : " + df.format(sugarAmount) + "\n");
        System.out.print("Butter needed for " + amountCookies + " : " + df.format(butterAmount) + "\n");
        System.out.print("Flour needed for " + amountCookies + " : " + df.format(flourAmount) + "\n");
    }
}
