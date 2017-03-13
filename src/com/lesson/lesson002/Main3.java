package com.lesson.lesson002;

// Целые числа
public class Main3 {
    public static void main(String[] args) {

        byte a;     // 1 byte
        short b;    // 2 byte
        int c;      // 4 byte
        long d;     // 8 byte

        c = Integer.MAX_VALUE;
        System.out.println("c : " + c);
        c++;
        System.out.println("c : " + c);

        int x = 5, y = 11;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(y / x);
        System.out.println(y % x);

        // a % 2; 0-четное 1 - нечетно
        // a % 10; последняя цифра в числе 523 % 10 = 3
        // a % 100; последняя цифра в числе 523 % 100 = 23

        d = 5000_000_000l;
        System.out.println(d);
        c = (int) d;
        System.out.println(c);

    }
}
