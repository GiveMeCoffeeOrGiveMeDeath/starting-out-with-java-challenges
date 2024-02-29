import java.util.Random;
import java.util.Scanner;

public class numRan {
   public static void main(String[] args) {
      int numGuess = 0;
      Random rand = new Random();

      int numRandom = rand.nextInt(100) + 1;
      Scanner keyboard = new Scanner(System.in);

      System.out.println(numRandom);

      while (numGuess != numRandom) {

         numGuess = keyboard.nextInt();

         if (numGuess > numRandom) {
            System.out.println("Too high");
         } else if (numGuess < numRandom) {
            System.out.println("Too low");
         } else {
            System.out.println("You got it!");
         }
      }
      keyboard.close();
   }
}