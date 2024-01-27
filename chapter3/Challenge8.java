import java.util.Scanner;

public class hallenge8{
    public static void main(String[]args){
        int packages = 0;
        int discount = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount of packages purchase: ");
        packages = keyboard.nextInt();

        if(packages > 10 && packages < 19){
            discount = 20;
        }else if(packages > 20 && packages < 49){
            discount = 30;
        }else if(packages > 50 && packages < 99){
            discount = 40;
        }else if(packages >= 100){
            discount = 50;
        }

        System.out.print("The discount for the amount of packages purchage: " + discount + "%");

    }
}
