import java.util.Scanner;

public class day87soal2 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = m.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah barang harus lebih dari 0.");
        } else {
            int[] harga = new int[jumlah];

            for (int i = 0; i < harga.length; i++) {
                System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
                harga[i] = m.nextInt();
            }

            for (int i = 0; i < harga.length; i++) {
                harga[i] = harga[i] + 5000;
            }

            System.out.println("\nHarga setelah ditambahkan Rp5.000:");
            for (int i = 0; i < harga.length; i++) {
                System.out.print(harga[i] + " ");
            }
            System.out.println();
        }
    }
}
