import java.util.Scanner; //Import the Scanner class

class ArrayMhsMethod {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        int i, jmlmhs;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jmlmhs = masukan.nextInt();
        masukan.nextLine();
        String[] nim = new String[jmlmhs + 1];
        int[] nilaimtk = new int[jmlmhs + 1];
        int[] nilaialgo = new int[jmlmhs + 1];
        double[] ipk = new double[jmlmhs + 1];

        double totalnilaimtk = 0;
        double ratanilaimtk;
        double totalnilaialgo = 0;
        double ratanilaialgo;
        double totalnilaiipk = 0;
        double ratanilaiipk;

        // Bagian Input
        System.out.println("Input NIM Mahasiswa : ");
        inputnim(nim, jmlmhs);
        System.out.println("Input Nilai Matematika Mahasiswa : ");
        inputnilai(nilaimtk, jmlmhs);
        System.out.println("Input Nilai Algoritma Mahasiswa : ");
        inputnilai(nilaialgo, jmlmhs);

        // Bagian Hitung

        ratanilaimtk = hitungnilairata(nilaimtk, jmlmhs);
        ratanilaialgo = hitungnilairata(nilaialgo, jmlmhs);

        for (i = 1; i <= jmlmhs; i++) {
            ipk[i] = (double) (nilaimtk[i] + nilaialgo[i]) / 2;
        }

        ratanilaiipk = hitungnilairata(ipk, jmlmhs);

        System.out.println("Cetak NIM Mahasiswa : ");
        cetaknim(nim, jmlmhs);
        System.out.println("Cetak Nilai MTK Mahasiswa : ");
        cetaknilai(nilaimtk, jmlmhs);
        System.out.println("Cetak Nilai Algo Mahasiswa : ");
        cetaknilai(nilaialgo, jmlmhs);
        System.out.println("Cetak IP Mahasiswa : ");
        cetaknilai(ipk, jmlmhs);

        System.out.println("Total Nilai MTK Mahasiswa adalah " + totalnilaimtk);
        System.out.println("Rata - Rata Nilai MTK Mahasiswa adalah " + ratanilaimtk);
        System.out.println("Total Nilai Algo Mahasiswa adalah " + totalnilaialgo);
        System.out.println("Rata - Rata Nilai Algo Mahasiswa adalah " + ratanilaialgo);
        for (i = 1; i <= jmlmhs; i++) {
            System.out.println("Nilai IPK Mahasiswa ke-" + i + " adalah : " + ipk[i]);
        }
        System.out.println("Rata nilai IPK mahasiswa adalah : " + ratanilaiipk);
    }

    // Method input nim
    public static void inputnim(String[] nim, int jml)

    {
        Scanner masukan = new Scanner(System.in);
        for (int i = 1; i <= jml; i++) {
            System.out.print("Masukkan NIM ke-" + i + " Mahasiswa : ");
            nim[i] = masukan.nextLine();
        }
    }

    // Method input nilai
    public static void inputnilai(int[] nilai, int jmlmhs) {
        Scanner masukan = new Scanner(System.in);
        for (int i = 1; i <= jmlmhs; i++) {
            System.out.print("Masukkan nilai mhs ke-" + i + " Mahasiswa : ");
            nilai[i] = masukan.nextInt();
            masukan.nextLine();
        }
    }

    // Method Hitung Nilai Rata
    public static double hitungnilairata(int[] nilai, int jmlmhs) {
        double totalnilai = 0;
        for (int i = 1; i <= jmlmhs; i++) {
            totalnilai = totalnilai + nilai[i];
        }
        double ratanilai = totalnilai / jmlmhs;
        return ratanilai;
    }

    // method hitung ratanilai (overiding = nama method sama)
    public static double hitungnilairata(double[] nilai, int jmlmhs) {
        double totalnilai = 0;
        for (int i = 1; i <= jmlmhs; i++) {
            totalnilai = totalnilai + nilai[i];
        }
        double ratanilai = totalnilai / jmlmhs;
        return ratanilai;
    }

    public static void cetaknim(String[] nim, int jmlmhs) {
        for (int i = 1; i <= jmlmhs; i++) {
            System.out.println("NIM ke-" + i + "Mahasiswa adalah : " + nim[i]);
        }
    }

    public static void cetaknilai(int[] nilai, int jmlmhs) {
        for (int i = 1; i <= jmlmhs; i++) {
            System.out.println("Nilai mtk mhs ke-" + i + "Mahasiswa adalah : " + nilai[i]);
        }
    }

    public static void cetaknilai(double[] nilai, int jmlmhs) {
        for (int i = 1; i <= jmlmhs; i++) {
            System.out.println("Nilai mtk mhs ke-" + i + "Mahasiswa adalah : " + nilai[i]);
        }
    }
}
