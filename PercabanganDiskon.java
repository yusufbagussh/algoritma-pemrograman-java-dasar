import java.util.Scanner; //Import the Scanner class

class PercabanganDiskon {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        double totalbelanja, diskon, totaldiskon, bayarsetelahdiskon; // deklarasitipe bilangan desimal

        System.out.println("==== Menghitung Total Diskon dan Harga Setelah Diskon====");
        System.out.print("Masukan Total Belanja Anda:");
        totalbelanja = masukan.nextDouble(); // Read user input string

        if (totalbelanja >= 100000) {
            diskon = 10;
            totaldiskon = (double) diskon / 100 * totalbelanja;
            bayarsetelahdiskon = totalbelanja - totaldiskon;
        } else if (totalbelanja >= 50000) {
            diskon = 5;
            totaldiskon = (double) diskon / 100 * totalbelanja;
            bayarsetelahdiskon = totalbelanja - totaldiskon;
        } else {
            diskon = 0;
        }
        System.out.println("Anda Mendapatkan Diskon : " + diskon + " %");
        System.out.println("Total Diskon :" + totaldiskon);
        System.out.println("Harga Bayar Setelah Diskon  :" + bayarsetelahdiskon);

    }
}