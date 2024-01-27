/*
Challenge 19
*/

public class Main  {
    public static void main(String[]args)   {


        // declaring variables 
        int shares = 1000;
        double sharesPrice = 32.87;
        double commission = 0.02;
        double sharesSold = 33.92;

        //calculation on 
        double commissionShares =  (shares * sharesPrice) * commission;
        double totalPaid = shares * sharesPrice;

        double commissionSold = (shares * sharesSold) * commission;
        double soldPaidStocks = shares * sharesSold;
        double profit = totalPaid - soldPaidComm;

        System.out.print("Amount Joe paid for stocks: " + totalPaid);
        System.out.println("Joe paid as commision on the purchase of the stocks: " + commissionShares);
        System.out.println("Joe sold the stocks for: " + soldPaidStocks);
        System.out.println("The total joe sold his stocks for: " + commissionSold);
        System.out.println("The profit Joe made after saling the stocks: " + profit);
        


    }
}
