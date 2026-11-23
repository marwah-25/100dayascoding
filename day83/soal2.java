import java.util.Scanner;

public class day83soal2 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = m.nextInt();
        System.out.println();

        int[] harga = new int[jumlahBarang];
        int totalBelanja = 0;

        for (int i = 0; i < harga.length; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            harga[i] = m.nextInt();
            totalBelanja += harga[i];
        }

        System.out.println();
        for (int i = 0; i < harga.length; i++) {
            System.out.println("Harga barang ke-" + (i + 1) + ": " + harga[i]);
        }
        System.out.println("Total belanja: " + totalBelanja);

    }
    
}
