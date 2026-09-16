import java.util.Scanner;
public class day15 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        int a = y.nextInt();

        System.out.print("Masukkan jumlah barang: ");
        int b = y.nextInt();

        System.out.print("Masukkan jumlah orang: ");
        int c = y.nextInt();
        
        System.out.println();
        int totalHarga = a*b;
        int hargaPerOrang = totalHarga/c;
        System.out.println("Total harga : "+ totalHarga);
        System.out.println("Harga per orang: "+hargaPerOrang);

    }

    
}
