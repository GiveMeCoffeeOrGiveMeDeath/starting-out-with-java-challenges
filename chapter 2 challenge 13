
/*
chapter 2 challenge 13

rounding up to second decimal 
*/
 import java.util.Scanner;
 import java.text.DecimalFormat;
 
public class Main
{
    public static void main(String[] args) {
        
       double totalAmount = 0;
       double meal = 0;
       double tip = 0;
       double taxPercent = .0675;
       double tipPercent = .20;
       
       Scanner keyboard = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#,###.##");
       
       System.out.print("Enter meal charge: ");
       meal = keyboard.nextDouble();
       
       taxPercent = meal * taxPercent;
       
       tip = (meal * taxPercent) * tipPercent;
       
       totalAmount = taxPercent + tip;
       
       System.out.print("The teal total: " + df.format(meal) + "\nTaxes are: " + df.format(taxPercent) + "\n20% tip is: " + df.format(tip) + "\nTotal amount: " + df.format(totalAmount));
       
       
    }
}
