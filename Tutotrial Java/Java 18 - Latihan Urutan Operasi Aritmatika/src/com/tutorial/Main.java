package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // perkalian atau pembagian akan di lakukan terlebihdahulu
        // jika dilakukan perkalian dan pembagian, maka akan di lakukan operasinya dari kiri ke kanan

        int hasil = 5 * 6 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokan operasi dengan tanda kurung ()
        hasil = 60 /(2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("nilai y = " + y);
    }
}
