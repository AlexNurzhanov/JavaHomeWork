package org.example;


import java.util.Scanner;

// 203: Напишите программу, чтобы перевернуть строку с помощью рекурсии.

public class HomeWork203 {

    public static String reverseString(String string) {
        if (string.isEmpty())
            return string;
        return reverseString(string.substring(1)) + string.charAt(0);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String string = iScanner.nextLine();
        iScanner.close();

        System.out.println("Введенная строка: " + string);
        String rev = reverseString(string);
        System.out.println("Перевернутая строка: " + rev);
    }
}