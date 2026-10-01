import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama : ");
        int a = m.nextInt();
        System.out.print("Masukkan nilai kedua   : ");
        int b = m.nextInt();

        System.out.println("Nilai pertama lebih kecil atau sama dengan nilai kedua : "+(a<=b));
        System.out.println("Nilai pertama lebih besar atau sama dengan nilai kedua : "+(a>=b));
    }
}
