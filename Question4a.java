/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication32;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Question 4a
        // Declare an array of length 10
        int[] arr = new int[10];

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Loop to accept input for each index of the array
        for (int i = 0; i < arr.length; i++) {
            // Ask the user to input a number for the current index
            System.out.print("Enter a number for index " + i + ": ");
            arr[i] = scanner.nextInt(); // Read the user's input and store it in the array
        }
        //close the scanner
        scanner.close();
        // print the array elements to confirm the values were stored
        System.out.println("\nThe values you entered are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

    }
}
