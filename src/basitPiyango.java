package alistirma;

import java.util.Scanner;

public class basitPiyango {
    public static void main(String[] args) {

        /* Küçük bir piyango oyunu. Sistem iki basamaklı bir sayı üretmeli.Kullanıcıdan da bu
        sayıyı tahmin etmesini istemelisiniz.
        Eğer kullanıcı bu sayıyı doğru tahmin edebilirse 10000 tl;
        Eğer kullanıcı sayının basamaklarını bilirse (Ör: 65 yerine 56) 5000 tl;
        Eğer kullanıcı herhangi bir basamağını bilirse 1000 tl kazanacaktır.
         */


        Scanner klavye = new Scanner(System.in);
        int rastgeleSayi = (int)(Math.random() * 100);
        System.out.println("rastgeleSayı :" + rastgeleSayi );      //Test İşlemi için
        System.out.println("Lütfen iki basamaklı bir sayı tahmin edin:");     // kullanıcıdan veri isteme
        int tahminiSayi = klavye.nextInt();


        int rastegeleBirinciBasmak = rastgeleSayi / 10;
        int rastegeleİkinciBasamak = rastgeleSayi % 10;          // random sayıyı basamakların ayırma

        int tahminiBirinciBasamak = tahminiSayi / 10;
        int tahminiİkinciBasamk = tahminiSayi % 10;               // tahmin edilen sayıyı basamaklarına ayırma

         if(tahminiSayi == rastgeleSayi){                          //koşullar
             System.out.println("Tebrikler 10000 Tl kazandınız...");
             System.out.println("Tahmin ettiğiniz sayı : " + tahminiSayi + "\nPiyango sayısı : " + rastgeleSayi);
             return;
         }else if (rastegeleBirinciBasmak==tahminiİkinciBasamk && rastegeleİkinciBasamak==tahminiBirinciBasamak ){
            System.out.println("Tebrikler 5000 Tl kazandınız...");
            System.out.println("Tahmin ettiğiniz sayı : " + tahminiSayi + "\nPiyango sayısı : " + rastgeleSayi);
            return;
         }else if (rastegeleBirinciBasmak==tahminiİkinciBasamk || rastegeleİkinciBasamak==tahminiBirinciBasamak
                   || rastegeleBirinciBasmak == tahminiBirinciBasamak || rastegeleİkinciBasamak == tahminiİkinciBasamk) {
             System.out.println("Tebrikler 1000 Tl kazandınız...");
             System.out.println("Tahmin ettiğiniz sayı : " + tahminiSayi + "\nPiyango sayısı : " + rastgeleSayi);
         return;
         }else {
             System.out.println("Başarısız oldunuz. Tekrar deneyiniz...");
             System.out.println("Tahmin ettiğiniz sayı : " + tahminiSayi +  "\nPiyango sayısı : " + rastgeleSayi);
         }
    }
}
