package com.bridgelabz;
//6) Java Program to print the elements of an array in reverse order

public class problem006 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
        System.out.println("Elements in reverse order:-");
        int i;
        for (i = 14; i < arr.length; i--) {
            System.out.println(arr[i]);
        }
    }
}
