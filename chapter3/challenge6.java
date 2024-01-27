import java.util.Scanner;

public class challenge6 {
    public static void main(String[]args)   {

        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int days = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of seconds");
        seconds = keyboard.nextInt();

        if(seconds >= 60){
            minutes = seconds / 60;
            seconds = seconds % 60;
        }else if(seconds >= 3600){
            hours = minutes / 60;
            minutes = minutes % 60;    
        }else if(seconds >= 86400){
            days = hours / 24;
            hours = hours % 24;
        }


        System.out.println( "The total Seconds: " + seconds);
        System.out.println("Days: " + days + " Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds);

            }
}
