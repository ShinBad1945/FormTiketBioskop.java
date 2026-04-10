package Bioskop;

public class TiketReguler extends PemesananTiketBioskop {

    // CONSTRUCTOR
    public TiketReguler(String namaPenonton, String judulFilm,
                        String jamTayang, int jumlahTiket, int hargaTiket){
        super(namaPenonton, judulFilm, jamTayang, jumlahTiket, hargaTiket);
    }

    @Override
    public String cetakTiket(){
        return "=== TIKET REGULER ===\n" + super.cetakTiket();
    }
}