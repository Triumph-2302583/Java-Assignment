/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication34;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]arr = new int[10][10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.println("Please enter the value for index["+i+"]["+j+"]:");
                arr[i][j] = scanner.nextInt(); //Accept input from the user and assign it to the 2D array.
                
            }
        }
        //close the scanner
        scanner.close();
        //print the 2D array to confirm the values were stored
        System.out.print("\n The values you entered are:");
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ "");
            }
            System.out.println();
        }
    }
    
}
