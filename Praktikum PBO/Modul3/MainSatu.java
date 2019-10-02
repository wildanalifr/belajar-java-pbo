package Modul3;

import java.util.Scanner;

public class MainSatu {

    public static void main(String[] args) {

        ArraySatu satu = new ArraySatu();
        Scanner masuk = new Scanner(System.in);
        int angka[] = {-5, -3, -6, -3, -4};
        satu.setAngka(angka);
        satu.tampil(angka);
        satu.setRataRata(angka);
        System.out.println("========");
        System.out.println("rata" + satu.getRataRata());
        System.out.println("=======");
        satu.minimumMaksimum(angka);
        System.out.println("Minimum" + satu.getMin());
        System.out.println("Maximum" + satu.getMax());
        System.out.println("=======");
        System.out.println("Masukkan index angka: ");
        int m = masuk.nextInt();
        satu.index(angka, m);

        System.out.println("index berada di index ke-" + satu.getIndex());



    }
}
