package com.tutorial;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String kalimat = "Saya suka makan kucing";

        // mengambil komponen dari string
        System.out.println(kalimat.charAt(5));

        // substring
        String kata = kalimat.substring(10,15);
        System.out.println(kata);

        // concatenation (concat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);

        kata = kata + " cireng";
        System.out.println(kata);

        // concat dengan non String
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah; // casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        // lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // replace
        String  kalimat4 = kalimat.replace("kucing","ayam");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        // compare
        String motor1 = "royal suzuki nex";
        String motor2 = "kawasaki ninja ss";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));

        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));

        // equality ( persamaan )
        String kataInput = "test"; // ini ada di string pool
//        String kataInput = new String("test"); // ini bukan String literal, dan tidak ada di string pool
        String kataTest = "test"; // ini ada di string pool

        System.out.println("\npersamaan pada lokasi string pool");
        if (kataInput == kataTest){
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.println("\nmengambil input string dari user: ");
        kataInput = userInput.next(); // tidak di string pool
        System.out.println("ini adalah input user : " + kataInput);

        if (kataInput.equals(kataTest)){
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }



    }
}
