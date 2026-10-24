import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int totalPesanan = 0;
        String pesanLagi = "";

        do {
            System.out.print("Masukkan nama menu: ");
            String namaMenu = m.nextLine();

            totalPesanan++;
            System.out.println("[Pesanan dicatat...]");

            System.out.print("Pesan lagi (y/t)? ");
            pesanLagi = m.nextLine();
        } while (pesanLagi.equalsIgnoreCase("y"));

        System.out.println("\nPemesanan Selesai!");
        System.out.println("Total pesanan Anda: " + totalPesanan + " menu");

        m.close();
    }
}
