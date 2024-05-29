package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // unary = operasi yang dilakukan pada satu variable

        // unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);

        // unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);
        int b = 5;
        System.out.printf("nilai dengan '--' prefix menjadi = %d \n", --b);
        int c = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", c++);
        System.out.printf("nilai hasil dari postfix menjadi = %d \n", c);

        // unary boolean dengan ! untuk negasi

        boolean nyong = true;
        System.out.println("nilai boolean = " + nyong);
        System.out.println("nilai boolean = " + !nyong);

    }
}
