class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Angka 13 adalah angka sial!");
    }
}

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");

    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
/*menurut saya apakah baris 12 dieksekusi? iya, karena angka yang diprint duluan
  adalah angka 10. Pada code tersebut yang angka sial adalah 13. ketika ngeprint angka 13 
  maka eksepsi akan dilakukan sehingga output akan memanggil eksepsion yang diatas 
  "Angka 13 adalah angka sial" dan kemudian masuk di catch mengeprint output
  "hati-hati memasukan angka!!".
  
  Untuk yang baris 21 akan dieksekusi?iya, karena pada percobaan angka ke 2 yaitu 13
  yang mana angka 13 adalah angka sial sehingga ketika code masuk di try maka akan masuk ke
  catch dan mengeprint "hati-hati memasukkan angka!!!".
*/
