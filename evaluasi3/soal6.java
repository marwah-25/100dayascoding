import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan batas angka(n): ");
        int n = m.nextInt();

        int total=0;
        for (int i = 1; i <= n; i++) {
            total+=i;
           
            
        }
        System.out.println("Total penjumlahan: "+total);
    }
}
