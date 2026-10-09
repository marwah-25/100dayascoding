import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        // 1. Tampilan Menu
        System.out.println("=== MENU WARTEG CYBER 2077 ===");
        System.out.println();
        System.out.println("1. Nasi Hologram (Rp 15000)");
        System.out.println("2. Ayam Goreng Laser (Rp 20000)");
        System.out.println("3. Es Teh Matrix (Rp 5000)");
        System.out.println("=================================");

        // Input nomor pesanan
        System.out.print("Masukkan nomor pesanan   : ");
        int nomor = m.nextInt();

        String menu = "";
        int hargaSatuan = 0;

        // Penentuan jenis menu berdasarkan nomor pesanan
        if (nomor == 1) {
            menu = "Nasi Hologram";
            hargaSatuan = 15000;
        } else if (nomor == 2) {
            menu = "Ayam Goreng Laser";
            hargaSatuan = 20000;
        } else if (nomor == 3) {
            menu = "Es Teh Matrix";
            hargaSatuan = 5000;
        } else {
            System.out.println("Waduhhh pesanan yang kamu masukkan tidak ada di menu!!!");
        }

        System.out.print("Masukkan jumlah porsi   : ");
        int porsi = m.nextInt();

        System.out.print("Apakah punya Member? (true/false) : ");
        boolean member = m.nextBoolean();

        System.out.println();

        // Hitung Total Awal
        int totalAwal = hargaSatuan * porsi;

        System.out.println("Menu             : " + menu);
        System.out.println("Jumlah           : " + porsi + " porsi");
        System.out.println("Total Harga Awal : Rp " + totalAwal);
        System.out.println();

        int diskon10 = 0;
        int diskonMember = 0;

        // PROMO 1: IF BERDIRI SENDIRI
        if (totalAwal > 50000) {
            diskon10 = (int) (totalAwal * 0.10);
            System.out.println("Selamat! Anda dapat Diskon Belanja Besar 10% (Potongan Rp " + diskon10 + ")");
        }

        // PROMO 2: IF BERDIRI SENDIRI (TIDAK PAKAI ELSE IF DARI PROMO 1)
        if (member == true) {
            diskonMember = 5000;
            System.out.println("Selamat! Anda dapat Potongan Member (Potongan Rp 5000)");
        }

        System.out.println("-------------------------------------------");

        // Hitung Total Pembayaran Akhir
        int totalBayar = totalAwal - diskon10 - diskonMember;
        System.out.println("Total yang harus dibayar : Rp " + totalBayar);

        m.close();
    }
}
