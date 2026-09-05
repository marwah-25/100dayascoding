public class day4 {
    public static void main(String[] args) {
        
        // 1. Tipe data byte: untuk menyimpan angka bulat sangat kecil (jangkauan -128 s.d 127)
        byte umur = 20;

        // 2. Tipe data short: untuk menyimpan angka bulat skala sedang (jangkauan -32.768 s.d 32.767)
        short tahunLahir = 2005;

        // 3. Tipe data int: untuk menyimpan angka bulat standar/umum
        int nim = 224303;

        // 4. Tipe data long: untuk menyimpan angka bulat berkapasitas sangat besar dan wajib ditambahkan L dibelakang
        long danaBeasiswa = 4800000L;

        // Menampilkan hasil
        System.out.println("=== DATA NUMERIK BILANGAN BULAT ===");
        System.out.println("Umur\t\t: " + umur + " tahun");
        System.out.println("Tahun Lahir\t: " + tahunLahir);
        System.out.println("NIM\t\t: D0" + nim); // Ditambahkan "D0" agar tampil sesuai format NIM asli
        System.out.println("Dana Beasiswa\t: Rp " + danaBeasiswa);
    }
}
