package com.bridgelabz_day3;

//1) Java Program to print the elements of an array
public class PrintArray {
    public static void main(String[] args) {

        int[] num = new int[5];
        num[0] = 23 ;
        num[1] = 47 ;
        num[2] = 74 ;
        num[3] = 47 ;
        num[4] = 27 ;

        System.out.println("Numbers =");
        for(int i=0 ; i<num.length ; i++) {
            System.out.println(num[i]);
        }
    }
}
