package lesson2;

public class PrimitiveDataDTypes {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000000L;
        long l2 = 51L;

        float f1 = 3.14f;
        float f2 = 2.5f;
        float f3 = 20.0f;

        double d1 = 5.5;
        double d2 = 81.65;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 500; // номер по юникод

        char c6 = '\u0500';

        boolean bool1 = false;
        boolean bool2 = true;

        int a1 = 60; // ясно дело целые
        int a2 = 0B111100; // двоичная
        int a3 = 0b111100; // тоже двоичная

        int a4 = 074; // восьмеричная

        int a5 = 0x3c; // шестнадцатеричная (Кейс не важен)

        int a6 = 1_000_000; // неважно где и сколько подчёркиваний

        System.out.println(c6);

    }
}
