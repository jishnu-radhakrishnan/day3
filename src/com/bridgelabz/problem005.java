package com.bridgelabz;
//5) Java Program to print the elements of an array present on an even position

public class problem005 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
        System.out.println("Elements in even position:-");
        int i;
        for (i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
            i=i+1;
        }
    }
}
