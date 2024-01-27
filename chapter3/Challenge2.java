import java.util.Scanner;

public class Challenge2 {
    public static void main{String[]args}   {
        int day = 0;
        int month = 0;
        int year = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a date in the format mm/dd/yyyy\n 
        to see if the date is Magical");
        System.out.println("Enter the day");
        day = keyboard.nextInt();
        System.out.println("Enter the month");
        month = keyboard.nextInt();
        System.out.println("Enter the year");
        year = keyboard.nextInt();

        if(day * month = year){
            System.out.println("The date is Magical");
        }else{
            System.out.println("The date is not Magical");
        }


    }
}
