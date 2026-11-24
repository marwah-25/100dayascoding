import java.util.Scanner;

public class day84soal2 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = m.nextInt();

        if (jumlahBarang <= 0) {
            System.out.println("Jumlah barang harus lebih dari 0.");
        } else {
            int[] harga = new int[jumlahBarang];

            for (int i = 0; i < harga.length; i++) {
                System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
                harga[i] = m.nextInt();
            }

            int termahal = harga[0];
            for (int i = 1; i < harga.length; i++) {
                if (harga[i] > termahal) {
                    termahal = harga[i];
                }
            }

            System.out.println("Harga barang termahal: " + termahal);
        }
    }
    
}
