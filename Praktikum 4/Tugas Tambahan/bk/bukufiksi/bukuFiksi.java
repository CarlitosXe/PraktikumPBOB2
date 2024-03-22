//Nama  : Krisna Okky Widayat
//NIM   : 24060122140105

package bk.bukufiksi;

import bk.buku.Buku;

public class bukuFiksi extends Buku {
    protected String genre;
    protected int jumlahHalaman;
    protected double harga;

    public bukuFiksi(String judul,String penulis,String tahunTerbit,String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override

    public void view() {
        super.view();
        System.out.println("Buku dengan genre " + getGenre() + " dengan jumlah halaman " + getJumlahHalaman() + " dengan harga " + getHarga());
    }
}
