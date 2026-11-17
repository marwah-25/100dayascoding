import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String namaAwal = m.nextLine();

        System.out.print("Konfirmasi nama lengkap: ");
        String konfirmasi = m.nextLine();

        System.out.print("Masukkan program studi: ");
        String prodi = m.nextLine();

        System.out.print("Masukkan alamat email: ");
        String email = m.nextLine();

        String namaTrim = namaAwal.trim();

        System.out.println();
        System.out.println("Nama Setelah Trim: " + namaTrim);
        System.out.println("Jumlah Karakter: " + namaTrim.length());
        System.out.println("Nama Huruf Kapital: " + namaTrim.toUpperCase());
        System.out.println("Nama Huruf Kecil: " + namaTrim.toLowerCase());
        System.out.println("Tiga Karakter Pertama: " + namaTrim.substring(0, 3));
        System.out.println("Nama Setelah Replace: " + namaTrim.replace(' ', '_'));
        System.out.println();
        System.out.println("Nama Kosong: " + namaAwal.isEmpty());
        System.out.println("Konfirmasi Nama Sesuai: " + namaAwal.equals(konfirmasi));
        System.out.println("Program Studi Sesuai: " + prodi.equalsIgnoreCase("Informatika"));
        System.out.println("Email Kampus: " + email.contains("@kampus.ac.id"));


    }
    
}
