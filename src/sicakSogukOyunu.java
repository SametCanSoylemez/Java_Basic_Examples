package alistirma;

import java.util.Scanner;

public class sicakSogukOyunu {

    // İki basamaklı rastgele üretilen bir sayıyı tahmin etme....

    public static void main(String[] args) {

        int randomSayi = (int) (Math.random() * 100);
        Scanner klavye = new Scanner(System.in);

        int tahmin = -1;
        int tahminEtmeSayisi = 0;

        while (tahmin != randomSayi) {
            System.out.println("Tahmininizi Giriniz : ");
            tahmin = klavye.nextInt();
            tahminEtmeSayisi++;

            if (tahmin == randomSayi) {
                System.out.println("Tebrikler !!!  " + tahminEtmeSayisi + " seferde sayıyı buldunuz");
            } else if (tahmin > randomSayi) {
                System.out.println("Tahmin ettiğiniz sayı yüksek!!! \n Tahmininizi Düşürün...");
            } else {
                System.out.println("Tahmin ettiğiniz sayı düşük!!! \n Tahmininizi Yükseltin...");
            }
        }
    }
}
