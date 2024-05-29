package com.tutorial;

public class Main {
    public static void main(String[] args){

        // void itu artinya hampa
        fungsiVoid("who are u?");
        selamatPagi("emak");
        selamatPagi("bapakk");
        System.out.println(simple());
    }

    // fungsi atau method tanpa kembalian
    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    // fungsi atau method dengan kembalian sehingga menggunakan
    // return untuk mengembalikan nilai (10.0f)
    private static float simple(){
        return 10.0f;
    }

}
