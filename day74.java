import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = m.nextLine();

        System.out.print("Konfirmasi nama lengkap: ");
        String konfirmasi = m.nextLine();

        System.out.print("Masukkan program studi: ");
        String prodi = m.nextLine();

        System.out.print("Masukkan alamat email: ");
        String email = m.nextLine();

        System.out.println("Nama lengkap kosong: " + nama.isEmpty());
        System.out.println("Konfirmasi nama: " + nama.equals(konfirmasi));
        System.out.println("Program studi sesuai: " + prodi.equalsIgnoreCase("Informatika"));
        System.out.println("Email kampus valid: " + email.contains("@kampus.ac.id"));

    }
}
