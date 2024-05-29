package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args){

        int nilaiAwal, nilaiAkhir, total;

        System.out.println("menggunakan while");
        Scanner inputUser = new Scanner(System.in);
        System.out.println("nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.println("nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        // menggunakan while
        total = 0;
        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

        // challenge do while, for loop

        // menggunakan do while
//        total = 0;
//        do {
//            total = total + nilaiAwal;
//            nilaiAwal++;
//            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//        } while (nilaiAwal <= nilaiAkhir);

        // menggunakan for loop
//        for(total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++){
//            total = total + nilaiAwal;
//            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//        }

    }
}
