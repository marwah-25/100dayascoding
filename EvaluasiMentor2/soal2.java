import java.util.Scanner;

public class evaluasi2Soal2 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = m.nextInt();

        if (angka > 0) {
            System.out.println("ini adalah angka positif");
            if (angka % 2 == 0) {
                System.out.println("Angka ini bernilai Genap.");
            } else {
                System.out.println("Angka ini bernilai ganjil ");
            
            }

        } else if (angka < 0) {
            System.out.println("ini adalah angka negatif");
        } else {
            System.out.println("ini adalha angka Nol");
        }
    }
}
