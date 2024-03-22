package bk.bukunonfiksi;

import bk.buku.Buku;

public class bukunonFiksi extends Buku{
    protected String subjek;
    protected int jumlahHalaman;
    protected double harga;

    public bukunonFiksi(String judul,String penulis,String tahunTerbit,String subjek,int jumlahHalaman,double harga){
        super(judul,penulis,tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }
    public String getsubjek(){
        return this.subjek;
    }
    public int getjumlahHalaman(){
        return this.jumlahHalaman;
    }
    public double getharga(){
        return this.harga;
    }

    public void setsubjek(String subjek){
        this.subjek = subjek;
    }

    public void setjumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setharga(double harga){
        this.harga = harga;
    }
    @Override

    public void view(){
        super.view();
        System.out.println("Buku dengan subjek "+ getsubjek()+" memiliki jumlah halaman "+getjumlahHalaman()+" dengan harga "+getharga());
    }
}
