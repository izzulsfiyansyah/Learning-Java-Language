package com.latihan.looping;
import java.util.*;
public class Main {
    public static void main(String[] args){

        // menggunakan do while
        int awal, akhir, total;

        System.out.println("program awal");

        System.out.print("menggunakan do while");
        Scanner inputUser = new Scanner(System.in);
        System.out.print("nilai awal = ");
        awal = inputUser.nextInt();
        System.out.print("nilai akhir = ");
        akhir = inputUser.nextInt();

        total = 0;
        do {
            total = total + awal;
            System.out.println("ditambah " + awal + " menjadi " + total);
            awal++;
        } while (awal <= akhir);

        System.out.println("program akhir");


        // menggunakan for loop
        int first, end, totaly;

        System.out.println("program awal");

        System.out.print("menggunakan for loop");
        Scanner inputAll = new Scanner(System.in);
        System.out.print("nilai awal = ");
        first = inputAll.nextInt();
        System.out.print("nilai akhir = ");
        end = inputAll.nextInt();

        for (totaly = 0; first <= end; first++){
            totaly = totaly + first;
            System.out.println("ditambah " + first + " menjadi " + totaly);
        }

        System.out.println("program akhir");

    }
}
