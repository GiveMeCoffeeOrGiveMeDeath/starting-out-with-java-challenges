import java.util.Scanner;

class challenge11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String runner1 = "";
        int time1 = 0;
        String runner2 = "";
        int time2 = 0;
        String runner3 = "";
        int time3 = 0;
        
        System.out.println("Please enter the three runner and times in minutes: ");
        
        runner1 = keyboard.nextLine();
        time1 = keyboard.nextInt();
        runner2 = keyboard.nextLine();
        time2 = keyboard.nextInt();
        runner3 = keyboard.nextLine();
        time3 = keyboard.nextInt();
        
      if (time1 > time2 && time1 > time3) {
            if (time2 > time3) {
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
            } else {
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
            }
        } else if (time2 > time1 && time3 > time2) {
            if (time1 > time3) {
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
            } else {
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
            }
        } else if (time3 > time2 && time1 > time3) {
            if (time2 > time1) {
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
            } else {
                System.out.println("In order runner: " + runner3 + " with a time of " + time3);
                System.out.println("In order runner: " + runner1 + " with a time of " + time1);
                System.out.println("In order runner: " + runner2 + " with a time of " + time2);
            }
        }
    }
}
