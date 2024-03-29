/* Chapter 4 Challenge 3
 * 
*/

import java.util.Scanner;
import java.io.*;

public class Challenge3 {
    public static void main(String[] args)throws IOException{

        int distance = 0;
        int speed = 0;
        int time = 0;

        Scanner keyboard = new Scanner(System.in);
        PrintWriter DistanceTravel = new PrintWriter("DistanceTravel.txt");

        System.out.println("Enter the speed the train is traveling: ");
        speed = keyboard.nextInt();

        System.out.println("Enter the hours you have travel: ");
        time = keyboard.nextInt();

        System.out.println("Hours         Distance Traveled ");
        System.out.println("---------------------------------");

        for (int i = 1; i <= time; i++) {
            distance = speed * i;
            System.out.println(i + "\t\t\t" + distance);
        }
    }
}
