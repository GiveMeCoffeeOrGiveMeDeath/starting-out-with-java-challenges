import java.util.Scanner;

class Challenge11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String runner1 = "";
        int time1 = 0;
        String runner2 = "";
        int time2 = 0;
        String runner3 = "";
        int time3 = 0;

        System.out.println("Please enter the three runner and times in minutes: ");
        
        System.out.println("Enter the first runner name: ");
        runner1 = keyboard.nextLine();
        System.out.println("Enter the first runner time: ");
        time1 = keyboard.nextInt();
        keyboard.nextLine();         // to consume the newline characters after the int input
        
        System.out.println("Enter the first runner name: ");
        runner2 = keyboard.nextLine();
        System.out.println("Enter the first runner time: ");
        time2 = keyboard.nextInt();
        keyboard.nextLine();        // to consume the newline characters after the int input
        
        System.out.println("Enter the first runner name: ");
        runner3 = keyboard.nextLine();
        System.out.println("Enter the first runner time: ");
        time3 = keyboard.nextInt();
        keyboard.nextLine();       // to consume the newline characters after the int input
        
        if (time1 < time2 && time1 < time3) {
            if (time2 < time3) {
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
            } else {
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
            }
        } else if (time2 < time1 && time3 > time2) {
            if (time1 < time3) {
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
            } else {
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
            }
        } else if (time3 < time2 && time1 > time3) {
            if (time2 < time1) {
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner1 + " with a time of " + time3);
            } else {
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
            }
        }

        keyboard.close();
    }
}
