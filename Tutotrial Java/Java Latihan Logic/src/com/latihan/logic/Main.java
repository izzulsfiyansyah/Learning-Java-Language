package com.latihan.logic;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // Latihan Logic

        // logic

//        int a = 7;
//        int b = 10;
//        int c = 19;
//        System.out.println("ini adalah awal dari program");
//
//        if (a == 5) {
//            System.out.println("ini adalah dimana a = 5");
//        } else if (b == 10) {
//            System.out.println("ini adalah dimana a bukan 5 dan b = 10");
//        } else if (c == 15) {
//            System.out.println("ini adalah dimana a bukan 5, b bukan 10, dan c = 15");
//        } else {
//            System.out.println("ini adalah dimana a,b,c salah");
//        }
//
//        System.out.println("ini adalah akhir dari program");

        // logic v.2

        int angka;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        angka = masuk.nextInt();
        System.out.println("ini adalah awal program");
        if (angka >=100){
            System.out.println("ini adalah statement 1 dg nilai 100 keatas");
        }else if (angka >= 70 && angka < 100){
            System.out.println("ini adalah statement 4 dg nilai 70 - 100");
        }else if(angka < 69 && angka >50){
            System.out.println("ini statement 2 dg nilai 69 - 50 kebawah");
        }else {
            System.out.println("ini adalah statement 3 dg nilai dibawah 50");
        }
        System.out.println("ini adalah akhir program");
    }
}
