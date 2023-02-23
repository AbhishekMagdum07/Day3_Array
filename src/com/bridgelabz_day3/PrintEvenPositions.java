package com.bridgelabz_day3;

// 5) Java Program to print the elements of an array present on an even position
public class PrintEvenPositions {
    public static void main(String[] args) {
        int[] numbers = new int[] {56,14,27,74,83,97,24,7,47,5,32,79};

        System.out.println("Elements present on Even Positions =");
        for(int i=0 ; i<numbers.length ; i= i+2) {
            System.out.println(numbers[i]);
        }
    }
}
