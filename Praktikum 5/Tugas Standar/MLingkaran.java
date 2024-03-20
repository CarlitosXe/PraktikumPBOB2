import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan: ");
       // Lingkaran l = new Lingkaran(10.2);
        Lingkaran l = new Lingkaran(scan.nextDouble());
        System.out.println("Luas lingkaaan dengan "+"jejari input satuan adalah "+l.hitungLuas());
    }
}
