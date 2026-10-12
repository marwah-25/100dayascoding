import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan suhu ruangan: ");
        double suhu = m.nextDouble();

        System.out.print("Masukkan kelembapan ruangan: ");
        double kelembapan = m.nextDouble();

        if (suhu >= 18 && suhu <= 28 && kelembapan >= 40 && kelembapan <= 60) {
            System.out.println("Ruangan Nyaman");
        } else if (suhu < 18 || kelembapan < 40) {
            System.out.println("Suhu atau Kelembapan Terlalu Rendah");
        } else if (suhu > 28 || kelembapan > 60) {
            System.out.println("Suhu atau Kelembapan Terlalu Tinggi");
        }
    }
    
}
