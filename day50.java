import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = m.nextInt();

        String status = (bilangan % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Bilangan " + bilangan + " adalah " + status);

        m.close();
    }
}
