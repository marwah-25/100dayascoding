import java.util.Scanner;

public class soal8 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan ukuran sisi(n): ");
        int n = m.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
}
