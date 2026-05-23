package Bioskop;

public class TiketVIP extends Tiket {
    public TiketVIP(String namaPembeli, String namaFilm, String studio, int jumlahTiket, int hargaDasar) {
        super(namaPembeli, namaFilm, studio, jumlahTiket, hargaDasar);
    }
    @Override
int hitungTotal() {
        int biayaTambahan = 15000 * jumlah;
        return (hargaDasar * jumlah) + biayaTambahan;
    }
}