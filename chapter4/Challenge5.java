import java.util.Scanner;

public class Challenge5 {
    public static void main(String[]args)   {

        Scanner keyboard = new Scanner(System.in);
        String text = " ";
        char letter = ' ';
        int count = 0;

        System.out.println("Enter a sentence: ");
        text = keyboard.nextLine();
        System.out.println("Enter a letter: ");
        letter = keyboard.next().charAt(0);

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == letter){
                count++;
            }
        }

        System.out.println("Number of occurrences of letter '" + letter + "': " + count);
        keyboard.close();
    }
    
}
