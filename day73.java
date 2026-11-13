import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = m.nextLine();

        System.out.println("Nama Asli      : " + nama);
        System.out.println("Jumlah Karakter: " + nama.length());
        System.out.println("Huruf Kapital  : " + nama.toUpperCase());
        System.out.println("Huruf Kecil    : " + nama.toLowerCase());

        m.close();
    }
}
