package Bioskop;

public class TiketVIP extends PemesananTiketBioskop {

    int biayaTambahan = 20000;

    // CONSTRUCTOR
    public TiketVIP(String namaPenonton, String judulFilm,
                    String jamTayang, int jumlahTiket, int hargaTiket){
        super(namaPenonton, judulFilm, jamTayang, jumlahTiket, hargaTiket);
    }
    
    @Override
    public int hitungTotal(){
        return (jumlahTiket * hargaTiket) + biayaTambahan;
    }

    @Override
    public String cetakTiket(){
        return "=== TIKET VIP ===\n" +
               super.cetakTiket() +
               "\nBiaya Tambahan: Rp"+biayaTambahan;
    }
}