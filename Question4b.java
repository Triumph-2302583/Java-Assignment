/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Question 4b- Using a FOR-EACH loop
        int[] arr = new int[10]; //create an array of length 10
        Scanner scanner = new Scanner(System.in); //Create a scabber to accept the user input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter value for index " + i + ":");
            arr[i] = scanner.nextInt(); //Accept input from the user and assign it to the array
        }
        //Close the scanner
        scanner.close();
        //Use a FOR-EACH loop to print the values entered by the user.
        System.out.println("\nThe values you entered are:");
        for (int value : arr) {
            System.out.print(value);

        }

    }

}
