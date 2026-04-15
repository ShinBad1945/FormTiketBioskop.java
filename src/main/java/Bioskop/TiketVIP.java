package Bioskop;

public class TiketVIP extends PemesananTiketBioskop {

    private int biayaTambahan = 20000;

    public TiketVIP(String namaPenonton, String judulFilm,
                    String jamTayang, int jumlahTiket, int hargaTiket){
        super(namaPenonton, judulFilm, jamTayang, jumlahTiket, hargaTiket);
    }

    public int getBiayaTambahan(){
        return biayaTambahan;
    }

    public void setBiayaTambahan(int biayaTambahan){
        this.biayaTambahan = biayaTambahan;
    }

    @Override
    public int hitungTotal(){
        return (getJumlahTiket() * getHargaTiket()) + biayaTambahan;
    }

    @Override
    public String cetakTiket(){
        return "=== TIKET VIP ===\n" +
               super.cetakTiket() +
               "\nBiaya Tambahan: Rp"+biayaTambahan;
    }
}