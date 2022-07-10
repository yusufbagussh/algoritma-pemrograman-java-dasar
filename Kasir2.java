import java.util.Scanner; //Import the Scanner class

class Kasir2 {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);
        int i;
        int jmlbarang = 5;

        // System.out.print("Masukkan Banyak Jenis Barang : ");
        // jmlbarang = masukan.nextInt();
        // masukan.nextLine();

        String[] namabarang = { " ", "Mouse", "Keyboard", "Flashdisk", "HardDisk", "Monitor" };
        int[] kodebarang = { 0, 01, 02, 03, 04, 05 };
        int[] hargabarang = { 0, 70000, 100000, 50000, 450000, 160000 };
        String[] stokbarang = { " ", "20", "20", "10", "15", "12" };

        // for (i = 1; i <= jmlbarang; i++) {
        // System.out.print("Masukkan nama barang ke-" + i + " : ");
        // namabarang[i] = masukan.nextLine();
        // }
        // for (i = 1; i <= jmlbarang; i++) {
        // System.out.print("Masukkan kode barang ke-" + i + " : ");
        // kodebarang[i] = masukan.nextLine();
        // }
        // for (i = 1; i <= jmlbarang; i++) {
        // System.out.print("Masukkan harga barang ke-" + i + " : ");
        // hargabarang[i] = masukan.nextInt();
        // masukan.nextLine();
        // }
        // for (i = 1; i <= jmlbarang; i++) {
        // System.out.print("Masukkan stok barang ke-" + i + " : ");
        // stokbarang[i] = masukan.nextLine();
        // }

        System.out.println("===== Daftar Barang =====");
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

        int jmlpembelian = 0, jumlah = 0;
        int[] jmlbeli = new int[jmlbarang + 1];

        System.out.println("===== Daftar Pembelian =====");
        System.out.print("Masukkan Banyaknya Pembelian : ");
        jmlpembelian = masukan.nextInt();
        masukan.nextLine();
        // System.out.print("Masukan jumlah jenis barang yang akan dibeli : ");
        // jumlah = masukan.nextInt();
        // masukan.nextLine();
        // System.out.println(" ");

        for (i = 1; i <= jmlpembelian; i++) {
            System.out.println("Pembelian ke-" + i);
            if (jumlah <= 5) {

                System.out.print("Masukan Kode Barang Ke-" + i + " : ");
                kodebarang[i] = masukan.nextInt();
                masukan.nextLine();
                System.out.print("Masukan Nama Barang Ke-" + i + " : ");
                namabarang[i] = masukan.nextLine();
                System.out.print("Masukan Harga Barang Ke-" + i + " : ");
                hargabarang[i] = masukan.nextInt();
                masukan.nextLine();
                System.out.print("Masukan Banyaknya Barang Ke-" + i + " : ");
                jmlbeli[i] = masukan.nextInt();
                masukan.nextLine();

            }
            // for (i = 1; i <= jumlah; i++) {
            // System.out.print("Masukan Kode Barang Ke-" + i + " : ");
            // kodebarang[i] = masukan.nextInt();
            // masukan.nextLine();
            // System.out.print("Masukan Banyaknya Barang Ke-" + i + " : ");
            // jmlbeli[i] = masukan.nextInt();
            // masukan.nextLine();

            // switch (kodebarang[i]) {
            // case 1:
            // namabarang[i] = "Mouse ";
            // hargabarang[i] = 25000;
            // break;
            // case 2:
            // namabarang[i] = "Keyboard ";
            // hargabarang[i] = 50000;
            // break;
            // case 3:
            // namabarang[i] = "FlashDisk ";
            // hargabarang[i] = 30000;
            // break;
            // case 4:
            // namabarang[i] = "HardDisk ";
            // hargabarang[i] = 45000;
            // break
            // case 5:
            // namabarang[i] = "Monitor ";
            // hargabarang[i] = 53000;
            // break;
            // default:
            // System.out.println("Kode Barang Tidak Tersedia");
            // }

            // }
        }
        double[] hargabeli = new double[jmlpembelian + 1];
        for (i = 1; i <= jmlpembelian; i++) {
            hargabeli[i] = (double) hargabarang[i] * jmlbeli[i];
        }

        double hargatotal = 0;
        for (i = 1; i <= jmlpembelian; i++) {
            hargatotal = hargatotal + hargabeli[i];
        }

        for (i = 1; i <= jmlpembelian; i++) {
            System.out.println("Kode barang ke-" + i + " : " + kodebarang[i]);
        }
        for (i = 1; i <= jmlpembelian; i++) {
            System.out.println("harga barang ke-" + i + " : " + hargabarang[i]);
        }
        for (i = 1; i <= jmlpembelian; i++) {
            System.out.println("Banyak barang ke-" + i + " : " + jmlbeli[i]);
        }
        for (i = 1; i <= jmlpembelian; i++) {
            System.out.println("Jumlah harga beli barang ke-" + i + " yang dibeli : " + hargabeli[i]);
        }
        System.out.println("Jumlah harga beli total: " + hargatotal);

        // for (i = 1; i <= jmlbarang; i++) {
        // System.out.print("Jumlah barang ke-" + i + " yang dibeli : ");
        // jmlbeli[i] = masukan.nextInt();
        // masukan.nextLine();
        // }

        // double[] hargabeli = new double[jmlbarang + 1];
        // for (i = 1; i <= jmlbarang; i++) {
        // hargabeli[i] = (double) hargabarang[i] * jmlbeli[i];
        // }

        // double hargatotal = 0;
        // for (i = 1; i <= jmlbarang; i++) {
        // hargatotal = hargatotal + hargabeli[i];
        // }

        // for (i = 1; i <= jmlbarang; i++) {
        // System.out.println("Jumlah barang ke-" + i + " yang dibeli : " + jmlbeli[i]);
        // }
        // for (i = 1; i <= jmlbarang; i++) {
        // System.out.println("Jumlah harga beli barang ke-" + i + " yang dibeli : " +
        // hargabeli[i]);
        // }
        // System.out.println("Jumlah harga beli total: " + hargatotal);

        System.out.println("======== Kuitansi Pembelian ========");
        System.out.println("Kode Nama Barang Harga Barang Kuantitas Sub Total");
        for (i = 1; i <= jmlpembelian; i++) {
            System.out.println(
                    kodebarang[i] + " " + namabarang[i] + " " + hargabarang[i] + " " + jmlbeli[i] + " " + hargabeli[i]);
        }
        System.out.println("Harga Total : " + hargatotal);
    }
}