public class day9 {
    public static void main(String[] args) {
        // final double: konstanta tipe pecahan yang nilainya dikunci (tidak bisa diubah)
        final double HARGA = 15000;
        final double DISKON = 0.10;
        
        // Menampilkan output dan menghitung harga akhir langsung di dalam perintah cetak
        System.out.println("Harga Awal  : Rp " + HARGA);
        System.out.println("Diskon      : " + (DISKON * 100) + "%");
        // Rumus (HARGA - (HARGA * DISKON)) langsung dieksekusi di dalam System.out.println
        System.out.println("Harga Akhir : Rp " + (HARGA - (HARGA * DISKON)));



      
    }
    
}
