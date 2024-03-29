/* Nama File : segitiga.java
 * Nama      : Krisna Okky Widayat
 * Nim       : 24060122140105
 * Deskripsi : 
 */
 public class Segitiga{
    private double Alas;
    private double Tinggi;

    Segitiga(double Alas, double Tinggi){
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }
    public double getAlas(){
        return Alas;
    }
    public double getTinggi(){
        return Tinggi;
    }
    public double hitungLuas(){
        return 0.5 * Alas * Tinggi;
    }
    public double sisiMiring() {
        return Math.sqrt(Math.pow(getAlas() / 2, 2) + Math.pow(getTinggi(), 2));
    }
 }