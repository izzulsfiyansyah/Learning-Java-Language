package com.latihan.looping;

public class Main {
    public static void main(String[] args){
/*

        System.out.println();
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
//
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
*/
        int rows = 5; // Jumlah baris (ukuran) wajik
        int space = rows - 1; // Jumlah spasi kosong pada setiap baris
        int i, j;

        // Bagian atas wajik
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;

            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bagian bawah wajik
        space = 1;
        for (i = 1; i <= rows - 1; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;

            for (j = 1; j <= 2 * (rows - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

