import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {

        double test1 = 0;
        double test2 = 0;
        double test3 = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the score for test 1");
        test1 = keyboard.nextDouble();
        System.out.println("Enter the score for test 2");
        test2 = keyboard.nextDouble();
        System.out.println("Enter the score for test 3");
        test3 = keyboard.nextDouble();

        double average = (test1 + test2 + test3) / 3;

        if (average >= 90) {
            System.out.println("Your average is " + average + " and your grade is A");
        } else if (average >= 80 && average < 89) {
            System.out.println("Your average is " + average + " and your grade is B");
        } else if (average >= 70 && average < 79) {
            System.out.println("Your average is " + average + " and your grade is C");
        } else if (average >= 60 && average < 69) {
            System.out.println("Your average is " + average + " and your grade is D");
        } else if (average < 60) {
            System.out.println("Your average is " + average + " and your grade is F");
        }
        keyboard.close();

    }
}
