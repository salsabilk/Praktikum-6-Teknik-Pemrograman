package w6.polymorphicsorting;

import java.util.Scanner;

/**
 * Strings.java
 * @author Salsabil Khoirunisa
 * @version 1.0
 * @since 2023-02-23
 * Demonstrates selectionSort on an array of integers.
 */

public class Strings {
    // Reads in an array of Strings, sorts them, then prints them in sorted order
    public static void main(String[] args) {
        String[] strList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        strList = new String[size];
        
        System.out.println("\nEnter the strings...");
        for(int i = 0; i < size; i++)
            strList[i] = scan.next();
        
        Sorting.insertionSort(strList);
        
        System.out.println("\nYour strings in sorted order...");
        for(int i = 0; i < size; i++) {
            System.out.println(strList[i] + " ");
        }
        System.out.println();
        
        scan.close();
    }
}

