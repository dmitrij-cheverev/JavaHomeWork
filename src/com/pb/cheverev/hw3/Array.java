package com.pb.cheverev.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        int sum=0, count=0, tmp;
        for (int i=0; i < array.length; i++){
            System.out.println("Enter " + (i+1) + " elements:");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: ");
        for (int i=0; i < array.length; i++) {
            sum+=array[i];
            if(array[i] >= 0 )
                count++;
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Number of positive elements: " + count);
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Bubble sort:\n" + Arrays.toString(array));
    }
}
