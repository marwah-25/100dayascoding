import java.util.Scanner;
public class soal2 {
public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
    System.out.print("Masukkan batas angka(n): ");
    int n = m.nextInt();

    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            System.out.print(i+" ");
        }
        
        
    }
}
}
