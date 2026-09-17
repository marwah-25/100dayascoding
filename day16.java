import java.util.Scanner;
public class day16 {

    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        System.out.println("Input");
        System.out.print("Masukkan jumlah permen: ");
        int a = oh.nextInt();

        System.out.print("Masukkan jumlah siswa: ");
        int b = oh.nextInt();

        int jmlhPermenPerSiswa = a/b;
        int sisa = a%b;

        System.out.println();
        System.out.println("Output");
        System.out.println("Jumlah permen\t: "+a);
        System.out.println("Jumlah siswa\t: "+ b);
        System.out.println("Setiap siswa mendapatkan : "+jmlhPermenPerSiswa+" permen");
        System.out.println("Permen yang tersisa\t: "+sisa+" permen");
    }
}
