//Nama      : Krisna Okky Widayat
//Nim       : 24060122140105

public class mainGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(2, 4);
        Titik t2 = new Titik(3, 6);

        Garis G = new Garis(t1, t2);

        Titik tAwal = G.getTitikAwal();
        Titik tAkhir = G.getTitikAkhir();

        System.out.println("Titik awal = (" + tAwal.getAbsis() + "," + tAwal.getOrdinat() + ")");
        System.out.println("Titik akhir = (" + tAkhir.getAbsis() + "," + tAkhir.getOrdinat() + ")");
        ;
        Garis GrefleksiY = G.getRefleksiY();
        Titik tAwalRefleksiY = GrefleksiY.getTitikAwal();
        Titik tAkhirRefleksiY = GrefleksiY.getTitikAkhir();

        System.out.println(
                "Refleksi di titik awal = (" + tAwalRefleksiY.getAbsis() + "," + tAwalRefleksiY.getOrdinat() + ")");
        System.out
                .println("Refleksi di titik akhir = (" + tAkhirRefleksiY.getAbsis() + "," + tAkhirRefleksiY.getOrdinat()
                        + ")");
        System.out.println("G tegak lurus dg GRefleksiY = " + G.isTegakLurus(GrefleksiY));
    }

}
