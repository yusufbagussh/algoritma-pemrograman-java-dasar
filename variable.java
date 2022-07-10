class variable {
	public static void main(String[] abc) {
		int x = 2; // deklarasi sekaligus inisialisasi
					// tipe, variable, dan value
		int y = 3;
		int jumlah, kurang, kali; // deklarasi saja (tipe bil bulat)
		double bagi; // deklarasitipe bilangan desimal
		String mapel = "Matematika";
		jumlah = x + y; // inisialisasi jumlah dengan proses hitung
		kurang = x - y;
		kali = x * y;
		bagi = (double) x / y;
		System.out.println("Mata Pelajaran :" + mapel);
		System.out.println("Hasil Penjumlahan :" + jumlah);
		System.out.println("Hasil Penjumlahan :" + (x + y));
		System.out.println("Hasil Penjumlahan : " + x + " + " + y + " = " + jumlah);
		System.out.println("Hasil Pengurangan :" + kurang);
		System.out.println("Hasil Perkalian :" + kali);
		System.out.println("Hasil Pembagian :" + bagi);
	}
}