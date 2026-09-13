// Mengimpor Scanner untuk menerima input dari keyboard
import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        
        // Membuat objek Scanner bernama 'input'
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT BIODATA MAHASISWA ===");
        
        // Input String untuk Nama
        System.out.print("Masukkan Nama         : ");
        String nama = input.nextLine();

        // Input String untuk NIM (ditambahkan sesuai soal)
        System.out.print("Masukkan NIM          : ");
        String nim = input.nextLine();

        // Input String untuk Kelas (ditambahkan sesuai soal)
        System.out.print("Masukkan Kelas        : ");
        String kelas = input.nextLine();

        // Input String untuk Jurusan (ditambahkan sesuai soal)
        System.out.print("Masukkan Jurusan      : ");
        String jurusan = input.nextLine();

        // Input String untuk Hobi (ditambahkan sesuai soal)
        System.out.print("Masukkan Hobi         : ");
        String hobi = input.nextLine();

        // Input int untuk Umur
        System.out.print("Masukkan Umur         : ");
        int umur = input.nextInt();

        // Input double untuk Tinggi Badan
        System.out.print("Masukkan Tinggi Badan : ");
        double tinggi = input.nextDouble();

        // Input char untuk Grade
        System.out.print("Masukkan Grade        : ");
        char grade = input.next().charAt(0);

        // Menampilkan seluruh data menggunakan printf() agar rapi dan sejajar
        System.out.println("\n========== BIODATA MAHASISWA ==========");
        
        // %-15s memastikan nama label rata kiri dengan lebar 15 karakter
        System.out.printf("%-15s : %s%n", "Nama", nama);
        System.out.printf("%-15s : %s%n", "NIM", nim);
        System.out.printf("%-15s : %s%n", "Kelas", kelas);
        System.out.printf("%-15s : %s%n", "Jurusan", jurusan);
        System.out.printf("%-15s : %s%n", "Hobi", hobi);
        System.out.printf("%-15s : %d tahun%n", "Umur", umur);
        System.out.printf("%-15s : %.2f cm%n", "Tinggi Badan", tinggi);
        System.out.printf("%-15s : %c%n", "Grade", grade);
        
        System.out.println("========================================");
    }
}
