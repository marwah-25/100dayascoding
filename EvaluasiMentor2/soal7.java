import java.util.Scanner;

public class evaluasi2Soal7 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("=== MENU ATM ===\r\n" + //
                        "1. Setor Uang\r\n" + //
                        "2. Tarik Uang\r\n" + //
                        "");
                        System.out.print("pilih menu (1/2): ");
                        int menu = m.nextInt();

                        

                        int saldoAwal = 100000;
                        if ( menu == 1) {
                            System.out.print("Masukkan Nominal: ");
                             int nominal = m.nextInt();
                             saldoAwal += nominal;
                            System.out.println("Setor berhasil. Saldo Anda: Rp "+saldoAwal);
                            
                        }else if (menu == 2) {
                            System.out.print("Masukkan Nominal: ");
                        int nominal = m.nextInt();
                            if (saldoAwal >= nominal) {
                                 saldoAwal -= nominal;
                        System.out.println("t               arik tunai berhasil. Saldo Anda: Rp "+saldoAwal);
                            }else{
                                System.out.println("Maaf, saldo tidak cukup! Saldo Anda: Rp "+saldoAwal);
                            }
                        }else{
                            System.out.println("Error: Menu tidak valid. Transaksi dibatalkan.");
                        }
    }
}
