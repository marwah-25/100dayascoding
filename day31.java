import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        // Inisialisasi objek Scanner untuk menginput data dari keyboard
        Scanner m = new Scanner(System.in);

        // Input umur mahasiswa (tipe data integer)
        System.out.print("Masukkan umur : ");
        int umur = m.nextInt();

        // Input nilai tugas mahasiswa (tipe data integer)
        System.out.print("Masukkan nilai tugas : ");
        int nilai = m.nextInt();

        // Input status pendaftaran mahasiswa (tipe data boolean: true/false)
        System.out.print("Apakah sudah terdaftar? : ");
        boolean terdaftar = m.nextBoolean();

        // Operator AND (&&): Semua kondisi harus bernilai true agar hasilnya true
        boolean semuaSyarat = (umur >= 17 && nilai >= 75 && terdaftar == true);

        // Operator OR (||): Cukup salah satu kondisi bernilai true agar hasilnya true
        boolean salahSatu = (umur >= 17 || nilai >= 75 || terdaftar == true);

        // Operator NOT (!): Membalikkan nilai boolean terdaftar (true jadi false, false jadi true)
        boolean belumTerdaftar = !terdaftar;

        
        
        System.out.println();
        // Menampilkan hasil evaluasi kondisi
        System.out.println("Memenuhi semua syarat : " + semuaSyarat);
        System.out.println("Memenuhi satu syarat : " + salahSatu);
        System.out.println("Belum terdaftar : " + belumTerdaftar);

        // Menutup objek Scanner untuk menghemat memori
        m.close();
    }
}
