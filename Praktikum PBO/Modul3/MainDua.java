package Modul3;

public class MainDua {

    public static void main(String[] args) {
        ArrayDua dua = new ArrayDua();
        int[] angka = {4, 7, 8, 6, 7, 2, 7};       
        dua.setAngka(angka);
        System.out.println("Bilangan: ");
        dua.tampil1(dua.getAngka());
        int n = 7;
        int x = 3;
        dua.ubah(angka, n, x);
        dua.tampil1(dua.getAngkaRubahSatu());
        double y = 0.5;
        dua.ubah(y);
        dua.tampil(dua.getAngkaRubahDua());

    }
}
