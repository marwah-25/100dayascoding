public class day19 {
    public static void main(String[] args) {
        double angka = 150.75;

        float angkaFloat = (float) angka;
        long angkaLong = (long) angkaFloat;
        int angkaInt = (int) angkaLong;
        short angkaShort = (short) angkaInt;
        byte angkaByte = (byte) angkaShort;

        System.out.println("double: "+angka);
        System.out.println("float: "+angkaFloat);
        System.out.println("long: "+angkaLong);
        System.out.println("int: "+angkaInt);
        System.out.println("short: "+angkaShort);
        System.out.println("byte: "+angkaByte);

    }
}
