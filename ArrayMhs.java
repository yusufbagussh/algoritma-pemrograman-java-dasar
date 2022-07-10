import java.util.Scanner; //Import the Scanner class

class ArrayMhs {
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
        for (i = 1; i <= jmlmhs; i++) {
            System.out.print("Masukkan NIM ke-" + i + " Mahasiswa : ");
            nim[i] = masukan.nextLine();
        }
        for (i = 1; i <= jmlmhs; i++) {
            System.out.print("Masukkan nilai mtk mhs ke-" + i + " Mahasiswa : ");
            nilaimtk[i] = masukan.nextInt();
            masukan.nextLine();
        }
        for (i = 1; i <= jmlmhs; i++) {
            System.out.print("Masukkan nilai algo mhs ke-" + i + " Mahasiswa : ");
            nilaialgo[i] = masukan.nextInt();
            masukan.nextLine();
        }
        double totalnilaimtk = 0;
        double ratanilaimtk;
        double totalnilaialgo = 0;
        double ratanilaialgo;
        for (i = 1; i <= jmlmhs; i++) {
            totalnilaimtk = totalnilaimtk + nilaimtk[i];
            totalnilaialgo = totalnilaialgo + nilaialgo[i];
        }
        ratanilaimtk = totalnilaimtk / jmlmhs;
        ratanilaialgo = totalnilaialgo / jmlmhs;

        for (i = 1; i <= jmlmhs; i++) {
            ipk[i] = (double) (nilaimtk[i] + nilaialgo[i]) / 2;
        }

        double totalnilaiipk = 0;
        double ratanilaiipk;
        for (i = 1; i <= jmlmhs; i++) {
            totalnilaiipk = totalnilaiipk + ipk[i];
        }
        ratanilaiipk = totalnilaiipk / jmlmhs;

        for (i = 1; i <= jmlmhs; i++) {
            System.out.println("NIM ke-" + i + "Mahasiswa adalah : " + nim[i]);
        }
        for (i = 1; i <= jmlmhs; i++) {
            System.out.println("Nilai mtk mhs ke-" + i + "Mahasiswa adalah : " + nim[i]);
        }
        for (i = 1; i <= jmlmhs; i++) {
            System.out.println("Nilai algo mhs ke-" + i + "Mahasiswa adalah : " + nim[i]);
        }
        System.out.println("Total Nilai MTK Mahasiswa adalah " + totalnilaimtk);
        System.out.println("Rata - Rata Nilai MTK Mahasiswa adalah " + ratanilaimtk);
        System.out.println("Total Nilai Algo Mahasiswa adalah " + totalnilaialgo);
        System.out.println("Rata - Rata Nilai Algo Mahasiswa adalah " + ratanilaialgo);
        for (i = 1; i <= jmlmhs; i++) {
            System.out.println("Nilai IPK Mahasiswa ke-" + i + " adalah : " + ipk[i]);
        }
        System.out.println("Rata nilai IPK mahasiswa adalah : " + ratanilaiipk);
    }
}