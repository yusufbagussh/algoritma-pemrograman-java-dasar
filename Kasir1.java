import java.util.Scanner; //Import the Scanner class

class Kasir1 {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);
        int i, jmlbarang;

        System.out.print("Masukkan Banyak Jenis Barang : ");
        jmlbarang = masukan.nextInt();
        masukan.nextLine();

        String[] namabarang = new String[jmlbarang + 1];
        String[] kodebarang = new String[jmlbarang + 1];
        int[] hargabarang = new int[jmlbarang + 1];
        String[] stokbarang = new String[jmlbarang + 1];

        for (i = 1; i <= jmlbarang; i++) {
            System.out.print("Masukkan nama barang ke-" + i + " : ");
            namabarang[i] = masukan.nextLine();
        }
        for (i = 1; i <= jmlbarang; i++) {
            System.out.print("Masukkan kode barang ke-" + i + " : ");
            kodebarang[i] = masukan.nextLine();
        }
        for (i = 1; i <= jmlbarang; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            hargabarang[i] = masukan.nextInt();
            masukan.nextLine();
        }
        for (i = 1; i <= jmlbarang; i++) {
            System.out.print("Masukkan stok barang ke-" + i + " : ");
            stokbarang[i] = masukan.nextLine();
        }

        int[] jmlbeli = new int[jmlbarang + 1];
        for (i = 1; i <= jmlbarang; i++) {
            System.out.print("Jumlah barang ke-" + i + " yang dibeli : ");
            jmlbeli[i] = masukan.nextInt();
            masukan.nextLine();
        }

        double[] hargabeli = new double[jmlbarang + 1];
        for (i = 1; i <= jmlbarang; i++) {
            hargabeli[i] = (double) hargabarang[i] * jmlbeli[i];
        }

        double hargatotal = 0;
        for (i = 1; i <= jmlbarang; i++) {
            hargatotal = hargatotal + hargabeli[i];
        }
        System.out.println("===== Daftar Barang =====");
        for (i = 1; i <= jmlbarang; i++) {
            System.out.println(kodebarang[i] + "  " + namabarang[i] + "  " + hargabarang[i] + "  " + stokbarang[i]);
        }
        System.out.println("===== Daftar Pembelian =====");
        for (i = 1; i <= jmlbarang; i++) {
            System.out.println("Nama barang ke-" + i + " : " + namabarang[i]);
        }
        for (i = 1; i <= jmlbarang; i++) {
            System.out.println("Kode barang ke-" + i + " : " + kodebarang[i]);
        }
        for (i = 1; i <= jmlbarang; i++) {
            System.out.println("harga barang ke-" + i + " : " + hargabarang[i]);
        }
        for (i = 1; i <= jmlbarang; i++) {
            System.out.println("Stok barang ke-" + i + " : " + stokbarang[i]);
        }

        for (i = 1; i <= jmlbarang; i++) {
            System.out.println("Jumlah barang ke-" + i + " yang dibeli : " + jmlbeli[i]);
        }
        for (i = 1; i <= jmlbarang; i++) {
            System.out.println("Jumlah harga beli barang ke-" + i + " yang dibeli : " + hargabeli[i]);
        }
        System.out.println("Jumlah harga beli total: " + hargatotal);

        System.out.println("======== Kuitansi ========");
        System.out.println("Kode Barang  Nama Barang  Harga Barang  Jumlah  Sub Total");
        for (i = 1; i <= jmlbarang; i++) {
            System.out.println(kodebarang[i] + "  " + namabarang[i] + "  " + hargabarang[i] + "  " + jmlbeli[i]
                    + "     " + hargabeli[i]);
        }
        System.out.println("harga total : " + hargatotal);
    }
}