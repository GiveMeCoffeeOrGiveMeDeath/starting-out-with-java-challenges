/*
Challenge 19
*/

import java.text.DecimalFormat;


public class Challenge19 {
    public static void main(String[] args) {

        // declaring variables
        int shares = 1000;
        double sharesPrice = 32.87;
        double commission = 0.02;
        double sharesSold = 33.92;
        
        DecimalFormat df = new DecimalFormat("###,###.00");


        // calculation on
        double commissionShares = (shares * sharesPrice) * commission;
        double totalPaid = shares * sharesPrice;

        double commissionSold = (shares * sharesSold) * commission;
        double soldPaidStocks = shares * sharesSold;
        double profit = soldPaidStocks - commissionShares;
        profit -= commissionSold;

        System.out.println("Amount Joe paid for stocks: " + df.format(totalPaid));
        System.out.println("Joe paid as commision on the purchase of the stocks: " + df.format(commissionShares));
        System.out.println("Joe sold the stocks for: " + df.format(sharesPrice));
        System.out.println("The total joe sold his stocks for: " + df.format(soldPaidStocks));
        System.out.println("The profit Joe made after seling the stocks: " + df.format(profit));

    }
}
