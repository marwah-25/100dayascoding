import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int data = m.nextInt();

        int[] angka = new int[data];

        System.out.println();
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-"+(i + 1)+": ");
            angka [i] = m.nextInt();
            
        }
        System.out.println();
        System.out.println("Data yang dimasukkan:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nilai ke-"+(i+1)+":"+angka[i]);
        }
    }
}
