/*Chapter 4 Challenge 11. Celcious to Fahrenheit table
*/

public class Challenge11   {
   public static void main(String[]args)  {
      double fahrenheit = 0.0;
      int maxCelcius = 20;
      
      
      for(int i = 0; i <= maxCelcius; i++){
      fahrenheit = (((9/5)*(i))+ 32); 
      
      System.out.println("The Celcius " + i + " converted to Fahrenheit " + fahrenheit);
      }
   }
}