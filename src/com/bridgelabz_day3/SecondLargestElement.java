package com.bridgelabz_day3;

//10) Find 2nd Largest Number in an Array
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] num = new int[7];
        num[0] = 9 ;
        num[1] = 32 ;
        num[2] = 70;
        num[3] = 87;
        num[4] = 93 ;
        num[5] = 27 ;
        num[6] = 12 ;


        int largest = 0;
        int secondLarge = 0;

        for(int i=0 ; i<num.length ; i++) {
            if(num[i] > largest) { //9
                secondLarge = largest; //0//9
                largest = num[i];//9 //32

            }
        }
        System.out.println("Second Largest Element ="+secondLarge);
    }
}
