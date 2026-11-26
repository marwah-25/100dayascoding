import java.util.Scanner;

public class day86soal2 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = m.nextInt();

        if (jumlahBarang <= 0) {
            System.out.println("Jumlah barang harus lebih dari 0.");
        } else {
            int[] nomorBarang = new int[jumlahBarang];

            for (int i = 0; i < nomorBarang.length; i++) {
                System.out.print("Masukkan nomor barang ke-" + (i + 1) + ": ");
                nomorBarang[i] = m.nextInt();
            }

            System.out.print("Masukkan nomor barang yang dicari: ");
            int cari = m.nextInt();

            boolean ditemukan = false;
            for (int i = 0; i < nomorBarang.length; i++) {
                if (nomorBarang[i] == cari) {
                    ditemukan = true;
                    break;
                }
            }

            if (ditemukan) {
                System.out.println("Nomor barang " + cari + " ditemukan.");
            } else {
                System.out.println("Nomor barang " + cari + " tidak ditemukan.");
            }
        }
    }
    
}
