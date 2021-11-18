package Ogrenciler;

public class AnaSayfa {
    public static void main(String[] args) {
        
        Ogrenci ogrnci = new Ogrenci("Ali Ihsan", "TASDELEN");
        LisansOgrencisi lsns = new LisansOgrencisi("Bilal", "Gozubenli", 3, 60, 85);
        YuksekLisansOgrencisi yksk = new YuksekLisansOgrencisi("Murat", "Yardimci", "Tez", 63);

        ogrnci.BilgileriYazdir();
        System.out.println("\n");
        lsns.BilgileriYazdir();
        System.out.println("\n");
        lsns.GecmeNotuHesapla();
        System.out.println("\n");
        lsns.MezuniyetYiliHesapla();
        System.out.println("\n");
        yksk.BilgileriYazdir();
        System.out.println("\n");
        yksk.HarfHesapla();
        System.out.println("\n");
        yksk.MezuniyetYiliHesapla();

    }
}