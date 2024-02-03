/*
chapter 2 challenge 15
*/

public class Challenge15 {
    public static void main(String[] args) {

        // declaring variables
        int stocks = 600;
        double stocksPurchase = 21.77;
        double commission = 0.02;

        // calculating the total price of the stocks
        double totalStocks = stocks * stocksPurchase;

        // calculating the commission
        double totalCommission = totalStocks * commission;

        // calculating the total price of the transaction
        double total = totalStocks + totalCommission;

        // output results
        System.out.print("Total stocks purchase: " + totalStocks);

        System.out.print("The amount of commission: " + totalCommission);

        System.out.print("The total amount for the transaction: " + total);

    }

}
