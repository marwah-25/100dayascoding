import java.util.Scanner;

public class RadarProgram {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan Batas Bawah : ");
        int batasBawah = m.nextInt();

        System.out.print("Masukkan Batas Atas : ");
        int batasAtas = m.nextInt();

        System.out.print("Masukkan Angka Target: ");
        int target = m.nextInt();

        if (target >= batasBawah && target <= batasAtas) {
            System.out.println("Status: Di dalam range!");
        } else {
            System.out.println("Status: Di luar range!");
        }

        m.close();
    }
}
