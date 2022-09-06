package alistirma;

import java.util.Scanner;

public class diziOrnek4 {
    public static void main(String[] args) {

        //  1)) 5*5 bir matris oluşturun ve bu matrisin elamanları 0-9 arasında rastgele sayılar olsun.
        // Bu matrisi ekrana yazdıran ve çapraz elamanların toplamını gösteren program.
        /*
        int[][] dizi = new int[5][5];
        int caprazToplam = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int rastgeleSayi = (int) (Math.random() * 10);
                dizi[i][j] = rastgeleSayi;
                System.out.print(dizi[i][j] + "  ");
            }
            caprazToplam += dizi[i][i];
            System.out.println();
        }
        System.out.println("****************");

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if ((i + j) == dizi.length - 1) {
                    caprazToplam += dizi[i][j];
                }
            }
            System.out.println();
        }
        System.out.print("capraz toplam" + caprazToplam);
*/


        //  2)) Decimal sayıları binary formatın çeviren program.
        // Örneğin program 30 sayısı için 1 1 1 1 0 çıktısını üretmeli.
/*
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int girilenSayi= klavye.nextInt();
        String binarySayi= "";
        if (girilenSayi==0){
            binarySayi="0";
        }
        while (girilenSayi>0){
            int mod = girilenSayi % 2;
            binarySayi= mod+binarySayi;         // + işlemi toplama değil de string olduğu için yan yana yazma için kullanılmıştır.
            girilenSayi = girilenSayi/2;
        }
        System.out.println("Binary Sayı : " + binarySayi);
*/

        // 3)) Küçük x lerle büyük X şekli çizen program
        // Mesela satır sayısı 5 olan program şu şekilde olmalıdır;
        /*  x       x
              x   x
                x
              x   x
            x       x
         */

        Scanner klavye = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz.");
        int satirSayisi = klavye.nextInt();

        for (int i = 0; i < satirSayisi; i++) {

            for (int j = 0; j < satirSayisi; j++) {

                if (i == j || j == (satirSayisi - i - 1)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}