package org.example;

import java.util.Scanner;


// 202 Напишите программу, чтобы проверить,
// являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

public class HomeWork202 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первую строку: ");
        String firstStr = iScanner.nextLine();
        System.out.printf("Введите вторую строку: ");
        String secondStr = iScanner.nextLine();
        iScanner.close();

        if (firstStr.equals(new StringBuilder(secondStr).reverse().toString())) {
            System.out.println("Данные строки являются вращением друг друга!");
        } else
            System.out.println("Данные строки НЕ являются вращением друг друга!");
    }
}