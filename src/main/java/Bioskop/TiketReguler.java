package Bioskop;

public class TiketReguler extends Tiket {

    public TiketReguler(String namaPembeli, String namaFilm, String studio, int jumlahTiket, int hargaDasar) {
        super(namaPembeli, namaFilm, studio, jumlahTiket, hargaDasar);
    }

    @Override
    public int hitungTotal() {
        return hargaDasar * jumlah;
    }
}