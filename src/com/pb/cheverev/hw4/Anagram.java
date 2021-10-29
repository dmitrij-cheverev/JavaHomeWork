package com.pb.cheverev.hw4;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Anagram {

    static char[] StrToCharAndSort(String line){
        //переводим в нижжний регистр
        char[] content = line.toCharArray();
        for (int i = 0; i < content.length;i++){
            if (Character.isLetter(content[i]))
                content[i] = Character.toLowerCase(content[i]);
        }
        //сортируем char массив
        char tmp;
        for (int i = 0; i < content.length -1; i++) {
            for (int j = i+1; j < content.length; j++){
                if(content[i] > content[j]){
                    tmp = content[i];
                    content[i] = content[j];
                    content[j] = tmp;
                }
            }
        }
        return content;
    }

    static boolean IsAnagram(char[] One, char[] Second){
        //boolean result = (One == Second) ? true : false;
        String one = String.valueOf(One);
        String second = String.valueOf(Second);
        return (one.equals(second)) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String OneLine,SecondLine;
        char[] SortOneLine, SortSecondLine;
        System.out.println("Enter first line:");
        OneLine = scanner.nextLine();
        System.out.println("Enter second line:");
        SecondLine = scanner.nextLine();
        SortOneLine = StrToCharAndSort(OneLine);
        //System.out.println(SortOneLine);
        SortSecondLine = StrToCharAndSort(SecondLine);
        //System.out.println(SortSecondLine);
        System.out.println("Is it an anagram? " +"\n"+ IsAnagram(SortOneLine,SortSecondLine));
    }
}
