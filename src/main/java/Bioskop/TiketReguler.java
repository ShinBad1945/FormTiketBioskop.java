package Bioskop;

public class TiketReguler extends Tiket implements FasilitasUtama, LayananCetak {

    public TiketReguler(String namaPembeli, String namaFilm, String studio, int jumlahTiket, int hargaDasar) {
        super(namaPembeli, namaFilm, studio, jumlahTiket, hargaDasar);
    }

    @Override
    public int hitungTotal() {
        return hargaDasar * jumlah;
    }
    // Mengimplementasikan Interface FasilitasUtama
    @Override
    public String getInfoAudio() {
        return "Dolby Digital 5.1";
    }

    // Mengimplementasikan Interface LayananCetak
    @Override
    public String getFormatNotaSingkat() {
        return "REG-" + nama.substring(0, Math.min(nama.length(), 3)).toUpperCase() + "-" + jumlah;
    }
}