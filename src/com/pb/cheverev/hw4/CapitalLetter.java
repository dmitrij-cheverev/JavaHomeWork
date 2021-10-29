package com.pb.cheverev.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static String[] StrToArr (String line){
        String[] output = line.split("\\s");
        return output;
    }

    static char[] ToUpperCase (char[] line){
        if (Character.isLetter(line[0]))
            line[0] = Character.toUpperCase(line[0]);
        return line;

    }

    static void magic (String[] str){
        char[] line;
        String newline;
        for (String s : str) {
            line = s.toCharArray();
            ToUpperCase(line);
            newline = String.valueOf(line);
            System.out.print(newline+ " ");
        }
    }


    public static void main(String[] args) {
        //String line = "Истина — это то, что выдерживает проверку опытом. Эйнштейн А.";
        String line;
        String[] lineArr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        line = scanner.nextLine();
        lineArr = StrToArr(line);
        System.out.println("New String:");
        magic(lineArr);
    }
}
