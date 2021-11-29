// Created by Nathan Dunn
//Email - nathan.toma.dunn@gmail.com
//Goal of the project is to take an array of numbers from the users input, and output the lowest
package com.findminnum_tomatow;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Creating Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many integers would you like to add?: ");
        //Number of integers the user will add
        int a = scanner.nextInt();
        System.out.println("Min is: " + findMin(readIntegers(a)));

    }
    //Method to input users numbers into array
    public static int[] readIntegers(int count){
        int[] makeArray = new int[count];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + count + " Numbers\r");
        for(int i = 0; i < count; i++){
            makeArray[i] = scanner.nextInt();
        }
        return makeArray;
    }
    //Method to return the lowest number
    public static int findMin(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                //This will set the lowest number as temp
                temp = a[i + 1];
                //This will set the higher number as the lower number to compare to the rest of the array
                a[i] = a[i + 1];
            }
        }
        //Returns lowest
        return temp;
    }
}
