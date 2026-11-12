import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("=== KANTIN KAMPUS ===");
            System.out.println("1. Nasi Goreng (Rp15000)");
            System.out.println("2. Mie Goreng (Rp12000)");
            System.out.println("3. Ayam Geprek (Rp18000)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = m.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Nasi Goreng");
                    System.out.println("Harga: Rp15000");
                    break;
                case 2:
                    System.out.println("Anda memilih Mie Goreng");
                    System.out.println("Harga: Rp12000");
                    break;
                case 3:
                    System.out.println("Anda memilih Ayam Geprek");
                    System.out.println("Harga: Rp18000");
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kantin!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        } while (pilihan != 4);
    }
}
