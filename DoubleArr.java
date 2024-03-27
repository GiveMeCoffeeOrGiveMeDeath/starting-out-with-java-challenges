public class DoubleArr {
   public static void main(String[]args)  {
      
      //2D array
      String[][] cars = new String[3][3];
      
      cars[0][0] = "Civic"; 
      cars[0][1] = "4Runner";
      cars[0][2] = "4Rav";
      cars[1][0] = "Skylight GTR";
      cars[1][1] = "S2000";
      cars[1][2] = "RX-7";
      cars[2][0] = "Camry";
      cars[2][1] = "Accord";
      cars[2][2] = "WRX";
      
      for(int i = 0; i < cars.length; i++) {
            System.out.println();
         for(int j = 0; j< cars[i].length; j++) {
            System.out.println(cars[i][j] + " ");
         }
      }
   }
}