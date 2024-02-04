import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String medium = " ";
        int distance = 0;
        double time = 0;

        System.out.println("This will show you the speed of wave sound in air, water or steel:");
        System.out.println("Enter the medium: ");
        medium = keyboard.nextLine();
        medium = medium.toLowerCase().trim();

        System.out.println("Enter the distance the wave of sound have to travel: ");
        distance = keyboard.nextInt();

        switch (medium) {
            case "air":
                time = distance / 1100;
                break;
            case "water":
                time = distance / 4900;
                break;
            case "steel":
                time = distance / 16400;
                break;
        }

        System.out
                .println("The time it will take for distance " + distance + " in " + medium + " and the time: " + time);
        keyboard.close();
    }
}
