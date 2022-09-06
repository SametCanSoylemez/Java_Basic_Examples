package alistirma;

import java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {

        double vucutKitleEndeksi;

        Scanner klavye = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz(cm) : ");
        Double boy = klavye.nextDouble();
        System.out.println("Kilonuzu giriniz(kg) : ");
        Double kilo = klavye.nextDouble();
        vucutKitleEndeksi = kilo / ((boy / 100) * (boy / 100));
        System.out.println("Vücüt kitle endeksiniz : " + vucutKitleEndeksi);

        if (vucutKitleEndeksi < 15) {
            System.out.println("Çok ciddi dercede düşük kiloya sahipsiniz!!!");
        } else if (15 < vucutKitleEndeksi && vucutKitleEndeksi < 16) {
            System.out.println("Ciddi derecede düşük kiloya sahipsiniz!!!");
        } else if (16 < vucutKitleEndeksi && vucutKitleEndeksi < 18.5) {
            System.out.println("Düşük kiloya sahipsiniz!!!");
        } else if (18.5 < vucutKitleEndeksi && vucutKitleEndeksi < 25) {
            System.out.println("Normal sağlıklı kiloya sahipsiniz:)");
        } else if (25 < vucutKitleEndeksi && vucutKitleEndeksi < 30) {
            System.out.println("Fazla kiloya sahipsiniz!!!");
        } else if (30 < vucutKitleEndeksi && vucutKitleEndeksi < 35) {
            System.out.println("1.Dereceden (hafif) obezsiniz!!!");
        } else if (35 < vucutKitleEndeksi && vucutKitleEndeksi < 40) {
            System.out.println("2.Dereceden (ciddi) obezsiniz!!!");
        } else {
            System.out.println("3.Dereceden (çok ciddi) obezsiniz!!!");
        }


    }
}
