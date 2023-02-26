package w6.polymorphicsorting;

import java.util.Scanner;

/**
 * Numbers.java
 * @author Salsabil Khoirunisa
 * @version 1.0
 * @since 2023-02-23
 * Demonstrates selectionSort on an array of integers.
 */

public class Numbers {
    // Reads in an array of integers, sorts them, then prints them in sorted order
    public static void main(String[] args) {
        Integer[] intList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        
        System.out.println("\nEnter the numbers...");
        for(int i = 0; i < size; i++)
            intList[i] = scan.nextInt();
        
        Sorting.insertionSort(intList);
        
        System.out.println("\nYour numbers in sorted order...");
        for(int i = 0; i < size; i++) {
            System.out.println(intList[i] + " ");
        }
        System.out.println();
        
        scan.close();
    }
}


