import java.util.Scanner;
import java.text.DecimalFormat;

public class challenge9{
    public static void main(String[]args){

        double pounds = 0;
        double cost = 0;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        

        System.out.print("Enter a number of pounds: ");
        pounds = keyboard.nextFloat();
        
        if(pounds <= 2){
            cost = 1.10;
        }else if(pounds > 2 && pounds <= 6){
            cost = 2.20;
        }else if(pounds > 6 && pounds <= 10){
            cost = 3.70;
        }else if(pounds > 10){
            cost = 3.80;
        }

        System.out.println(pounds + " pounds will cost $" + df.format(cost) + " to ship every 500 miles.");



    }
}
