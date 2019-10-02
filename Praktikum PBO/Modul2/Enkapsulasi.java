
package Modul2;

public class Enkapsulasi {

    private int alas,tinggi;
    private double luasSegitiga;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setLuasSegitiga() {
        luasSegitiga = 0.5 * (double)(alas*tinggi);
    }

    public double getLuasSegitiga() {
        return luasSegitiga;
    }



}

class Main {
    public static void main(String[] args) {
        Enkapsulasi ob = new Enkapsulasi();
        ob.setAlas(10);
        ob.setTinggi(6);
        ob.getAlas();
        ob.getTinggi();

    }
}
