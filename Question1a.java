/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author HP
 */
public class JavaApplication27{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Question 1a- Using a FOR loop
        
        int rows = 4; //we are given 4 rows
        int columns = 12; //we are given 12 columns
        //loop through each row
        for(int i = 0; i<rows; i++){
            //loop through each column
            for(int j = 0; j<columns; j++){
                if (j<4 || j>=8){
                    System.out.print("*");
                }
                else{
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
    
}


