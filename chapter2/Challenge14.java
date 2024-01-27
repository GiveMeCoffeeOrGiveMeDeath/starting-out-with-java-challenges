
/*
chapter 2 challenge 14

rounding up to second decimal 
*/
 import java.util.Scanner;
 import java.text.DecimalFormat;
 
public class Challenge14 {
    public static void main(String[] args) {
        
       int totalClass = 0;
       double women = 0;
       double men = 0;
       double percentage;
       double menPercent;
       double womenPercent;
       
       Scanner keyboard = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#,###.##");
       
       System.out.print("Enter total amount of students: ");
       totalClass = keyboard.nextInt();
       
       System.out.print("How many men in class: ");
       men = keyboard.nextDouble();
       
       System.out.print("How many women in class: ");
       women = keyboard.nextDouble();
       
       menPercent = men / totalClass;
       menPercent = menPercent * 100;
       womenPercent = women / totalClass;
       womenPercent = womenPercent * 100;
       
       System.out.print("total amount of people in class " + totalClass + " \nPercentage of men in class: " + menPercent + " \npercentage of women in class: " + womenPercent);
       
    }
}
