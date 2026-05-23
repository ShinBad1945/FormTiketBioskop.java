/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bioskop;

/**
 *
 * @author panji
 */
public abstract class Tiket {
    protected String nama;
    protected String film;
    protected String jam;
    protected int jumlah;
    protected int hargaDasar;
    
    // Konstruktor untuk menginisialisasi data dasar pemesanan tiket
    public Tiket(String nama, String film, String jam, int jumlah, int hargaDasar) {
        this.nama = nama;
        this.film = film;
        this.jam = jam;
        this.jumlah = jumlah;
        this.hargaDasar = hargaDasar;
}
    abstract int hitungTotal();
    
    // Getter biasa (Non-Abstract Method) yang bisa langsung digunakan kelas anak
    public String getNama() { return nama; }
    public String getFilm() { return film; }
    public String getJam() { return jam; }
    public int getJumlah() { return jumlah; }
    public int getHargaDasar() { return hargaDasar; }
}
