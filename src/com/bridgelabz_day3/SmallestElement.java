package com.bridgelabz_day3;

//4) Java Program to print the smallest element in an array
public class SmallestElement {
    public static void main(String[] args) {

        int[] num = new int[7];
        num[0] = 23 ;
        num[1] = 47 ;
        num[2] = 74 ;
        num[3] = 37 ;
        num[4] = 27 ;
        num[5] = 13 ;
        num[6] = 93 ;

        int min = num[0]; // Assuming num[0] is a minimum value and compare.
        for(int i=0 ; i<num.length ; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Smallest Element is = "+min);

    }
}
