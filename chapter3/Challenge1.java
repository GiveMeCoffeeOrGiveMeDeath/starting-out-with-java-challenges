
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        int input = 0;

        Scanner keyboard = new Scanner(System.in);
        
        while(input != -1){
        System.out.println("Enter the number 1-10 to be translated to Roman numbers");
        System.out.println("Enter -1 to exit");
        input = keyboard.nextInt();
         
        
         
        switch (input) {

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
                if(input != -1){
                System.out.println("Invalid input");
                }  
        }      
        }
        keyboard.close();

    }

}
