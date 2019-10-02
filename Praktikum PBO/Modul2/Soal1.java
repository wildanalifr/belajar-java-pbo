
package Modul2;

public class Soal1 {
    private String namaMobil;
    private long stok;
    private long harga;
    private long hargaSatuan;
    private long hargaGlobal;

    public long getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public long getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHargaSatuan(){
        hargaSatuan = stok*harga;
    }

    public long getHargaSatuan(){
        return hargaSatuan;
    }

    public void setHargaGlobal(){
        hargaGlobal+=hargaSatuan;
    }

    public long getHargaGlobal(){
        return hargaGlobal;
    }

   
    public static void main(String[] args) {
        Soal1 mobil = new Soal1();
        mobil.setNamaMobil("Toyota");
        mobil.setHarga(100000000);
        mobil.setStok(5);
        mobil.setHargaSatuan();
        System.out.println("Nama Mobil = "+mobil.getNamaMobil());
        System.out.println("Stock Mobil = "+mobil.getStok());
        System.out.println("Harga = Rp"+mobil.getHarga());
        System.out.println("Harga Satuan = Rp"+mobil.getHargaSatuan());
        mobil.setHargaGlobal();
        mobil.getHargaGlobal();
        
        System.out.println("================");
        mobil.setNamaMobil("Kijang");
        mobil.setHarga(110000000);
        mobil.setStok(10);
        mobil.setHargaSatuan();
        System.out.println("Nama Mobil = "+mobil.getNamaMobil());
        System.out.println("Stock Mobil = "+mobil.getStok());
        System.out.println("Harga = Rp"+mobil.getHarga());
        System.out.println("Harga Satuan = Rp"+mobil.getHargaSatuan());
        mobil.setHargaGlobal();
        mobil.getHargaGlobal();
        
        System.out.println("================");
        mobil.setNamaMobil("Panther");
        mobil.setHarga(120000000);
        mobil.setStok(15);
        mobil.setHargaSatuan();
        System.out.println("Nama Mobil = "+mobil.getNamaMobil());
        System.out.println("Stock Mobil = "+mobil.getStok());
        System.out.println("Harga = Rp"+mobil.getHarga());
        System.out.println("Harga Satuan = Rp"+mobil.getHargaSatuan());
        mobil.setHargaGlobal();
        mobil.getHargaGlobal();
        
        System.out.println("================");
        mobil.setNamaMobil("Karimun");
        mobil.setHarga(80000000);
        mobil.setStok(20);
        mobil.setHargaSatuan();
        System.out.println("Nama Mobil = "+mobil.getNamaMobil());
        System.out.println("Stock Mobil = "+mobil.getStok());
        System.out.println("Harga = Rp"+mobil.getHarga());
        System.out.println("Harga Satuan = Rp"+mobil.getHargaSatuan());mobil.setHargaGlobal();
        mobil.getHargaGlobal();
        
        System.out.println("============");
        System.out.println("Harga Total Rp "+mobil.getHargaGlobal());
      
    }

}
