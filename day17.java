import java.util.Scanner; // Memanggil pustaka Scanner untuk membaca input dari keyboard

public class day17 {

    public static void main(String[] args) {
        
        // 1. Membuata objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // 2. Meminta input dari pengguna
        System.out.print("Masukkan poin awal pelanggan : ");
        int poin = input.nextInt(); // Menyimpan poin awal ke satu variabel 'poin'

        System.out.print("Masukkan poin transaksi baru  : ");
        int tambahPoin = input.nextInt();

        System.out.print("Masukkan poin yang ditukarkan : ");
        int tukarPoin = input.nextInt();

        System.out.println();
        // 3. Menampilkan riwayat pembaruan poin
        System.out.println("--- RIWAYAT PERUBAHAN POIN ---");
        System.out.println("Poin awal\t\t\t: " + poin);

        // Menambahkan poin transaksi dengan operator +=
        poin += tambahPoin; 
        System.out.println("Setelah tambah transaksi (+" + tambahPoin + ")\t: " + poin);

        // Mengurangi poin yang ditukarkan dengan operator -=
        poin -= tukarPoin; 
        System.out.println("Setelah tukar poin (-" + tukarPoin + ")\t: " + poin);

        // Mengalikan sisa poin dengan 2 untuk promo Double Points dengan operator *=[cite: 1]
        poin *= 2; 
        System.out.println("Setelah promo Double Points (*=2): " + poin);

        // Menampilkan poin akhir[cite: 1]
        System.out.println("Poin Akhir Pelanggan\t\t: " + poin);
    }
}
