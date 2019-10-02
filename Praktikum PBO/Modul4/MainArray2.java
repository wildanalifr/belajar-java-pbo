package Pertemuan4;

public class MainArray2 {

    public static void main(String[] args) {
        Array2 ar2 = new Array2();
        int data1[][] = {
            {1, 2},
            {3, 5},
            {6, 7}
        };
        int data2[][] = {
            {8, 9},
            {10, 11},
            {12, 13}
        };

        ar2.setMatriks1(data1);
        ar2.setMatriks2(data2);
        ar2.setPengurangan(data1, data2);
        ar2.tampil(ar2.getPengurangan());
        ar2.getPerkalian();
        System.out.println("===");
        ar2.setPerkalian(data1, 0.5);
        ar2.tampil(ar2.getPerkalian());

        




    }
}
