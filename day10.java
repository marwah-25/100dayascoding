public class day10 {
    public static void main(String[] args) {
        
        // 1. Tipe Data Byte (bilangan bulat sangat kecil)
        System.out.println("byte");
        System.out.println("Minimal : " + Byte.MIN_VALUE);
        System.out.println("Maksimal: " + Byte.MAX_VALUE);

        // 2. Tipe Data Short (bilangan bulat skala sedang)
        System.out.println("\nshort");
        System.out.println("Minimal : " + Short.MIN_VALUE);
        System.out.println("Maksimal: " + Short.MAX_VALUE);

        // 3. Tipe Data Int (bilangan bulat standar)
        System.out.println("\nint");
        System.out.println("Minimal : " + Integer.MIN_VALUE);
        System.out.println("Maksimal: " + Integer.MAX_VALUE);

        // 4. Tipe Data Long (bilangan bulat sangat besar)
        System.out.println("\nlong");
        System.out.println("Minimal : " + Long.MIN_VALUE);
        System.out.println("Maksimal: " + Long.MAX_VALUE);

        // 5. Tipe Data Float (bilangan pecahan presisi tunggal)
        System.out.println("\nfloat");
        System.out.println("Nilai positif terkecil : " + Float.MIN_VALUE);
        System.out.println("Nilai terbesar         : " + Float.MAX_VALUE);

        // 6. Tipe Data Double (bilangan pecahan presisi ganda)
        System.out.println("\ndouble");
        System.out.println("Nilai positif terkecil : " + Double.MIN_VALUE);
        System.out.println("Nilai terbesar         : " + Double.MAX_VALUE);

        // 7. Tipe Data Char (karakter Unicode - di-cast ke int agar muncul rentang angkanya)
        System.out.println("\nchar");
        System.out.println("Minimal : " + (int) Character.MIN_VALUE);
        System.out.println("Maksimal: " + (int) Character.MAX_VALUE);

    }
    
}
