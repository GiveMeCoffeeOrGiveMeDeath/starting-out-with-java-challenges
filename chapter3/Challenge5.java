import java.util.Scanner;

public class Challenge5 {
    public static void main{String[]args}   {
        double weight = 0;
        double mass = 0; 
        
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the mass of the object");
        mass = keyboard.nextDouble();

        weight = mass * 9.8;

        if(weight > 1000){
            System.out.println("The object is too heavy");
        }
        else if(weight < 10){
            System.out.println("The object is too light");
        }
        else{
            System.out.println("The object weighs " + weight + " newtons");
        }


    }
}
