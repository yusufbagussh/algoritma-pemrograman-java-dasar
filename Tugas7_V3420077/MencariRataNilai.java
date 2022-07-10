import java.util.Scanner; //Import the Scanner class

class MencariRataNilai {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        // deklarasi
        double nilaimath, nilaialgo, rata;
        int sksmath = 2;
        int sksalgo = 3;

        // inputan
        System.out.println("===Mencari Rata - Rata Nilai===");
        System.out.print("Masukan nilai math:");
        nilaimath = masukan.nextDouble();
        masukan.nextLine();
        System.out.print("Masukan nilai algo:");
        nilaialgo = masukan.nextDouble();
        masukan.nextLine();

        // Perhitungan
        rata = (nilaimath * sksmath + nilaialgo * sksalgo) / (sksmath + sksalgo);

        // Cetak hasil
        System.out.println("Rata-rata nilai :" + rata);

    }
}