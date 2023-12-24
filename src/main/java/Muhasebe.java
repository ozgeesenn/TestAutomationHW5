public class Muhasebe {

    public static void main(String[] args)
    {
        MuhasebeTest eleman1 = new MuhasebeTest();
        MuhasebeTest eleman2 = new MuhasebeTest();
        MuhasebeTest eleman3 = new MuhasebeTest();
        MuhasebeTest eleman4 = new MuhasebeTest();

        eleman1.gunlukUcret = 300;
        eleman1.gunSayisi = 30;
        eleman1.maasHesapla();

        eleman2.gunlukUcret = 450;
        eleman2.gunSayisi = 24;
        eleman2.maasHesapla();

        eleman3.gunlukUcret = 500;
        eleman3.gunSayisi = 27;
        eleman3.maasHesapla();

        eleman4.gunlukUcret = 150;
        eleman4.gunSayisi = 31;
        eleman4.maasHesapla();


    }


}
