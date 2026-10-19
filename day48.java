
import java.util.Scanner;

public class day48{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();

        System.out.print("Masukkan simbol operasi (+, -, *, /, %): ");
        char operasi = sc.next().charAt(0);

        double hasil = 0;
        boolean valid = true;

        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                break;

            case '-':
                hasil = angka1 - angka2;
                break;

            case '*':
                hasil = angka1 * angka2;
                break;

            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println(
                        "Error, pembagian dengan nol tidak diperbolehkan"
                    );
                    valid = false;
                }
                break;

            case '%':
                if (angka2 != 0) {
                    hasil = angka1 % angka2;
                } else {
                    System.out.println(
                        "Error, modulus dengan nol tidak diperbolehkan"
                    );
                    valid = false;
                }
                break;

            default:
                System.out.println("Operasi tidak tersedia");
                valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + hasil);
        }

        sc.close();
    }
}
