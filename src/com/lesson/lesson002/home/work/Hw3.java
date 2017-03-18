package com.lesson.lesson002.home.work;

import java.util.Scanner;

// Поход в магазин
// Пользователь вводит с клавиатуры количество денег, которые у него имеются
// Ввводит цену товара
// Написать какое количество товара он сможет купить на свои деньги и сколько останется здача
public class Hw3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Money;
        int Price;

        System.out.print("Введите количество денег которые у вас имеются: ");
        Money = scanner.nextInt();
        System.out.print("Введите цену товара: ");
        Price = scanner.nextInt();

        System.out.println("Вы можете купить: " + (Money / Price) + " рублей");
        System.out.println("У вас останется: " + (Money % Price) + " рублей");
    }
}