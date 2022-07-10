import java.util.Scanner; //Import the Scanner class

class Tugas13_V3420077 {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);
        // DATA DAFTAR BARANG
        int i = 1, j, jmlbrg = 6, jnsbeli = 6, totalharga = 0;
        int[] hargabarang = { 0, 70000, 400000, 450000, 900000, 500000, 160000 };
        int[] stokbarang = { 0, 20, 20, 10, 15, 12, 10 };
        String[] namabarang = { " ", "Mouse", "RAM", "HDD", "VGA", "SSD", "Monitor" };
        String[] kodebarang = { " ", "M01", "R02", "H03", "V04", "S05", "M06" };
        int[] jmlbeli = new int[jmlbrg + 1];
        int[] subtotal = new int[jmlbrg + 1];

        System.out.println(
                "===================================== DAFTAR BARANG DI TOKO KAMI ==================================");
        System.out.println("No.		Kode Barang		Nama Barang		Harga Barang		Stok Barang");
        daftarbarang(kodebarang, namabarang, hargabarang, stokbarang, jmlbrg);
        Spasi();

        // DATA SEBUAH PEMBELIAN BARANG
        System.out.print("Banyak Jenis Barang Yang Ingin Dibeli		: ");
        jnsbeli = masukan.nextInt();
        masukan.nextLine();
        Spasi();
        for (j = 1; j <= jnsbeli; j++) {
            System.out.print("Nomor Barang Ke- " + j + "				: ");
            i = masukan.nextInt();
            masukan.nextLine();
            System.out.print("Jumlah Barang	Ke- " + j + "				: ");
            jmlbeli[j] = masukan.nextInt();
            masukan.nextLine();
            perhitungan1(j, i, jmlbeli, stokbarang, hargabarang, subtotal);
            perhitungan2(j, i, jmlbeli, stokbarang);
            kodebarang[j] = kodebarang[i];
            namabarang[j] = namabarang[i];
            hargabarang[j] = hargabarang[i];
        }

        Spasi();
        System.out.println(
                "=================================================== DATA PEMBELIAN ================================================");
        for (j = 1; j <= jnsbeli; j++) {
            datapembelian(j, kodebarang, namabarang, hargabarang, jmlbeli, subtotal);
            Spasi();
            totalharga += subtotal[j];
        }

        // KWITANSI PEMBELIAN
        Spasi();
        System.out.println(
                "---------------------------------------------------- KWITANSI ----------------------------------------------------");
        Spasi();
        System.out.println("Kode Barang		Nama Barang	Harga Per Item		Jumlah Pembelian		Harga Total");
        kwitansi(jnsbeli, kodebarang, namabarang, hargabarang, jmlbeli, subtotal);
        Spasi();
        System.out.println(
                "Total Pembayaran                                                				: Rp. " + totalharga);
        Spasi();
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------");
    }

    public static void Spasi() {
        System.out.println(" ");
    }

    public static void daftarbarang(String[] kodebarang, String[] namabarang, int[] hargabarang, int[] stokbarang,
            int jmlbrg) {
        for (int i = 1; i <= jmlbrg; i++) {
            System.out.println("" + i + "		" + kodebarang[i] + "			" + namabarang[i]
                    + "	        	Rp. " + hargabarang[i] + "		" + stokbarang[i]);
        }
    }

    public static void Perhitungan(int i, int jnsbeli, int[] jmlbeli, int[] stokbarang, String[] namabarang,
            int[] subtotal, int[] hargabarang, String[] kodebarang) {
        Scanner masukan = new Scanner(System.in);
        for (int j = 1; j <= jnsbeli; j++) {
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
    }

    public static int[] perhitungan1(int j, int i, int[] jmlbeli, int[] stokbarang, int[] hargabarang, int[] subtotal) {
        if (jmlbeli[j] > stokbarang[i]) {
            subtotal[j] = stokbarang[i] * hargabarang[i];
        } else {
            subtotal[j] = jmlbeli[j] * hargabarang[i];
        }
        return subtotal;
    }

    public static int[] perhitungan2(int j, int i, int[] jmlbeli, int[] stokbarang) {
        if (jmlbeli[j] > stokbarang[i]) {
            jmlbeli[j] = stokbarang[i];
        } else {
            jmlbeli[j] = jmlbeli[j];
        }
        return jmlbeli;
    }

    public static void datapembelian(int j, String[] kodebarang, String[] namabarang, int[] hargabarang, int[] jmlbeli,
            int[] subtotal) {
        System.out.println("PEMBELIAN KE-" + j + "");
        System.out.println("Kode Barang		Nama Barang	Harga Per Item		Jumlah Pembelian        	Harga Total");
        System.out.println("" + kodebarang[j] + "			" + namabarang[j] + "	    	Rp. " + hargabarang[j]
                + "			" + jmlbeli[j] + "			Rp. " + subtotal[j] + "");
    }

    public static void kwitansi(int jnsbeli, String[] kodebarang, String[] namabarang, int[] hargabarang, int[] jmlbeli,
            int[] subtotal) {
        for (int j = 1; j <= jnsbeli; j++) {
            System.out.println("" + kodebarang[j] + "			" + namabarang[j] + "		Rp. " + hargabarang[j]
                    + "			" + jmlbeli[j] + "			Rp. " + subtotal[j] + " ");
        }
    }
}
