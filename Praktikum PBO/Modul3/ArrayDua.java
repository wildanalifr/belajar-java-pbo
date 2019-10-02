package Modul3;

public class ArrayDua {

    private int angka[];
    private int angkaRubahSatu[];
    private double angkaRubahDua[];

    public int[] getAngka() {
        return angka;
    }

    public void setAngka(int[] angka) {
        this.angka = angka;
    }

    public void tampil1(int[] a) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
    }

    public void tampil(double[] a) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
    }

    public double[] getAngkaRubahDua() {
        return angkaRubahDua;
    }

    public int[] getAngkaRubahSatu() {
        return angkaRubahSatu;
    }

    public void ubah(int[] angka, int n, int x) {
        int angkaRubahSatu[] = new int[angka.length];
        for (int i = 0; i < angkaRubahSatu.length; i++) {
            if (angka[i] == n) {
                angka[i] = x;
            }
            this.angkaRubahSatu = angka;
        }
    }

    public void ubah(double n) {
        double angkaRubahDua[] = new double[angkaRubahSatu.length];
        for (int i = 0; i < angkaRubahDua.length; i++) {
            angkaRubahDua[i] = Double.valueOf(angkaRubahSatu[i] * n);
            this.angkaRubahDua = angkaRubahDua;
        }

    }
}
