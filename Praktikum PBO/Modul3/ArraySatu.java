package Modul3;

public class ArraySatu {

    private int angka[];
    private double rataRata;
    private int maks;
    private int min;
    private String index;
    private int array[];

    public double getRataRata() {
        return rataRata;
    }

    public int[] getAngka() {
        return angka;
    }

    public void setAngka(int[] angka) {
        this.angka = angka;
    }

    public void tampil(int[] a) {
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

    public void minimumMaksimum(int[] a) {
        int minimum = a[0];
        int maksimum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maksimum) {
                maksimum = a[i];
            } else if (a[i] < minimum) {
                minimum = a[i];
            }
        }
        min = minimum;
        maks = maksimum;
    }

    public int getMax() {
        return maks;

    }

    public int getMin() {
        return min;

    }

    public void index(int[] a, int go) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == go) {
                if (index == null) {
                    index = "" + i;
                } else {
                    index += "," + i;
                }
            }
        }
    }

    public String getIndex() {
        return index;
    }

    public void setRataRata(int a[]) {
        double rataRata = 0;
        double hasil = 0;
        for (int i = 0; i < a.length; i++) {
            rataRata += a[i];
            hasil = rataRata / a.length;
        }
        this.rataRata = hasil;


    }
}
