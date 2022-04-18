package com.bridgelabz;
//7) Java Program to print the elements of an array present on odd position

public class problem007 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
        System.out.println("Elements in even position:-");
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            i=i+1;
        }
    }
}
