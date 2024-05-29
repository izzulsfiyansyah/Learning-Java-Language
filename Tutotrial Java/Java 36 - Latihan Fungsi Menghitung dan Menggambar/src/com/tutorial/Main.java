package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang, inputLebar);

//        // ini tidak memakai fungsi hanya aksi saja
//        System.out.println("luas = " + luas(inputPanjang,inputLebar));
//        System.out.println("keliling = " + keliling(inputPanjang,inputLebar));

        tampilkanKelilingDanLuas(inputPanjang, inputLebar);
    }
    // ini jika memakai fungsi dan bisa berulang-ulang
    private static void tampilkanKelilingDanLuas(int panjang, int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("keliling = " + keliling(panjang,lebar));
    }

    // method menghasilkan kembalian
    private static int keliling(int panjang, int lebar){
        int hasil = (panjang+lebar)*2;
        return hasil;
    }
    // method menghasilkan kembalian
    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        return hasil;
    }
    // method void itu hanya aksi saja tanpa mangembilikan sesuatu
    private static void gambar(int panjang, int lebar){

        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

