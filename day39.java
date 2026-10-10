import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = m.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = m.nextDouble();

        System.out.print("Masukkan simbol operasi (+, -, *, /, %): ");
        char simbol = m.next().charAt(0);

        System.out.println();

       if (simbol == '+') {
            double hasil = angka1 + angka2;
            System.out.println("Hasil dari " + angka1 + " + " + angka2 + " adalah " + hasil);
        } else if (simbol == '-') {
            double hasil = angka1 - angka2;
            System.out.println("Hasil dari " + angka1 + " - " + angka2 + " adalah " + hasil);
        } else if (simbol == '*') {
            double hasil = angka1 * angka2;
            System.out.println("Hasil dari " + angka1 + " * " + angka2 + " adalah " + hasil);
        } else if (simbol == '/') {
            // Pengecekan pembagian dengan nol (0)
            if (angka2 == 0) {
                System.out.println("Error, tidak terdefinisi");
            } else {
                double hasil = angka1 / angka2;
                System.out.println("Hasil dari " + angka1 + " / " + angka2 + " adalah " + hasil);
            }
        } else if (simbol == '%') {
            // Pengecekan modulus dengan nol (0)
            if (angka2 == 0) {
                System.out.println("Error, tidak terdefinisi");
            } else {
                double hasil = angka1 % angka2;
                System.out.println("Hasil dari " + angka1 + " % " + angka2 + " adalah " + hasil);
            }
        } else {
            // Jika simbol operasi tidak tersedia
            System.out.println("Waduhhh, Operasi yang anda masukkan tidak ada!!!");
        }

        // Menutup objek Scanner
        m.close();
    }
}
