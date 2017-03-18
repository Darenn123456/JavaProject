package com.lesson.lesson002.home.work;

import java.util.Scanner;

//Рассчет силы гравитации
//https://ru.wikipedia.org/wiki/%D0%93%D1%80%D0%B0%D0%B2%D0%B8%D1%82%D0%B0%D1%86%D0%B8%D1%8F
// Пользователь вводит массу тел и растояние между ними, вычислить силу притяжения

public class Hw4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double G = 6.67e-11;
        double F;
        double m1;
        double m2;
        double r;

        System.out.print("Введите массу 1 объекта: ");
        m1 = scanner.nextDouble();
        System.out.print("Введите массу 2 объекта: ");
        m2 = scanner.nextDouble();
        System.out.print("Введите расстояние между объектами: ");
        r = scanner.nextDouble();

        F = G * ((m1 * m2) / (r * r));

        System.out.println("Гравитационное притяжение этих объектов равняется " + F + " Н");

    }
}
