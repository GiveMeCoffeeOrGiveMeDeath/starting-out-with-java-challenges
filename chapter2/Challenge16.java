/*
Challenge 16
*/

public class Challenge16 {
    public static void main(String[] arg) {
        int totalSurvey = 12467;
        double oneDrink = 0;
        double citrusDrink = 0;

        // calculating
        oneDrink = totalSurvey * 0.14;

        citrusDrink = totalSurvey * 0.64;

        // output calculation
        System.out.println("The total amount of people that drink one per week: " + oneDrink);

        System.out.println("The total amount of people that prefer citrus-flavored: " + citrusDrink);

    }
}
