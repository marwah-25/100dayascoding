import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // SOAL 1
        System.out.print("Masukkan Username\t: ");
        String username = input.nextLine();

        System.out.print("Masukkan Umur\t\t: ");
        byte umur = input.nextByte();

        System.out.print("Masukkan Tinggi Badan\t: ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Masukkan Gol. Darah\t: ");
        char golDarah = input.next().charAt(0);

        System.out.print("Apakah Akun Privat?\t: ");
        boolean akunPrivat = input.nextBoolean();

        // Output 
        System.out.println("=== PROFILFACEGRAM===");
        System.out.println("Username\t: " + username);
        System.out.println("Umur\t\t: " + umur + " Tahun");
        System.out.println("Tinggi Badan\t: " + tinggiBadan + " cm");
        System.out.println("Gol. Darah\t: " + golDarah);
        System.out.println("Akun Privat\t: " + akunPrivat);

        input.nextLine();
        System.out.println();


        //SOAL 2
        final String NAMA_KANTIN = "KANTIN KEJUJURAN TI";

        System.out.print("Masukkan Nama Makanan\t: ");
        String namaMakanan = input.nextLine();

        System.out.print("Masukkan Harga Satuan\t: ");
        int hargaSatuan = input.nextInt();

        System.out.print("Masukkan Jumlah Beli\t: ");
        int jumlahBeli = input.nextInt();

        int totalHarga = hargaSatuan * jumlahBeli;

        // Output Kasir
        System.out.println(NAMA_KANTIN);
        System.out.println("Anda memesan " + jumlahBeli + " porsi " + namaMakanan + ".");
        System.out.println("Total yang harus dibayar: Rp " +  totalHarga);

        input.nextLine();
        System.out.println();

        // SOAL 3
        System.out.print("Masukkan Nama Mahasiswa\t: ");
        String namaMahasiswa = input.nextLine();

        System.out.print("Masukkan Nilai Ujian\t: ");
        double nilaiUjian = input.nextDouble();

        // Output
        System.out.println("Data diterima: " + namaMahasiswa + " mendapat nilai " + nilaiUjian);
        nilaiUjian = 0.0;
        System.out.println("AWAS! SISTEM DIRETAS!");
        System.out.println("Nilai akhir " + namaMahasiswa + " sekarang diubah menjadi: " + nilaiUjian);
    }
}
