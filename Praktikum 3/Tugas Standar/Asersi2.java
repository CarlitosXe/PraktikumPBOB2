class Lingkaran {
    private double jariJari; 
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungkeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert (jariJari > 0) : "jari-jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungkeliling();
        System.out.println("keliling lingkaran: " + kelilingLingkaran);
    }
}

/*Pada code diatas harus lebih dari 0. Namun untuk mengaktifkan assert pada java perlu 
  enable assertionsnya dengan cara saat menjalankan program ketik pada termial 'java -enableassertions Asersi2'
  maka outputnya akan "jari-jari tidak boleh nol" dan itu benar karena jari-jari dideklare 0
  yang harusnya assernya enable dan mengeuarkan output tersebut.
*/
