package Ogrenciler;

public class Ogrenci {
    
    private static int id;
    private int idKisisel;
    private String ad;
    private String soyad;

    public Ogrenci(String ad, String soyad)
    {
        id++;
        idKisisel = id;
        this.ad = ad;
        this.soyad = soyad;
    }

    public void BilgileriYazdir()
    {
        System.out.println("ID: " + idKisisel);
        System.out.println("AD: " + ad);
        System.out.println("SOYAD: " + soyad);
    }

    public void MezuniyetYiliHesapla()
    {
        System.out.println("ID: " + idKisisel);
        System.out.println("AD: " + ad);
    }

    public static int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getIdKisisel() {
        return idKisisel;
    }
}
