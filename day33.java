import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian : ");
        int nilai = m.nextInt();

        System.out.print("Apakah sudah terdaftar? : ");
        boolean terdaftar = m.nextBoolean();

        if (nilai > 75 && terdaftar == true){
            System.out.println("Status : Boleh Mengikuti Ujian");
        }else{
            System.out.println("Status : Belum Boleh Mengikuti Ujian");
        }

    }
    
}
