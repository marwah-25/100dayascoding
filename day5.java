public class day5 {
  public static void main (String[] args){
    // Deklarasi variabel dengan tipe data double (bilangan desimal)
    double nilaiTugas = 85.5;
    double nilaiUTS = 80.0;
    double nilaiUAS =90.5;

    //hasil yang di mau
    System.out.println("==================================");
    System.out.println("\tNILAI MAHASISWA");
    System.out.println("==================================");
    System.out.println("");
    System.out.println("Nilai Tugas\t: "+ nilaiTugas);
    System.out.println("Nilai UTS\t: "+ nilaiUTS);
    System.out.println("Nilai UAS\t: "+ nilaiUAS);
    System.out.println("");
    // hasil menghitung rata-rata (menjumlahkan ketiga nilai kemudian kita bagi 3)
    System.out.println("Rata-rata\t: "+ (nilaiTugas + nilaiUTS + nilaiUAS) / 3);



  }
}
