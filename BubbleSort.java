/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author David
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int[] num = new int[]{6,3,7,2,1};
         int temp;
         
         
         for(int i =0; i < num.length-1; i++){
             for(int x =0; x < num.length-1; i++){
                 
                 if(num[x]> num[x + 1]){
                     temp = num[x];
                     num[x] = num[x + 1];
                     num[x + 1] = temp;
                 }
             }
         }
         
         int j;
         for( j= 0; j< num.length-1; j++){
         System.out.print(num[j]);
         }
         //System.out.print(num);
    }
    
}
