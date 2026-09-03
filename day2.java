public class day2 {
    public static void main(String[] args) {

        // Menggunakan println()
        System.out.println("halo");
        System.out.println("ini biodata saya");
        System.out.println("");

        // Menggunakan print()
        System.out.print("saya kuliah di");
        System.out.print(" UNSULBAR");
        System.out.println("");

        // Menggunakan printf()
        String nama = "marwah";
        String NIM  = "D0224303";
        
        System.out.println("");
        System.out.printf("| %-13s : %-9s |%n","Nama ", nama);
        System.out.printf("| %-13s : %-9s |%n", "NIM", NIM);
    }
}
