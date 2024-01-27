import java.util.Scanner;

public class challenge3 {
    public static void main{String[]args}   {
        int bmi = 0;
        int weight = 0;
        int height = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your weight in pounds");
        weight = keyboard.nextInt();
        System.out.println("Enter your height in inches");
        height = keyboard.nextInt();


        bmi = (weight * 703) / (height * height);

        if(bmi >= 18.5 && bmi <= 25){
            System.out.println("Your BMI is " + bmi + " and you are at optimal weight");
            }
            else if(bmi < 18.5){
                System.out.println("Your BMI is " + bmi + " and you are underweight");
            }
            else if(bmi > 25){
                System.out.println("Your BMI is " + bmi + " and you are overweight");
            }
      
    }

}
