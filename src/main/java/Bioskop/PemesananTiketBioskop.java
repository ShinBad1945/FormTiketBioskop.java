package Bioskop;

public class PemesananTiketBioskop {

    String namaPenonton;
    String judulFilm;
    String jamTayang;
    int jumlahTiket;

    void dataNamaPenonton(String namaPenonton){
        this.namaPenonton = namaPenonton;
    }

    void dataJudulFilm(String judulFilm){
        this.judulFilm = judulFilm;
    }

    void dataJamTayang(String jamTayang){
        this.jamTayang = jamTayang;
    }

    void dataJumlahTiket(int jumlahTiket){
        this.jumlahTiket = jumlahTiket;
    }

    String cetakNamaPenonton(){
        return namaPenonton;
    }

    String cetakJudulFilm(){
        return judulFilm;
    }

    String cetakJamTayang(){
        return jamTayang;
    }

    int cetakJumlahTiket(){
        return jumlahTiket;
    }
}