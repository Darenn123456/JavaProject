package com.lesson.lesson002;

import java.util.Scanner;

// Variables - перменные
public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ТИП ИДЕНТИФИКАТОР [= ИНИЦИАЛИЗАЦИЯ]
        int heroHealth = 100;

        System.out.println("Hero health : " + heroHealth);

        heroHealth = 90;

        System.out.println("Hero health : " + heroHealth);

        heroHealth = (5+3)*45;

        System.out.println("Hero health : " + heroHealth);

        // Ввод информации
        System.out.println("Enter hero health: ");
        heroHealth = scanner.nextInt();
        System.out.println("You enter : " + heroHealth);

        int deamonHelth = 0;

        // 2+2 -> 4
        // a=2 -> 2
        deamonHelth = (heroHealth = 50) + 1;


        System.out.println("Deamon helth " + deamonHelth);

        deamonHelth += 2;
        deamonHelth++; // deamonHeatlh = deamonHealth + 1;


    }
}
