package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args){

        int f_n, f_n1, f_n2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nila fibonacci ke = ");
        n = inputUser.nextInt();

        f_n2 = 0;
        f_n1 = 1;
        f_n = 1;

//         menggunakan for
        for(int i = 1; i <= n; i++){
            System.out.println(" nilai ke - " + i + " adalah " + f_n);
            f_n = f_n1 + f_n2;
            f_n2 = f_n1;
            f_n1 = f_n;
        }

        // menggunakan do while *challenge*
//        int i = 1;
//        do {
//            System.out.println(" nilai ke - " + i + " adalah " + f_n);
//            f_n = f_n1 + f_n2;
//            f_n2 = f_n1;
//            f_n1 = f_n;
//            i++;
//        } while (i <= n);

        // menggunakan while *challenge*
//        int i = 1;
//        while (i <= n){
//            System.out.println(" nilai ke - " + i + " adalah " + f_n);
//            f_n = f_n1 + f_n2;
//            f_n2 = f_n1;
//            f_n1 = f_n;
//            i++;
//        }
    }
}
