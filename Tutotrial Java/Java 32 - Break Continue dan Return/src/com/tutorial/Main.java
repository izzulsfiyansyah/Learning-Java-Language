package com.tutorial;

public class Main {
    public static void main(String[] args){ // ini adalah metod atau main

        // break, continue, return

        System.out.println("awal dari looping");
        int a = 0;
        while (true){
            a++;
            if(a==10){
                break; // ini adalah keyword untuk  memaksa untuk keluar dari loop
            } else if (a == 5){
                continue; // ini adalah keyword untuk memaksa memulai loop dari awal
            } else if (a == 7){
                return; // ini adalah keyword untuk memaksa keluar dari program atau finish
            }
            System.out.println("looping ke " + a);
        }
        System.out.println("akhir dari looping");
    }
}
