import java.util.Scanner;

public class evaluasi2Soal4 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan berat emas: ");
        double angka = m.nextDouble();


        if (angka % 1 == 0) {
            System.out.println("Bilangan Bulat (Emas Fisik)");
        }else if (angka % 1 != 0) {
             System.out.println("Bilangan Desimal (Emas Digital)");
        }{
        }
    }
    
}
