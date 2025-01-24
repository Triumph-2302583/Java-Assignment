/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;

/**
 *
 * @author HP
 */
import java.util.Arrays;
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Question3- Array numbers
        double[] numbers = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate and print mean, median, and standard deviation
        System.out.println("Mean: " + calculateMean(numbers));
        System.out.println("Median: " + calculateMedian(numbers));
        System.out.println("Standard Deviation: " + calculateStandardDeviation(numbers));
    }

    //3a.  Method to calculate the mean  
    public static double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    //3b.  Method to calculate the median
    public static double calculateMedian(double[] numbers) {
        // Sort the array first
        Arrays.sort(numbers);
   // If the number of elements is odd, return the middle element
        if (numbers.length % 2 == 1) {
            return numbers[numbers.length / 2];
        } else {
            // If the number of elements is even, return the average of the two middle elements
            int midIndex = numbers.length / 2;
            return (numbers[midIndex - 1] + numbers[midIndex]) / 2.0;
        }
    }

    //3c.  Method to calculate the standard deviation
    public static double calculateStandardDeviation(double[] numbers) {
        double mean = calculateMean(numbers);
        double sumSquaredDifferences = 0;

        // Calculate the sum of squared differences from the mean
        for (double num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        // Calculate variance
        double variance = sumSquaredDifferences / numbers.length;

        // Return the square root of variance (standard deviation)
        return Math.sqrt(variance);

    }

}
