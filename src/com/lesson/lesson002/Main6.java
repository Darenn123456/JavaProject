package com.lesson.lesson002;

// Boolean - логика
public class Main6 {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        // == != < > <= >=
        System.out.println(5 == 3);
        double a1 = 1.0/3.041145345345345;
        double b1 = (2*1.0/3.041145345345345)/2;
        double eps = 1e-7;
        System.out.println(Math.abs(a1 - b1) < eps);

        // && || !
        int x1=5,x2=105;
        int x3=65;
        System.out.println( (x1 <= x3 && x2 >= x3) );

    }
}
