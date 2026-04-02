package Bioskop;

// Class Pemesanan Tiket Bioskop
public class PemesananTiketBioskop {

    String namaPenonton;
    String judulFilm;
    String jamTayang;
    int jumlahTiket;
    int hargaTiket;

    // CONSTRUCTOR
    public PemesananTiketBioskop(String namaPenonton, String judulFilm,
                                 String jamTayang, int jumlahTiket, int hargaTiket){
        this.namaPenonton = namaPenonton;
        this.judulFilm = judulFilm;
        this.jamTayang = jamTayang;
        this.jumlahTiket = jumlahTiket;
        this.hargaTiket = hargaTiket;
    }

    // METHOD HITUNG TOTAL
    int hitungTotal(){
        return jumlahTiket * hargaTiket;
    }

    // METHOD CETAK
    String cetakTiket(){
        return "===== TIKET BIOSKOP =====\n"+
               "Nama        : "+namaPenonton+"\n"+
               "Film        : "+judulFilm+"\n"+
               "Jam Tayang  : "+jamTayang+"\n"+
               "Jumlah Tiket: "+jumlahTiket+"\n"+
               "Harga       : Rp"+hargaTiket+"\n"+
               "Total Bayar : Rp"+hitungTotal()+"\n"+
               "=========================";
    }
}