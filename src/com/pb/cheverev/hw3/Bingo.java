package com.pb.cheverev.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(101);
        int count = 0;
        while (true) {
            String number;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number or type exit to quit program: ");
            count++;
            number = scanner.next();
            if (number.equals("exit")) {
                System.out.println("You lose");
                break;
            } else {
                int RandInt = Integer.parseInt(number);
                if (RandInt > random)
                    System.out.println("The entered number is greater");
                else if (RandInt < random)
                    System.out.println("The entered number is less");
                else if(RandInt == random) {
                    System.out.println("Bingo, you guessed the number in " + count + " attempts, hidden number is " + RandInt);
                    break;
                }
            }

        }
    }
}
