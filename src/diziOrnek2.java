package alistirma;

public class diziOrnek2 {
    public static void main(String[] args) {
        // İskambil destesini dizi ile oluşturup sonrasında bu elamanları karıştırıp
        // kullanıcıya ilk hangi 4 kağıdın geldiğini gösteren program.
        String kartTurleri[] = {"Kupa", "Maça", "Karo", "Sinek"};
        String kartNo[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Kız", "Papaz"};
        int deste[] = new int[52];
        desteOlustur(deste);
        desteyiKaristir(deste);
        desteGoster(deste, kartTurleri, kartNo);

    }

    private static void desteyiKaristir(int[] deste) {
        for (int i = 0; i < 4; i++) {
            int rastgeleDeste = (int) (Math.random() * deste.length);
            int gecici = deste[i];

            deste[i] = deste[rastgeleDeste];
            deste[rastgeleDeste] = gecici;
        }
    }

    private static void desteGoster(int[] deste, String[] kartTurleri, String[] kartNo) {
        for (int i = 0; i < deste.length; i++) {
            String kartTuru = kartTurleri[deste[i] / 13];
            String kartNumarasi = kartNo[deste[i] % 13];
            System.out.println(kartTuru + " " + kartNumarasi);
        }
    }

    private static void desteOlustur(int[] deste) {
        for (int i = 0; i < deste.length; i++) {
            deste[i] = i;
        }
    }
}
