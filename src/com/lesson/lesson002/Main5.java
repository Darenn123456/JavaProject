package com.lesson.lesson002;

//Characters - символы
public class Main5 {
    public static void main(String[] args) {

        // ASCII - american 1 byte
        // UTF-16 - Unicode 2 byte
        // UTF-8 - Unicode 1 byte / 2 byte
        // asd - 3 byte
        // asdЯ - 8 byte
        // asdЯ - 5 byte
        char a = '0';
        char b = '\t';
        char c = 'я';

        System.out.println(a + " " + b + " " + c);

        System.out.println((int)c);

        int x = '1'-48;
        System.out.println(x);
    }
}
