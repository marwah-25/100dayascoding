//Mengimpor kelas Scanner dari package java.util agar bisa menerima input dari keyboard
import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        
        //Membuat objek Scanner baru bernama 'input' untuk membaca masukkan System.in (keyboard)
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT BIODATA MAHASISWA ===");
        
        //Mengambil input bertipe String untuk Nama menggunakan nextLine()
        System.out.print("Masukkan Nama         : ");
        String nama = input.nextLine();

        //Mengambil input bertipe String untuk NIM menggunakan nextLine()
        System.out.print("Masukkan NIM          : ");
        String nim = input.nextLine();

        //Mengambil input bertipe int (bilangan bulat) untuk Umur menggunakan nextInt()
        System.out.print("Masukkan Umur         : ");
        int umur = input.nextInt();

        //Mengambil input bertipe double (bilangan pecahan) untuk Tinggi Badan menggunakan nextDouble()
        System.out.print("Masukkan Tinggi Badan : ");
        double tinggi = input.nextDouble();

        //Mengambil input bertipe char (karakter tunggal) menggunakan next().charAt(0)
        System.out.print("Masukkan Grade        : ");
        char grade = input.next().charAt(0);

        //Menampilkan data yang telah diinput menggunakan printf() agar rapi dan sejajar
        System.out.println("\n========== BIODATA MAHASISWA ==========");
        
        // %-15s artinya mencetak String dengan lebar 15 karakter rata kiri
        // %s untuk String, %d untuk int, %.2f untuk double (2 angka di belakang koma), %c untuk char
        // %n digunakan untuk membuat baris baru (pindah baris)
        System.out.printf("%-15s : %s%n", "Nama", nama);
        System.out.printf("%-15s : %s%n", "NIM", nim);
        System.out.printf("%-15s : %d tahun%n", "Umur", umur);
        System.out.printf("%-15s : %.2f cm%n", "Tinggi Badan", tinggi);
        System.out.printf("%-15s : %c%n", "Grade", grade);
        
        System.out.println("========================================");
    }
}
