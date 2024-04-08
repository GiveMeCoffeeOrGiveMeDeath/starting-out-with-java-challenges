
// Chenllenge 8 Average rainfall
import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {

        int years = 0;
        int inches = 0;
        double average = 0;
        int total = 0;
        int monthCount = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of months: ");
        years = keyboard.nextInt();

        for (int i = 1; i <= years; i++) {
            for (int x = 1; x <= 12; x++) {
                do {

                    System.out.println("Enter the inches of rainfall for month " + x);
                    inches = keyboard.nextInt();

                    if (inches < 0) {
                        System.out.println("The input must be above 0 positive.");
                    }
                } while (inches < 0);
                total += inches;
                monthCount++;
            }
            average = total / 12;
        }
        System.out.println("The total months: " + monthCount);
        System.out.println("The total inches of rainfall: " + total);
        System.out.println("The average rainfall: " + average);

        keyboard.close();
    }
}
