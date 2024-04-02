import java.util.Scanner;

public class Challenge4 {
    public static void main(String[]args)   {

        Scanner keyboard = new Scanner(System.in);
        int daysWorked = 0;
        int totalPay = 0;

        //output instructions
        System.out.println("Enter the number of days you worked: ");
        System.out.println("Enter a positive integer:  ");

        //input instructions 
        daysWorked = keyboard.nextInt();

        for(int i = 1; i <= daysWorked; i++ ){
            System.out.println("Day " + i + " of work");
            totalPay += i * i;
            System.out.println("Total pay: " + totalPay);

        }

        keyboard.close();
    }
    
}
