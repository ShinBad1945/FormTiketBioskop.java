package Bioskop;

public class TiketVIP extends Tiket implements Diskonable, FasilitasUtama, LayananCetak {
    public TiketVIP(String namaPembeli, String namaFilm, String studio, int jumlahTiket, int hargaDasar) {
        super(namaPembeli, namaFilm, studio, jumlahTiket, hargaDasar);
    }
    @Override
int hitungTotal() {
        int biayaTambahan = 15000 * jumlah;
        double totalKotor = (hargaDasar * jumlah) + biayaTambahan;
        return (int) (totalKotor - hitungDiskon());
    }
// Mengimplementasikan Interface Diskonable (Misal diskon 10% jika beli VIP > 2 tiket)
    @Override
    public double hitungDiskon() {
        if (jumlah > 2) {
            return (hargaDasar * jumlah) * 0.10; 
        }
        return 0;
    }

    // Mengimplementasikan Interface FasilitasUtama
    @Override
    public String getInfoAudio() {
        return "Dolby Atmos / DTS:X Premium";
    }

    // Mengimplementasikan Interface LayananCetak
    @Override
    public String getFormatNotaSingkat() {
        return "VIP-" + nama.substring(0, Math.min(nama.length(), 3)).toUpperCase() + "-" + jumlah;
    }
    
    // Method tambahan pendukung cetak text
    public String getFasilitas() {
        return "Premium Seat + Free Snack & Drink";
    }
}