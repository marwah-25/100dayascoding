import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk membaca input dari keyboard
        Scanner m = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Nilai: ");
        int nilai = m.nextInt();

        System.out.print("Pendapatan: ");
        int pendapatan = m.nextInt();

        System.out.print("Organisasi: ");
        boolean organisasi = m.nextBoolean();

        System.out.print("Pernah Beasiswa: ");
        boolean pernahBeasiswa = m.nextBoolean();

        // Evaluasi Kondisi
        // 1. Syarat Nilai Minimum (Rata-rata minimal 80)
        boolean syaratNilai = nilai >= 80;

        // 2. Syarat Finansial atau Keaktifan Organisasi (Pendapatan <= 4000000 ATAU Aktif Organisasi)
        boolean syaratPendapatanOrganisasi = (pendapatan <= 4000000) || organisasi;

        // 3. Lolos Seluruh Seleksi (Memenuhi Nilai, Finansial/Organisasi, dan TIDAK sedang menerima beasiswa lain)
        boolean lolosSeleksi = syaratNilai && syaratPendapatanOrganisasi && !pernahBeasiswa;

        // Menampilkan Hasil Output
        System.out.println();
        System.out.println("Syarat Nilai terpenuhi: " + syaratNilai);
        System.out.println("Syarat Pendapatan/Organisasi: " + syaratPendapatanOrganisasi);
        System.out.println("Lolos Seluruh Seleksi: " + lolosSeleksi);

        // Menutup Scanner
        m.close();
    }
}
