import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama : ");
        int a = m.nextInt();
        System.out.print("MAsukkan nilai kedua   : ");
        int b =m.nextInt();

        System.out.println("Nilai pertama lebih kecil dari nilai kedua : "+(a<b));
        System.out.println("Nilai pertama lebih besar dari nilai kedua : "+(a>b));
    }
}
