package Bioskop;

public class PemesananTiketBioskop {

    // atribut dibuat PRIVATE (enkapsulasi)
    private String namaPenonton;
    private String judulFilm;
    private String jamTayang;
    private int jumlahTiket;
    private int hargaTiket;

    // CONSTRUCTOR
    public PemesananTiketBioskop(String namaPenonton, String judulFilm,
                                 String jamTayang, int jumlahTiket, int hargaTiket){
        this.namaPenonton = namaPenonton;
        this.judulFilm = judulFilm;
        this.jamTayang = jamTayang;
        this.jumlahTiket = jumlahTiket;
        this.hargaTiket = hargaTiket;
    }

    public String getNamaPenonton(){
        return namaPenonton;
    }

    public void setNamaPenonton(String namaPenonton){
        this.namaPenonton = namaPenonton;
    }

    public String getJudulFilm(){
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm){
        this.judulFilm = judulFilm;
    }

    public String getJamTayang(){
        return jamTayang;
    }

    public void setJamTayang(String jamTayang){
        this.jamTayang = jamTayang;
    }

    public int getJumlahTiket(){
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket){
        this.jumlahTiket = jumlahTiket;
    }

    public int getHargaTiket(){
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket){
        this.hargaTiket = hargaTiket;
    }

    // method hitung total
    public int hitungTotal(){
        return jumlahTiket * hargaTiket;
    }

    // method cetak
    public String cetakTiket(){
        return "Nama        : "+namaPenonton+"\n"+
               "Film        : "+judulFilm+"\n"+
               "Jam Tayang  : "+jamTayang+"\n"+
               "Jumlah Tiket: "+jumlahTiket+"\n"+
               "Total Bayar : Rp"+hitungTotal();
    }
}