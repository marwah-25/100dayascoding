import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        // Input status pendaftaran mahasiswa
        System.out.print("Apakah sudah terdaftar? : ");
        boolean terdaftar = m.nextBoolean();

        // Pemeriksaan tingkat pertama: Mengecek apakah mahasiswa terdaftar
        if (terdaftar) {
            // Input nilai tiga mata kuliah
            System.out.print("Masukkan nilai DDP : ");
            int ddp = m.nextInt();

            System.out.print("Masukkan nilai PBO : ");
            int pbo = m.nextInt();

            System.out.print("Masukkan nilai FWB : ");
            int fwb = m.nextInt();

            // Menghitung rata-rata nilai
            double rataRata = (ddp + pbo + fwb) / 3.0;

            // Menampilkan hasil rata-rata nilai
            System.out.println("Rata-rata nilai : " + rataRata);

            // Pemeriksaan tingkat kedua (Nested if): Mengecek kelayakan rata-rata
            if (rataRata >= 75) {
                System.out.println("Status : Boleh Mengikuti Lomba");
            } else {
                System.out.println("Status : Nilai Belum Memenuhi Syarat");
            }
        } else {
            // Jika mahasiswa belum terdaftar
            System.out.println("Status : Belum Terdaftar");
        }

        // Menutup objek Scanner
        m.close();

    }
    
}
