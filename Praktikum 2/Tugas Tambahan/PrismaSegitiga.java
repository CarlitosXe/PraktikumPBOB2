/* Nama File : PrismaSegitiga.java
 * Nama      : Krisna Okky Widayat
 * Nim       : 24060122140105
 * Deskripsi : 
 */

 public class PrismaSegitiga{
    private Segitiga Alas;
    private double Tinggi;

    PrismaSegitiga(Segitiga Alas, double Tinggi){
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }
     public double hitungVolume(){
        double x = Alas.hitungLuas();
        return x * Tinggi;
     }
     public double hitungLuasPermukaan(){
        double p = Alas.hitungKeliling();
        return (2 *Alas.hitungLuas())+(p * Tinggi);
     }
     public double getTinggi(){
        return Tinggi;
     }
 }