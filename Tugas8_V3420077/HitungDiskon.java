import java.util.Scanner; //Import the Scanner class

class HitungDiskon {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        // Bagian Deklarasi
        double totalbelanja, diskon, totaldiskon, bayarsetelahdiskon; // deklarasitipe bilangan desimal

        // Bagian Input
        System.out.println("==== Menghitung Total Diskon dan Harga Setelah Diskon====");
        System.out.print("Masukan Total Belanja Anda:");
        totalbelanja = masukan.nextDouble(); // Read user input string

        // Bagian Hitung
        if (totalbelanja >= 100000) {
            diskon = 10;
        } else if (totalbelanja >= 50000) {
            diskon = 5;
        } else {
            diskon = 0;
        }

        totaldiskon = diskon / 100 * totalbelanja;
        bayarsetelahdiskon = totalbelanja - totaldiskon;

        // Bagian Cetak Hasil
        System.out.println("Anda Mendapatkan Diskon : " + diskon + " %");
        System.out.println("Total Diskon :" + totaldiskon);
        System.out.println("Harga Bayar Setelah Diskon  :" + bayarsetelahdiskon);

    }
}