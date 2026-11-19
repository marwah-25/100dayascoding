import java.util.Arrays;
public class day79 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 15, 25, 30};
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }

        System.out.println("Data Angka:");
        System.out.println(Arrays.toString(angka));
        System.out.println("Total Penjumlahan: " + total);
    }
}

