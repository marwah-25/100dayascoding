import java.util.Scanner;

public class day21 {

    public static void main(String[] args) {
        // Menyiapkan Scanner untuk menerima input pengguna
        Scanner input = new Scanner(System.in);

        // --- INPUT DATA AWAL (SEMUA DISIMPAN SEBAGAI STRING) ---
        System.out.print("Nama\t\t\t: ");
        String strNama = input.nextLine();

        System.out.print("Umur\t\t\t: ");
        String strUmur = input.nextLine();

        System.out.print("Tinggi Badan\t\t: ");
        String strTinggiBadan = input.nextLine();

        System.out.print("Huruf Awal Nama\t\t: ");
        String strHurufAwal = input.nextLine();

        System.out.print("Status Mahasiswa\t: ");
        String strStatus = input.nextLine();

        System.out.print("Saldo Awal\t\t: ");
        String strSaldo = input.nextLine();

        // --- KONVERSI DARI STRING KE TIPE DATA PRIMITIF ---
        int umur = Integer.parseInt(strUmur);
        double tinggiBadan = Double.parseDouble(strTinggiBadan);
        char hurufAwal = strHurufAwal.charAt(0);
        boolean statusMahasiswa = Boolean.parseBoolean(strStatus);
        double saldo = Double.parseDouble(strSaldo);

        // 1. Tampilkan biodata mahasiswa menggunakan printf()
        System.out.println("\n=== BIODATA MAHASISWA ===");
        System.out.printf("Nama\t\t: %s\n", strNama);
        System.out.printf("Umur\t\t: %d tahun\n", umur);
        System.out.printf("Tinggi Badan\t: %.1f cm\n", tinggiBadan);
        System.out.printf("Huruf Awal\t: %c\n", hurufAwal);
        System.out.printf("Status Aktif\t: %b\n", statusMahasiswa);
        System.out.printf("Saldo Awal\t: Rp%.0f\n\n", saldo);

        // --- PROSES PENGOLAHAN DATA ---

        // 2. Tambahkan umur sebanyak 1 tahun dengan operator +=
        umur += 1;

        // 3-6. Pengolahan Saldo
        saldo += 50000;
        double saldoSetelahTambah = saldo; // Simpan untuk output

        saldo -= 25000;
        double saldoSetelahKurang = saldo; // Simpan untuk output

        saldo *= 2;
        double saldoSetelahKali = saldo;   // Simpan untuk output

        saldo /= 5;
        double saldoSetelahBagi = saldo;   // Simpan untuk output

        // 7. Penentuan Umur Genap/Ganjil menggunakan operator %
        int sisaBagiUmur = umur % 2;

        // 8. Konversi Otomatis (Widening): int ke double
        double umurDouble = umur;

        // 9. Konversi Manual / Casting (Narrowing): double ke int
        int tinggiBadanInt = (int) tinggiBadan;

        // 10. Konversi Primitif ke String menggunakan String.valueOf()
        String strHasilUmur = String.valueOf(umurDouble);
        String strHasilSaldo = String.valueOf(saldo);

        // 11. Menampilkan Seluruh Hasil Pengolahan menggunakan printf()
        System.out.println("=== HASIL PENGOLAHAN DATA ===");
        System.out.printf("Saldo awal\t\t: Rp%.0f\n", Double.parseDouble(strSaldo));
        System.out.printf("Setelah ditambah\t: Rp%.0f\n", saldoSetelahTambah);
        System.out.printf("Setelah dikurangi\t: Rp%.0f\n", saldoSetelahKurang);
        System.out.printf("Setelah dikali 2\t: Rp%.0f\n", saldoSetelahKali);
        System.out.printf("Setelah dibagi 5\t: Rp%.0f\n", saldoSetelahBagi);
        System.out.println("-----------------------------------");
        System.out.printf("Umur setelah +1 tahun\t: %d\n", umur);
        System.out.printf("Sisa bagi umur %% 2\t: %d (0 = Genap, 1 = Ganjil)\n", sisaBagiUmur);
        System.out.printf("Umur ke double (Otomatis): %s\n", strHasilUmur);
        System.out.printf("Tinggi badan ke int (Casting): %d cm\n", tinggiBadanInt);
        System.out.printf("Saldo akhir (ke String)\t: %s\n", strHasilSaldo);

        input.close();
    }
}
