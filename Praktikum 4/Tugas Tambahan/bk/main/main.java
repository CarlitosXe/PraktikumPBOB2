package bk.main;

import bk.bukufiksi.bukuFiksi;
import bk.bukunonfiksi.bukuAkademik;
import bk.bukunonfiksi.bukunonFiksi;

public class main {
    public static void main(String[] args){
        bukuFiksi Fiksi = new bukuFiksi("Hyouka", "Yonezawa Honobu", "2001", "Mistery", 244, 87.000);
        Fiksi.view();

        System.out.println();

        bukunonFiksi nonFiksi = new bukunonFiksi("Filosofi Teras", "Henry Manampiring", "2018", "Biography", 346, 80.000);
        nonFiksi.view();

        System.out.println();

        bukuAkademik akademik = new bukuAkademik("Biologi Sel", "Marhenry Lukitasari", "2015", "Buku Akademik", 201, 110.000);
        akademik.setjudul("Biologi Sel");
        akademik.setpenulis("Manhenry Lukitasari");
        akademik.setharga(110.000);
        akademik.setjumlahHalaman(221);
        akademik.view();

        System.out.println();
    }
}
