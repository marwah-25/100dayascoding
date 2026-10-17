import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("=== MENU LAYANAN MAHASISWA ===");
        System.out.println("1. Melihat Jadwal Kuliah");
        System.out.println("2. Melihat Informasi Nilai");
        System.out.println("3. Melihat Informasi Akademik");
        System.out.println("4. Keluar dari Program");

        System.out.print("Masukkan pilihan menu: ");
        int pilihan = m.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih layanan Jadwal Kuliah");
                break;
            case 2:
                System.out.println("Anda memilih layanan Informasi Nilai");
                break;
            case 3:
                System.out.println("Anda memilih layanan Informasi Akademik");
                break;
            case 4:
                System.out.println("Anda memilih Keluar dari Program");
                break;
        
            default:
                System.out.println("Pilihan Tidak Tersedia");
                break;
        }


    }
    
}
