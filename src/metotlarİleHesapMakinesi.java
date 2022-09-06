package alistirma;

import java.util.Scanner;

public class metotlarİleHesapMakinesi {
    public static void main(String[] args) {

// Kullanıcının girdiği iki sayının dört işlem, mod ve kuvvetini alan program ( metotlar ile).

        double kullaniciSecimi = -1;
        for (; ; ) {               //menüyü sürekli göstermesi için
            kullaniciSecimi = menuGöster();
            if (kullaniciSecimi == 0) {
                break;
            }
            Scanner klavye = new Scanner(System.in);
            System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
            double birinciSayi = klavye.nextDouble();
            System.out.println("Lütfen İkinci Sayıyı Giriniz");
            double ikinciSayi = klavye.nextDouble();

            switch ((int) kullaniciSecimi) {
                case 1:
                    sayilariTopla(birinciSayi, ikinciSayi);
                    break;
                case 2:
                    sayilarinFarki(birinciSayi, ikinciSayi);
                    break;
                case 3:
                    sayilarinCarpimi(birinciSayi, ikinciSayi);
                    break;
                case 4:
                    sayilarinBolumu(birinciSayi, ikinciSayi);
                    break;
                case 5:
                    sayilarinModu(birinciSayi, ikinciSayi);
                    break;
                case 6:
                    sayilarinKuvveti(birinciSayi, ikinciSayi);
                    break;
            }
        }
    }

    public static void sayilariTopla(double birinciSayi, double ikinciSayi) {
        System.out.println("Sayıların Toplamı = " + (birinciSayi + ikinciSayi));
    }

    public static void sayilarinFarki(double birinciSayi, double ikinciSayi) {
        System.out.println("Sayıların Farkı = " + (birinciSayi - ikinciSayi));
    }

    public static void sayilarinCarpimi(double birinciSayi, double ikinciSayi) {
        System.out.println("Sayıların Çarpımı = " + (birinciSayi * ikinciSayi));
    }

    public static void sayilarinBolumu(double birinciSayi, double ikinciSayi) {
        System.out.println("Sayıların Bölümü = " + (birinciSayi / ikinciSayi));
    }

    public static void sayilarinModu(double birinciSayi, double ikinciSayi) {
        System.out.println("Sayıların Modu = " + (birinciSayi % ikinciSayi));
    }

    public static void sayilarinKuvveti(double birinciSayi, double ikinciSayi) {
        System.out.println("Sayıların  Kuvveti = " + Math.pow(birinciSayi, ikinciSayi));
    }


    public static double menuGöster() {
        System.out.println("-------------------------------");
        System.out.println(" **** Menü ****");
        System.out.println("1- İki Saynın Toplamını Bul ");
        System.out.println("2- İki Sayının Farkını bul");
        System.out.println("3- İki Sayının Çarpımını bul");
        System.out.println("4- İki Sayının Bölümünü bul");
        System.out.println("5- İki Sayının Modunu bul");
        System.out.println("6- İki Sayının Kuvvetini bul");
        System.out.println("Çıkmak için 0' a Basınız");

        Scanner klavye = new Scanner(System.in);
        double secim = klavye.nextInt();
        return secim;
    }
}
