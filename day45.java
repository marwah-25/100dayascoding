import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.println("1 = Senin");
        System.out.println("2 = Selasa");
        System.out.println("3 = Rabu");
        System.out.println("4 = Kamis");
        System.out.println("5 = Jumat");
        System.out.println("6 = Sabtu");
        System.out.println("7 = Minggu");
        System.out.print("Masukkan nomor hari: ");
        int hari = m.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Ahad");
                break;
        
            default:
                System.out.println("Nomor Hari Tidak Valid");
                break;
        }
    }
    
}
