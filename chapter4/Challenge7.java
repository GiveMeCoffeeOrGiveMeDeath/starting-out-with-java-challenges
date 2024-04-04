import java.util.Scanner;

public class Challenge7 {
   public static void main(String[]args)  {
      int floors = 0;
      int rooms = 0;
      int occupied = 0;
      int totalRooms = 0;
      int totalOccupied = 0;
      double occupiedRate = 0;
      int vacantRooms = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      do{
         System.out.println("Enter the number of floors: ");
         floors = keyboard.nextInt();
      
         if(floors <= 0){
            System.out.println("The input must be above 0 positive.");
         }
      
      }while(floors  < 0);
      
      for(int i = 1; i <= floors; i++){
         System.out.println("Enter the total number of rooms in floor " + i);
         rooms = keyboard.nextInt();
         System.out.println("Enter the total number of rooms occupied in this floor " + i);
         occupied = keyboard.nextInt();
         
         totalRooms += rooms;
         totalOccupied += occupied;
      }
      
      vacantRooms = totalRooms - totalOccupied;
      occupiedRate =  totalRooms / totalOccupied;
      
      
      System.out.println("The total rooms the Hotel has are: " + totalRooms);
      System.out.println("The total occupied rooms are: " + totalOccupied);
      System.out.println("The total of vacant rooms are: " + vacantRooms);
      System.out.println("The occupancy rate is: " + occupiedRate);
      
      keyboard.close();
      
   }
}