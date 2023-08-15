
/*
chapter 2 challenge 7
*/
 import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args) {
        
        //declaring variables
        double total = 0;
        double amountPurchase = 0;
        double tax = .04;
        double taxResult = 0;
        double countyTax = .02;
        double countyTaxResult = 0;
        
        //declaring scanner for inout
        Scanner keyboard = new Scanner(System.in);
        
        //instructions and input
        System.out.print("Enter amount purchse: ");
        amountPurchase = keyboard.nextDouble();
        
        //calculating taxes
        taxResult = amountPurchase * tax;
        
        //calculating county taxes
        countyTaxResult = amountPurchase * countyTax;
        
        //total
        total = amountPurchase + taxResult + countyTaxResult;
        
        // printing all information
        System.out.print("Total after taxes: " + total + " \namount purchase: " + amountPurchase + " \ntax:  " + taxResult + " \ncounty tax:  " + countyTaxResult);
    }
}
