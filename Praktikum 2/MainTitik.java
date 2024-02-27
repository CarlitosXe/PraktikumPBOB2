//Nama      : Krisna Okky Widayat
//Nim       : 24060122140105

public class MainTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(1);
        T1.setOrdinat(2);

        Titik T2 = new Titik();
        T2.setAbsis(3);
        T2.setOrdinat(4);

        Titik T3 = new Titik(7, 1);

        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("T1(" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
        System.out.println("T2(" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
        System.out.println("T3(" + T3.getAbsis() + "," + T3.getOrdinat() + ")");
        System.out.println("Jarak titik T1 ke pusat = " + T1.getJarakPusat());
        System.out.println("Jarak titik T2 ke pusat = " + T2.getJarakPusat());
        System.out.println("Jarak titik T3 ke pusat = " + T3.getJarakPusat());
        
        T1.refleksiX();
        T2.refleksiY();
        T3.refleksiX();
        System.out.println(
                "T1 setelah direfleksikan terhadap sumbu X adalah = " + "(" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
        System.out.println(
                "T2 setelah direfleksikan terhadap sumbu Y adalah = " + "(" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
        System.out.println(
                "T3 setelah direfleksikan terhadap sumbu X adalah = " + "(" + T3.getAbsis() + "," + T3.getOrdinat() + ")");
        
        Titik TreflexsiX = T1.getRefleksiX();
        System.out.println("T1 refleksi sumbu X = (" + TreflexsiX.getAbsis() + "," + TreflexsiX.getOrdinat() + ")");
        Titik TreflexsiY = T2.getRefleksiY();
        System.out.println("T2 refleksi sumbu Y = (" + TreflexsiY.getAbsis() + "," + TreflexsiY.getOrdinat() + ")");
    }

    /*
     * Kesimpulan
     * Saya melakukan mencoba mengubah akses fungsi getAbsis() yang aawlnya dari
     * public menjadi private. Mengapa saya melakukan perubahan ini, karena dalam 
     * class Garis, terdapat bebrapa metode yang memanfaatkan getAbsis(). Hasilnya,
     * setelah saya ubah menjadi private, semua metode yang menggunakan setAbsis()
     * mengalami kesalahan (visible). Sehingga dapat saya simpulkan pengatur akses
     * private membuat metode tersebut hanya dapat dipanggil dalam clas yang sama. 
     * Sehingga, metode yang sebelumnya dapat dipanggil di file Garis sekarang tidak 
     * terlihat diubah menjadi private.
     */
}