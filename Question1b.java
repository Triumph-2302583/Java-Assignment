/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;

/**
 *
 * @author HP
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        //Question 1b - Using NESTED loop
        
        int rows = 4; //number of rows
        int columns = 12; //number of columns
        //loop through each row
        for(int i=0; i<rows; i++){
            //Nested loop to print each column in the row
            for(int j= 0; j<columns; j++){
                if (j<4) {   //first 4 columns
                    System.out.print("*");
                }else if(j>=4 && j<8) {  //middle 4 columns
                    System.out.print("=");
                }else{   //last 4 columns
                    System.out.print("*");
                }
            }
            System.out.println();  //move to the next row
        }
    }
    
}
