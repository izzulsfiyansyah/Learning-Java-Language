package com.latihan.logic;

import java.util.*;

public class Logic {
    public static void main(String[] args){

        Scanner indorUser;
        String nama;
        String motor, sepeda, tasbag, buku;
        int nilai;

        indorUser = new Scanner(System.in);
        System.out.println("ini adalah awal program");
        System.out.print("Masukan nama : ");
        nama = indorUser.next();
        System.out.print("Masukan nilai : ");
        motor = ("motor vespa");
        sepeda = ("sepeda ontel");
        tasbag = ("tas bag jokowi");
        buku = ("buku albert enstein");
        nilai = indorUser.nextInt();

        if (nilai >=60){
            System.out.println("selamat " + nama + " anda mendapatkan bonus " + motor);
        }else if (nilai >= 40 && nilai < 60){
            System.out.println("selamat " + nama + " anda mendapatkan bonus " + sepeda);
        }else if(nilai >= 30 && nilai <40){
            System.out.println("selamat " + nama + " anda mendapatkan bonus " + tasbag);
        }else {
            System.out.println("selamat " + nama + " anda mendapatkan bonus " + buku);
        }
        System.out.println("ini adalah akhir program");

    }
}
