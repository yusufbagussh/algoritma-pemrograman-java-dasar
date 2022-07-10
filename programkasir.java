import java.util.Scanner; // Import the Scanner Class

class programkasir {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);

		// deklarasi
		int jmlbrg = 0, pil = 0, i = 0;
		double kembalian = 0, bayar = 0, jumlah = 0;

		System.out.println("=============Selamat Datang di Toko Luwes=============");
		System.out.println("Kode barang		Menu\n" + "   1 			Sosis\n" + "   2 			Nugget\n"
				+ "   3 			Tempura\n" + "   4 			Otak-otak \n");
		System.out.println(" ");

		int[] kode = new int[10];
		int[] brg = new int[10];
		int[] harga = new int[10];
		double[] total = new double[10];
		String[] nama = new String[10];

		System.out.print("Masukkan Jumlah Barang yang ingin dibeli : ");
		jmlbrg = data.nextInt();
		data.nextLine();

		for (i = 1; i <= jmlbrg; i++) {
			System.out.print("Masukkan kode barang ke-" + i + " : ");
			kode[i] = data.nextInt();
			System.out.print("Masukkan jumlah barang ke-" + i + " : ");
			brg[i] = data.nextInt();

			switch (kode[i]) {
				case '1':
					nama[i] = "Sosis";
					harga[i] = 23000;
					break;
				case '2':
					nama[i] = "Nugget";
					harga[i] = 18000;
					break;
				case '3':
					nama[i] = "Tempura";
					harga[i] = 15000;
					break;
				case '4':
					nama[i] = "Otak-otak";
					harga[i] = 18000;
					break;
				default:
					System.out.println("Kode Barang Tidak Tersedia");
			}
		}

		for (i = 1; i <= jmlbrg; i++) {
			total[i] = (double) brg[i] * harga[i];
		}

		for (i = 1; i <= jmlbrg; i++) {
			System.out.println(i + " " + " " + nama[i] + " " + brg[i] + " " + "Rp" + total[i]);
		}

	}
}
