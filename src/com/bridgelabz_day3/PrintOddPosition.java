package com.bridgelabz_day3;

//7) Java Program to print the elements of an array present on odd position
public class PrintOddPosition {
    public static void main(String[] args) {
        int[] numbers = new int[] {56,14,27,74,83,97,24,7,47,5,32,79};

        for(int i=1 ; i<numbers.length ; i= i+2) {
            System.out.println(numbers[i]);
        }
    }
}
