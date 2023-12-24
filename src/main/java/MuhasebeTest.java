public class MuhasebeTest {

    int gunSayisi;
    int gunlukUcret;
    int maas;
    int pirim;

    void maasHesapla(){

        if(gunSayisi<=25)
        {
            maas=gunSayisi*gunlukUcret;
            System.out.println("Kisinin maasi:" + maas);
        }
        else if(gunSayisi>25)
        {
            maas = gunSayisi*gunlukUcret;
            pirim = (gunSayisi-25) * 1000;
            System.out.println("Kisinin maasi:" + (maas+pirim));
        }
        else
        {
            System.out.println("Yanlış giris yaptiniz!!");
        }

    }


}
