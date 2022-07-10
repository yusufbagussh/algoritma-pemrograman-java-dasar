import java.util.Scanner; //Import the Scanner class

class TheLastKasir {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int i, j, jmlbrg = 6, jnsbeli = 6, totalharga = 0;

        // DATA DAFTAR BARANG

        int[] hargabarang = { 0, 70000, 400000, 450000, 900000, 500000, 160000 };
        int[] stokbarang = { 0, 20, 20, 10, 15, 12, 10 };
        String[] namabarang = { " ", "Mouse", "RAM", "HDD", "VGA", "SSD", "Monitor" };
        String[] kodebarang = { "0", "M01", "K02", "F03", "H04", "S05", "M06" };
        int[] jmlbeli = new int[jmlbrg + 1];
        int[] subtotal = new int[jmlbrg + 1];

        System.out.println(
                "===================================== DAFTAR BARANG DI TOKO KAMI ==================================");
        System.out.println("No.		Kode Barang		Nama Barang		Harga Barang		Stok Barang");
        for (i = 1; i <= jmlbrg; i++) {
            System.out.println("" + i + "		" + kodebarang[i] + "			" + namabarang[i]
                    + "	        	Rp. " + hargabarang[i] + "		" + stokbarang[i]);
        }
        System.out.println(" ");

        // DATA SEBUAH PEMBELIAN BARANG

        System.out.print("Banyak Jenis Barang Yang Ingin Dibeli		: ");
        jnsbeli = masukan.nextInt();
        masukan.nextLine();
        System.out.println(" ");
        for (j = 1; j <= jnsbeli; j++) {
            System.out.print("Nomor Barang Ke- " + j + "				: ");
            i = masukan.nextInt();
            masukan.nextLine();
            System.out.print("Jumlah Barang	Ke- " + j + "				: ");
            jmlbeli[j] = masukan.nextInt();
            masukan.nextLine();
            if (jmlbeli[j] > stokbarang[i]) {
                subtotal[j] = stokbarang[i] * hargabarang[i];
            } else {
                subtotal[j] = jmlbeli[j] * hargabarang[i];
            }
            if (jmlbeli[j] > stokbarang[i]) {
                jmlbeli[j] = stokbarang[i];
            } else {
                jmlbeli[j] = jmlbeli[j];
            }
            kodebarang[j] = kodebarang[i];
            namabarang[j] = namabarang[i];
            hargabarang[j] = hargabarang[i];
        }

        System.out.println(" ");
        System.out.println(
                "=================================================== DATA PEMBELIAN ================================================");
        for (j = 1; j <= jnsbeli; j++) {
            System.out.println("PEMBELIAN KE-" + j + "");
            System.out.println(
                    "Kode Barang		Nama Barang	Harga Per Item		Jumlah Pembelian        	Harga Total");
            System.out.println("" + kodebarang[j] + "			" + namabarang[j] + "	    	Rp. " + hargabarang[j]
                    + "			" + jmlbeli[j] + "			Rp. " + subtotal[j] + "");
            System.out.println(" ");
            totalharga += subtotal[j];
        }

        // KWITANSI PEMBELIAN
        System.out.println(" ");
        System.out.println(
                "---------------------------------------------------- KWITANSI ----------------------------------------------------");
        System.out.println(" ");
        System.out.println("Kode Barang		Nama Barang	Harga Per Item		Jumlah Pembelian		Harga Total");
        for (j = 1; j <= jnsbeli; j++) {
            System.out.println("" + kodebarang[j] + "			" + namabarang[j] + "		Rp. " + hargabarang[j]
                    + "			" + jmlbeli[j] + "			Rp. " + subtotal[j] + " ");
        }

        System.out.println(" ");
        System.out.println("Total Pembayaran				: Rp. " + totalharga);
        System.out.println(" ");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");

    }
}
