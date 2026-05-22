package Bioskop;

public class TiketVIP extends PemesananTiketBioskop {
    // Biaya tambahan khusus untuk fasilitas VIP Studio
    private final int biayaTambahanVIP = 15000;

    public TiketVIP(String namaPembeli, String namaFilm, String studio, int jumlahTiket, int hargaDasar) {
        super(namaPembeli, namaFilm, studio, jumlahTiket, hargaDasar);
    }
    @Override
    public int hitungTotal() {
        // Menambahkan biaya VIP ke dalam kalkulasi total harga tiket
        return (hargaDasar + biayaTambahanVIP) * jumlahTiket;
    }
}