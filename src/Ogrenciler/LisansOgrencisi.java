package Ogrenciler;

public class LisansOgrencisi extends Ogrenci{

    private String durum;
    private int sinif;
    private int vize_not;
    private int final_not;

    public LisansOgrencisi(String ad, String soyad, int sinif, int vize_not, int final_not)
    {
        super(ad, soyad);
        durum = "Lisans";
        this.sinif = sinif;
        this.vize_not = vize_not;
        this.final_not = final_not;
    }

    public void GecmeNotuHesapla()
    {
        System.out.println("ID: " + getIdKisisel());
        System.out.println("AD: " + super.getAd());
        System.out.println("GECME NOTU: " + ((vize_not * 2 + final_not * 3)/5));
    }

    @Override
    public void BilgileriYazdir() {
        // TODO Auto-generated method stub
        super.BilgileriYazdir();
        System.out.println("DURUM: " + durum);
        System.out.println("SINIF: " + sinif);
        System.out.println("VIZE: " + vize_not);
        System.out.println("FINAL: " + final_not);
    }

    @Override
    public void MezuniyetYiliHesapla() {
        // TODO Auto-generated method stub
        super.MezuniyetYiliHesapla();
        System.out.println("MEZUNIYET YILINIZ: " + (2021 + 5 - sinif));
    }
}
