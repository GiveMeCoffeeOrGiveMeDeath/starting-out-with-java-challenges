/*
Chanllenge 18
*/

import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        // declaring variables
        String name;
        int age = 0;
        String city;
        String college;
        String profession;
        String animal;
        String pet;
        ;

        Scanner keyboard = new Scanner(System.in);

        // output
        System.out.print("Enter your name: ");
        name = keyboard.nextLine();
        System.out.print("Enter your age: ");
        age = keyboard.nextInt(); 
        keyboard.nextLine();//consumes the newline character
        System.out.print("Enter your city: ");
        city = keyboard.nextLine();
        System.out.print("Enter your College: ");
        college = keyboard.nextLine();
        System.out.print("Enter your profession: ");
        profession = keyboard.nextLine();
        System.out.print("Enter the type of animal: ");
        animal = keyboard.nextLine();
        System.out.print("Enter the name of your pet: ");
        pet = keyboard.nextLine();

        System.out.print(" There once was a person named " + name + " who lived in " + city + ". At the age of " + age
                + " ,\n" +
                name + " wen to college at: " + college + ". " + name + " graduated and went to work as a\n" +
                profession + ". Then, " + name + " adopted a(n) " + animal + " named " + pet + ". They both lived\n" +
                "happily ever after!");

    }
}
