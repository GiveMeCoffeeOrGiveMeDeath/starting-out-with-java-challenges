/* Chapter 4 Challenge 12
*/
import java.util.Scanner;

public class Challenge12   {
   public static void main(String[]args)  {
      
      int store = 0;
      int num = 1;
      String chart = " ";
      String stars = "*";
      int total = 0;
      String sales = " "; 
      String sales1 = " "; 
      String sales2 = " "; 
      String sales3 = " "; 
      String sales4 = " "; 
      
      Scanner keyboard = new Scanner(System.in);
      
      
      
      System.out.println("Enter todays sales for the 5 stores: ");
       for(int j = 1; j <= 5; j++){
         System.out.println("Eneter today's sales for store " + num + ": ");
         store = keyboard.nextInt();
         total = store/100;
         
         for(int i = 0; i< total; i++) {
            chart += stars; 
            
          }   
          
          if(j == 1){
               sales = chart;
            }else if(j == 2){
               sales1 = chart;
            }else if(j == 3){
               sales2 = chart;
            }else if(j == 4){
               sales3 = chart;
            }else if(j == 5){
               sales4 = chart;
            }
          
         
         num++;
         chart = " ";
      }
      
      System.out.println("Sales Bar Chart:");
      System.out.println("Store " + num + ":" + sales);
      System.out.println("Store " + num + ":" + sales1);
      System.out.println("Store " + num + ":" + sales2);
      System.out.println("Store " + num + ":" + sales3);
      System.out.println("Store " + num + ":" + sales4);
      
   }
}