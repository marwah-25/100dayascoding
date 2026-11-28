public class day88soal2 {
    public static void hitungBelanja(int hargaBarang, int jumlahBarang) {
        int totalBelanja = hargaBarang * jumlahBarang;
        System.out.println("Total belanja: " + totalBelanja);
    }

    public static void main(String[] args) {
        hitungBelanja(10000, 3);
        hitungBelanja(15000, 2);
    }
}
