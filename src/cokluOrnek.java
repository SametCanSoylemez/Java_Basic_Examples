package alistirma;

public class cokluOrnek {
     /* Örnek1 --------
        System.out.println("Sizden üç adet sayı girmeniz istenecektir");
        Scanner klavye = new Scanner(System.in);

        System.out.println("Lütfen birinci sayıyı giriniz");
        int sayi1 = klavye.nextInt();

        System.out.println("Lütfen ikincii sayıyı giriniz");
        int sayi2 = klavye.nextInt();

        System.out.println("lütfen üçüncü sayıyı giriniz");
        int sayi3 = klavye.nextInt();

        double ortalama =(double) (sayi1 + sayi2 + sayi3) / 3;
        System.out.println("Girilen Sayıların Ortalaması: " + ortalama) ;
*/
// örnek2 ------------
/*
        System.out.println("-----Lütfen üçgenin kenarlarını giriniz------");
        Scanner klavye = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz");
        int birinciKenar = klavye.nextInt();

        System.out.println("İkinci kenarı giriniz");
        int ikinciKenar = klavye.nextInt();

        System.out.println("Üçüncü kenarı giriniz");
        int ucuncuKenar = klavye.nextInt();

        if (birinciKenar != ikinciKenar && ikinciKenar != ucuncuKenar && birinciKenar != ucuncuKenar){
            System.out.println("Çeşitkenar üçgen");
        }else if (birinciKenar == ikinciKenar && ikinciKenar == ucuncuKenar && birinciKenar == ucuncuKenar){
            System.out.println("Eşkenar Üçgen");
        }else{
            System.out.println("İkizkenar Üçgen");
        }
*/
    // örnek3
/*
        Scanner klavye = new Scanner(System.in);
        System.out.println("Vize notunu Giriniz");
        int vize = klavye.nextInt();

        System.out.println("Final notunu giriniz");
        int finalNotu = klavye.nextInt();

        vize = vize * 40/100;
        finalNotu = finalNotu * 60/100;

        int not = vize + finalNotu;

        if (not >= 50) {
            System.out.println("Tebrikler sınavı geçtiniz");
        }else{
            System.out.println("Malasef sınavdan kaldınız");
        }
*/

    //örnek4
   /*     int i ;
      for (i =0; i<5;i++){
          System.out.println("Samet Can SÖYLEMEZ");
      }
        System.out.println("-----------------------------");
      int a =0;
        while (a<5) {
            System.out.println("Samet Can SÖYLEMEZ");
            a++;
        }
*/
    //örnek5
/*
        int toplam = 0;
        for (int sayac = 0; sayac<100; sayac++){
            toplam = toplam+sayac;
        }
        System.out.println("1 den 100 e kadar sayıların toplamı : " + toplam);

*/
    // örnek6
         /*
        Scanner klavye = new Scanner(System.in);
        System.out.println("Faktoriyeli hesaplanacak sayıyı giriniz");
        int sayi = klavye.nextInt();
     int carpim=1;
        for (int i = 1; i<=sayi; i++ ){
            carpim= i * carpim;
        }

        System.out.println("Girilen sayının faktoriyeli : " + carpim);

*/
}
