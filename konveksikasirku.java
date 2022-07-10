import java.util.Scanner;

class konveksikasirku {
	public static void main(String[] abc) {

		Scanner data = new Scanner(System.in);
		int i = 0, j = 0, menu;
		int jml[] = new int[20];
		int total = 0, kembali = 0, tunai = 0;
		int kode[] = { 0, 1, 2, 3, 4, 5 };
		int harga[] = { 0, 45000, 75000, 125000, 120000, 125000 };
		String[] barang = { "", "Kaos Cotton Combed 30s", "Kaos Polo Cotton Pique", "PDH/Almet American Drill",
				"Jaket Sport Baby Terry", "jersey Printing Milano" };

		System.out.println("Pilih Menu di KonveksiKu");
		System.out.println("\n" + "1. Mesin Kasir");
		System.out.println("2. Cek Harga Barang");
		System.out.print("\n" + "Masukkan pilihan menu diatas : ");
		menu = data.nextInt();
		data.nextLine();
		System.out.println("");
		pemilihan(menu, i, j, kode, barang, harga, jml, total, kembali, tunai);
	}

	public static void pemilihan(int menu, int i, int j, int[] kode, String[] barang, int[] harga, int[] jml, int total,
			int kembali, int tunai) {
		Scanner data = new Scanner(System.in);
		switch (menu) {
			case 1:
				System.out.println("Tekan angka nul (0) jika anda ingin berhenti");
				for (i = 1; i <= 5; i++) {
					System.out.print(+kode[i]);
					System.out.print("." + barang[i]);
					System.out.print("\t" + "|| Rp " + harga[i]);
					System.out.println("");
				}
				int nob = 1;
				for (i = 1; nob != 0; i++) {
					System.out.print("Kode Produk : ");
					i = data.nextInt();
					nob = i;
					if (nob == 0) {
						continue;
					}
					System.out.print("||" + kode[i]);
					System.out.print("||" + barang[i]);
					System.out.println("\t" + "||" + harga[i]);
					System.out.print("Total pcs ");
					jml[i] = data.nextInt();
					j = j + jml[i];
					int bayar = harga[i] * jml[i];
					total = total + bayar;
					System.out.print("\t" + "\t" + "\t" + "\t" + "Rp." + bayar + "\n");
				}

				if (nob == 0) {
					System.out.println(" Total Pemesanan Rp " + total);
					System.out.print(" Total Tunai Rp ");
					tunai = data.nextInt();
					kembali = tunai - total;
					System.out.println("Total Kembali Rp " + kembali);
					System.out.println("Total Beli produk :" + j);
					System.out.println("  ");
					System.out.println("TERIMAKASIH BROO atas Pemesanan Di KonveksiKu");
				}
				System.out.println("Jalan Maju Makmur No 34 Purwokerto || 085872772318");
				break;
			case 2:
				for (i = 1; i <= 5; i++) {
					System.out.print(" ||" + kode[i]);
					System.out.print(" ||" + barang[i]);
					System.out.println(" ||\t Rp " + harga[i]);
					System.out.print("");
				}
				break;
			default:
				System.out.println("SILAHKAN PILIH MENU YANG TERSIDA!");
				break;
		}
	}
}