
import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);
        
        System.out.print("Masukkan tabungan awal: ");
        int a = marwa.nextInt();

        System.out.print("Masukkan uang masuk: ");
        int b = marwa.nextInt();

        System.out.print("Masukkan uang diambil: ");
        int c = marwa.nextInt();

        System.out.println("==========================");
        System.out.println("      DATA TABUNGAN");
        System.out.println("==========================");
        System.out.println("Tabungan Awal\t: "+a);
        System.out.println("Uang Masuk\t: "+b);
        System.out.println("Uang Diambil\t: "+c);
        System.out.println();
        int d = a+b;
        int e = d-c;
        System.out.println("Jumlah Tabungan : "+ e);
        System.out.println("==========================");


        

    }



    
}
