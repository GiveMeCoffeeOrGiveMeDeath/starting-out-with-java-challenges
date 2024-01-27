import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        double caloriesFromFat = 0;
        double calories = 0;
        double fatGram = 0;
        double percentage = 0;
        double calories30Percent = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Fat Gram Calculator\n");
        System.out.println("Enter the number of calories in your dish:\n");
        calories= keyboard.nextDouble();
        System.out.println("Enter the number of fat grams in your dish:\n");
        fatGram = keyboard.nextDouble();
        
        caloriesFromFat = fatGram * 9;
        
        percentage = caloriesFromFat / calories; 
        
        if(caloriesFromFat > calories){
            System.out.println("Input is invalid, calories from fat are greater than total calories.");
        }
        
        calories30Percent = caloriesFromFat * 0.30;
        
        if(calories30Percent < calories){
            System.out.println("The dish is low in fat");
        }
        
        //System.out.print(caloriesFromFat +"\n");
        //System.out.print(calories30Percent  +"\n");

        System.out.println("The calories from fat: " + caloriesFromFat + "\n");
        System.out.println("The percent of calories from fat: " + percentage + "\n");
      
        
    }
}
