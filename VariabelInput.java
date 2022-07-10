import java.util.Scanner; //Import the Scanner class

class VariabelInput {
	public static void main(String[] abc) {
		Scanner masukan = new Scanner(System.in); // Create a Scanner Object
		int x; // deklarasi
		int y;
		int jumlah, kurang, kali; // deklarasi saja (tipe bil bulat)
		double bagi; // deklarasitipe bilangan desimal
		String mapel;
		int sisahasilbagi;

		System.out.print("Masukan Nama Mata Pelajaran:");
		mapel = masukan.nextLine(); // Read user input string
		System.out.print("Masukan Nilai x :");
		x = masukan.nextInt();
		masukan.nextLine(); // Read user input integer
		System.out.print("Masukan Nilai y :");
		y = masukan.nextInt();
		masukan.nextLine(); // Read user input integer

		jumlah = x + y; // inisialisasi jumlah dengan proses hitung
		kurang = x - y;
		kali = x * y;
		bagi = (double) x / y;
		sisahasilbagi = x % y;

		System.out.println("Mata Pelajaran :" + mapel);
		System.out.println("Hasil Penjumlahan :" + jumlah);
		System.out.println("Hasil Penjumlahan :" + (x + y));
		System.out.println("Hasil Penjumlahan : " + x + " + " + y + " = " + jumlah);
		System.out.println("Hasil Pengurangan :" + kurang);
		System.out.println("Hasil Perkalian :" + kali);
		System.out.println("Hasil Pembagian :" + bagi);
		System.out.println("Hasil Sisa Hasil Bagi :" + sisahasilbagi);

	}
}