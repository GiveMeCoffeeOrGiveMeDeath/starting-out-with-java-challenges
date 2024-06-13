/* Chapter 5 Challenge 1 - showChar method
*/


public class Challenge1 {
   public static void main(String[]args)  {
      showChar("New Yord", 2);
   }
   
   public static void showChar(String name, int num){
      
      char[] result = name.toCharArray(); 
      char resultChar = result[num];
      System.out.println(resultChar);
   
   }
}