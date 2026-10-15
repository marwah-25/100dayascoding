import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = m.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai Tidak Valid");
        } else if (nilai >= 90 && nilai <= 100) {
            System.out.println("Predikat Nilai: A");
        } else if (nilai >= 80 && nilai <= 89) {
            System.out.println("Predikat Nilai: B");
        } else if (nilai >= 70 && nilai <= 79) {
            System.out.println("Predikat Nilai: C");
        } else if (nilai >= 60 && nilai <= 69) {
            System.out.println("Predikat Nilai: D");
        } else {
            System.out.println("Predikat Nilai: E");
        }

        m.close();
    }
}
