//Nama  : Krisna Okky Widayat
//NIM   : 24060122140105

package bk.buku;

public class Buku{
    protected String judul,penulis,tahunTerbit;

    public Buku(String judul,String penulis,String tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getjudul(){
        return judul;
    }
    public String getpenulis(){
        return penulis;
    }
    public String gettahunTerbit(){
        return tahunTerbit;
    }

    public void setjudul(String judul){
        this.judul = judul;
    }
    public void setpenulis(String penulis){
        this.penulis = penulis;
    }
    public void view(){
        System.out.println("Buku berjudul "+getjudul() +" dengan penulis "+getpenulis() +" Terbit pada "+gettahunTerbit());
    }
}


