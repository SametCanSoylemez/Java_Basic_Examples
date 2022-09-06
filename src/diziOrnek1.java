package alistirma;

public class diziOrnek1 {
    public static void main(String[] args) {

        // 100 elamanlı rastgele sayılardan oluşan dizinin ortalaması
        System.out.println("********** Uygulama 1 **********");
        
        int[] dizi = new int[100];
        int sayilarinToplami = 0;
        for (int i = 0; i < dizi.length; i++) {
            
            int rastgeleSayi = (int) (Math.random() * 100);
            dizi[i] = rastgeleSayi;
            sayilarinToplami = sayilarinToplami + rastgeleSayi;
        }
        double ortalama = (double) sayilarinToplami / (double) dizi.length;
        System.out.println("Ortalama :" + ortalama);


        // Rastgele elamanlardan oluşmuş 3*2 lik matrisi
        // ve bu matristeki en büyük ile en küçük sayıyı ekrana yazdıran program.
        System.out.println("******** Uygulama 2 ********");
        
        int[][] dizi2 = new int[3][2];
        int enKucukSayi = 101;
        int enBuyukSayi = 0;

        for (int satir = 0; satir < dizi2.length; satir++) {

            for (int sutun = 0; sutun < dizi2[satir].length; sutun++) {

                int rastgeleSayi2 = (int) (Math.random() * 100);
                dizi2[satir][sutun] = rastgeleSayi2;
                System.out.println(satir + ". satıdaki " + sutun + " . sutunun elamanı :" + dizi2[satir][sutun]);

                if (enKucukSayi > rastgeleSayi2) {
                    enKucukSayi = rastgeleSayi2;
                }
                if (enBuyukSayi < rastgeleSayi2) {
                    enBuyukSayi = rastgeleSayi2;
                }
            }

        }
        System.out.println("Dizinin en küçük sayısı: " + enKucukSayi);
        System.out.println("Dizinin en büyük sayısı: " + enBuyukSayi);

    }
}
