import java.uti.Scanner;

public class Challenge7 {
   public static void main(String[]args)  {
      int floors = 0;
      int rooms = 0;
      int occupied = 0;
      int totalRooms = 0;
      int totalOccupied = 0;
      int occupiedRate = 0;
      int vacantRooms = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the number of floors: ");
      floors = keyboard.nextInt();
      
      if(floors <= 0){
         return System.out.println("The input must be above 0 positive.");
      }
      
      for(int i = 1; i <= foors; i++){
         System.out.println("Enter the total number of room occupied");
         rooms = keyboard.nextInt();
         System.out.println("Enter the total number of rooms occupied in this floor.");
         occupied = keyboard.nextInt();
         
         totalRooms += rooms;
         totalOccupied += occupied;
      }
      
      occupiedRate = occupied / rooms;
      vacantRooms = totalRooms - occupied;
      
      System.out.println("The total rooms the Hotel has are: " + totalRooms);
      System.out.println("The total occupied rooms are: " + totalOccupied);
      System.out.println("The total of vacant rooms are: " + vacantRooms);
      System.out.println("The occupancy rate is: " + occupiedRate);
      
      keyboard.close();
      
   }
}