import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Challenge16 {
   public static void main(String[]args) {
      int points = 0;
      int books = 0;
      
      
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.00");
      
      System.out.println("Serendipity book store points");
      System.out.println("Enter the total amount of books purchase this month: ");
      books = keyboard.nextInt();
      
      if(books < 0){
         System.out.println("You should enter higher than 0.");
      }
      
      if(books == 0){
      
         points = 0;
      
      }else if(books == 1){
      
         points = 5;
         
      }else if(books == 2){
      
         points = 15;
         
      }else if(books == 3){
      
         points = 30;
         
      }else if (books >= 4){
      
         points = 60;
      }
      
      System.out.println("Your points this from last month: " + points);
      
      keyboard.close();
   }
}