
/* Chapter 4 Challenge 9 Population
*/
import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        // declaring variables
        int startingOrganism = 0;
        double dailyIncrease = 0;
        int daysMultiplying = 0;
        double result = 0;

        // declaring scanner object
        Scanner keyboard = new Scanner(System.in);

        do {

            System.out.println("Enter the amount of starting organisms: Minimum 2");
            startingOrganism = keyboard.nextInt();
            System.out.println("Enter the porcentage the organism will increase in %: ");
            dailyIncrease = keyboard.nextDouble();
            System.out.println("Enter the days the organisms will be multiplying: ");
            daysMultiplying = keyboard.nextInt();

        } while (startingOrganism < 2 || dailyIncrease < 1 || daysMultiplying < 1);

        result = startingOrganism * (dailyIncrease / 100);

        for (int i = 1; i <= daysMultiplying; i++) {

            result = result + startingOrganism;
            System.out.println("The daily population is: " + result + " with an increase of " + dailyIncrease);
        }

        // closing the scanner object
        keyboard.close();
    }

}
