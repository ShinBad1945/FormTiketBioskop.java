package Bioskop;

public class PemesananTiketBioskop {
    
    protected String namaPembeli;
    protected String namaFilm;
    protected String studio; //Jam Tayang
    protected int jumlahTiket;
    protected int hargaDasar; 

    public PemesananTiketBioskop(String namaPembeli, String namaFilm, String studio, int jumlahTiket, int hargaDasar) {
        this.namaPembeli = namaPembeli;
        this.namaFilm = namaFilm;
        this.studio = studio;
        this.jumlahTiket = jumlahTiket;
        this.hargaDasar = hargaDasar;
    }

    public int hitungTotal() {
        return hargaDasar * jumlahTiket;
    }

    public String getNama() {
        return namaPembeli;
    }

    public String getFilm() {
        return namaFilm;
    }

    public String getJam() {
        return studio; 
    }

    public int getJumlah() {
        return jumlahTiket;
    }
    public void infoPemesanan() {
        System.out.println("Tiket berhasil dipesan untuk film: " + namaFilm);
    }
    public void infoPemesanan(String statusPembayaran) {
        System.out.println("Tiket film: " + namaFilm + " | Status: " + statusPembayaran);
    }
}