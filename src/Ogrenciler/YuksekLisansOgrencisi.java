package Ogrenciler;

public class YuksekLisansOgrencisi extends Ogrenci{

    private String durum;
    private String asama;
    private int final_not;

    public YuksekLisansOgrencisi(String ad, String soyad, String asama, int final_not)
    {
        super(ad, soyad);
        durum = "Yuksek Lisans";
        if("Ders".equals(asama) || "Tez".equals(asama))
        {
            this.asama = asama;
        }
        this.final_not = final_not;
    }

    public void HarfHesapla()
    {
        if(final_not >= 90)
            System.out.println("HARF NOTU: AA");

        else if(final_not >=        80)
            System.out.println("HARF NOTU: BA");

        else if(final_not >= 70)
            System.out.println("HARF NOTU: BB");

        else if(final_not >= 60)
            System.out.println("HARF NOTU: CC");

        else if(final_not >= 50)
            System.out.println("HARF NOTU: DC");

        else if(final_not >= 40)
            System.out.println("HARF NOTU: DD");

        else if(final_not >= 30)
            System.out.println("HARF NOTU: FD");

        else
            System.out.println("HARF NOTU: FF");
    }

    @Override
    public void BilgileriYazdir() {
        // TODO Auto-generated method stub
        super.BilgileriYazdir();
        System.out.println("DURUM: " + durum);
        System.out.println("ASAMA: " + asama);
        System.out.println("FINAL: " + final_not);
    }

    @Override
    public void MezuniyetYiliHesapla() {
        // TODO Auto-generated method stub
        super.MezuniyetYiliHesapla();
        if(asama.equals("Ders"))
            System.out.println("1 seneden fazla");

        else
            System.out.println("Bir seneden az");
    }
}
