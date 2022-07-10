import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

class TugasArrayKasir {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        // inisialisasi format
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        // Deklarasi variabel
        int i = 0, jumlah = 0;
        double totalbayar = 0;
        // Deklarasi Array
        int[] kode = new int[10];
        int[] qty = new int[10];
        int[] harga = new int[10];
        double[] subtotal = new double[10];
        String[] barang = new String[10];

        System.out.println("==================== DATA PEMBELIAN BARANG TOKO BAJU ====================");
        System.out.println("KODE    JENIS BARANG :");
        System.out.println(" 1       Baju  \n" + " 2       Daster \n" + " 3       Celana \n" + " 4       Gamis \n"
                + " 5       Gardigan");
        System.out.println(" ");
        System.out.print("Masukan jumlah jenis barang yang akan dibeli : ");
        jumlah = masukan.nextInt();
        masukan.nextLine();
        System.out.println(" ");

        for (i = 1; i <= jumlah; i++) {
            System.out.print("Masukan Kode Barang Ke-" + i + " : ");
            kode[i] = masukan.nextInt();
            masukan.nextLine();
            System.out.print("Masukan Banyaknya Barang Ke-" + i + " : ");
            qty[i] = masukan.nextInt();
            masukan.nextLine();

            switch (kode[i]) {
                case 1:
                    barang[i] = "Baju     ";
                    harga[i] = 25000;
                    break;
                case 2:
                    barang[i] = "Daster    ";
                    harga[i] = 50000;
                    break;
                case 3:
                    barang[i] = "Celana     ";
                    harga[i] = 30000;
                    break;
                case 4:
                    barang[i] = "Gamis  ";
                    harga[i] = 45000;
                    break;
                case 5:
                    barang[i] = "Gardigan ";
                    harga[i] = 53000;
                    break;
                default:
                    System.out.println("Kode Barang Tidak Tersedia");
            } 
        }
        // format number
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println("");
        System.out.println("==================== KWITANSI PEMBELIAN ====================");
        System.out.println("KODE    NAMA BARANG       HARGA            BANYAKNYA       SUB TOTAL");
        for (i = 1; i <= jumlah; i++) {
            subtotal[i] = qty[i] * harga[i];
            totalbayar += subtotal[i];
            System.out.println("  " + i + "      " + barang[i] + "       " + kursIndonesia.format(harga[i]) + "        "
                    + qty[i] + "           " + kursIndonesia.format(subtotal[i]));
        }
        System.out.println(" ");
        System.out.println("Total Pembayaran : " + kursIndonesia.format(totalbayar));
    }
}