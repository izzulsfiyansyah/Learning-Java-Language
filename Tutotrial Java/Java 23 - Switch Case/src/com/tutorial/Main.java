
package com.tutorial;

import java.util.*;

public class Main {

    // switch case

    public static void main(String[] args){

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum

        switch(input){
            case "zuple":
                System.out.println("saya zuple dan hadir Bos!!!");
                break;
            case "heru":
                System.out.println("saya heru dan hadir Bos!!!!");
                break;
            case "dedex":
                System.out.println("saya dedex dan hadir Bos!!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }

        System.out.println("selesai program");

    }

}
