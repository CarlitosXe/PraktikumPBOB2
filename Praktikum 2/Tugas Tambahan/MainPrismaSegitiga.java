/* Nama File : MainPrismaSegitiga.java
 * Nama      : Krisna Okky Widayat
 * Nim       : 24060122140105
 * Deskripsi : 
 */

 public class MainPrismaSegitiga {
    public static void main(String[] args){
        Segitiga S1 = new Segitiga(3,4);
        PrismaSegitiga P1 = new PrismaSegitiga(S1, 5);

        System.out.println("Alas: "+S1.getAlas());
        System.out.println("Tinggi: "+S1.getTinggi());
        System.out.println("Tinggi Prisma: "+P1.getTinggi());
        System.out.println("Volume: "+P1.hitungVolume());
        System.out.println("LuasPermukaan: "+P1.hitungLuasPermukaan());
    }
 }