import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Masukkan angka hari (1-7): ");
        int hari = m.nextInt();

        if (hari==1) {
            System.out.println("Senin");
            
        }else if (hari==2) {
            System.out.println("Selasa");
        
        }else if (hari==3) {
            System.out.println("Rabu");
        
        }else if (hari==4) {
            System.out.println("Kamis");
        
        }else if (hari==5) {
            System.out.println("Jumat");
        
        }else if (hari==6) {
            System.out.println("Sabtu");

        }else if (hari==7) {
            System.out.println("Minggu");

        }else{
            System.out.println("Angka tidak valid. Masukkan angka 1-7");
        }
    }
    
}
