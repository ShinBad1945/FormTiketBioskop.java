package Bioskop;

public class TiketReguler extends PemesananTiketBioskop {

    public TiketReguler(String namaPembeli, String namaFilm, String studio, int jumlahTiket, int hargaDasar) {
        super(namaPembeli, namaFilm, studio, jumlahTiket, hargaDasar);
    }

    @Override
    public int hitungTotal() {
        return hargaDasar * jumlahTiket;
    }
}