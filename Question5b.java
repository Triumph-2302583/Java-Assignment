/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication37;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Question 5b- Using FOR-EACH loop
        // Declare a 2D array of size 10 by 10
        int[][] arr = new int[10][10];

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Loop through each row of the 2D array
        for (int i = 0; i < arr.length; i++) {
            // Loop through each columns
            for (int j = 0; j < arr[i].length; j++) {
                // Ask the user to input a number for the current index
                System.out.print("Please enter the value for index [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt(); // Read the user's input and store it in the array
            }
        }
        // Close the scanner object to avoid resource leak
        scanner.close();
        
        //Print the 2D array using a for-each loop
        System.out.println("\nThe values you entered are:");
        for (int[] row : arr) {  //iterate through each row
            for (int value : row) {
                System.out.print(value + " ");  //print the value
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
