/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author ASUS
 */
public class Senjata {
    private String bunyi;
    private int peluru;

    // Konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0; // Default peluru kosong
    }

    // Metode untuk mendapatkan bunyi senjata
    public String getBunyi() {
        return bunyi;
    }

    // Metode untuk mendapatkan jumlah peluru
    public int getPeluru() {
        return peluru;
    }

    // Metode untuk menembak
    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--;
            System.out.println("Sisa peluru: "+ peluru);
        } else {
            System.out.println("Tidak ada peluru tersisa.");
        }
    }

    // Metode untuk mengatur bunyi senjata
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    // Metode untuk mengatur jumlah peluru
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}

