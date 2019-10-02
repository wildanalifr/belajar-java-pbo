package Pertemuan4;

public class Array2 {

    private int[][] matriks1,  matriks2,  pengurangan;
    private double[][] hasil;

    public void setMatriks1(int[][] matriks) {
        this.matriks1 = matriks;
    }

    public void setMatriks2(int[][] matriks) {
        this.matriks2 = matriks;
    }

    public int[][] gerMatriks1() {
        return matriks1;
    }

    public int[][] getMatriks2() {
        return matriks2;
    }

    public void setPengurangan(int[][] data1, int[][] data2) {
        pengurangan = data1;
        int i, j;
        for (i = 0; i < pengurangan.length; i++) {
            for (j = 0; j < pengurangan[i].length; j++) {
                pengurangan[i][j] = data1[i][j] - data2[i][j];
            }
        }
    }

    public int[][] getPengurangan() {
        return pengurangan;
    }

    public void tampil(int[][] data) {
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void tampil(double[][] data) {
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setPerkalian(int[][] data1, double c) {
        hasil = new double[data1.length][data1[0].length];
        int i, j;
        for (i = 0; i < data1.length; i++) {
            for (j = 0; j < data1[i].length; j++) {

                hasil[i][j] = c * data1[i][j];
            }
        }
    }

    public double[][] getPerkalian() {
        return hasil;
    }
}
