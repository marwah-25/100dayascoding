import java.util.Scanner;

public class soal11 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan angka basis (m) :  ");
        int n = p.nextInt();

        System.out.print("Masukkan angka pangkat (n) : ");
        int m = p.nextInt();

        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= m;
            
        }
        System.out.println("Hasil "+ n+" pangkat "+m+" adalah : "+hasil);
    }
}
