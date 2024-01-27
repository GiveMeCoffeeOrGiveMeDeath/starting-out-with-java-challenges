
import java.util.Scanner;


public  class challenge1 {
    public static void main{String[]args}   {
        int input = 0;

        Scanner keyboard = new Scannner(Scanner.in);
        System.out.println("Enter the number 1-10 to be translated to Roman numbers");
        input = keyboard.nextInt();

        switch(input){

        case 1:
        System.out.println("I");
        break;

        case 2:
        System.out.println("II");
        break;

        case 3:
        System.out.println("III");
        break;

        case 4:
        System.out.println("IV");
        break;

        case 5:
        System.out.println("V");
        break;

        case 6:
        System.out.println("VI");
        break;

        case 7:
        System.out.println("VII");
        break;

        case 8:
        System.out.println("VIII");
        break;

        case 9:
        System.out.println("IX");
        break;

        case 10:
        System.out.println("X");
        break;

        default:
        System.out.println("Invalid input");
        }

    }

}
