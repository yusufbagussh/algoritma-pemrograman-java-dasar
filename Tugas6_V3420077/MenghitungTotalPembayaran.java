import java.util.Scanner; //Import the Scanner class

class MenghitungTotalPembayaran {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        // deklarasi
        double hargaA, hargaB, jumlahA, diskonA, diskonB, jumlahB, totalharga;
        int b1 = 1000;
        int b2 = 2000;

        // inputan
        System.out.println("Mencari waktu dan jarak dua mobil berpapasan");
        System.out.print("Masukan jumlah barang A:");
        jumlahA = masukan.nextDouble();
        masukan.nextLine();
        System.out.print("Masukan jumlah barang B:");
        jumlahB = masukan.nextDouble();
        masukan.nextLine();

        // Perhitungan
        diskonA = (double) b1 * 10 / 100;
        diskonB = (double) b2 * 5 / 100;
        hargaA = (b1 - diskonA) * jumlahA;
        hargaB = (b2 - diskonB) * jumlahB;
        totalharga = hargaA + hargaB;

        // Cetak hasil
        System.out.println("Total harga barang A :" + hargaA);
        System.out.println("Total harga barang B :" + hargaB);
        System.out.println("Total harga barang A dan B :" + totalharga);

    }
}