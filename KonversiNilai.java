import java.util.Scanner; //Import the Scanner class

import javax.lang.model.util.ElementScanner6;

class KonversiNilai {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int nilai;
        String statuslulus, validnilai, konversi;

        System.out.print("Masukan nilai :");
        nilai = masukan.nextInt();
        masukan.nextLine();

        if (nilai <= 100 & nilai >= 0) {
            validnilai = "Nilai Valid";
            statuslulus = " Lulus ";
        } else {
            validnilai = "Nilai Tidak Valid";
        }

        if (nilai < 60) {
            statuslulus = "Tidak Lulus";
        } else {
            if (nilai >= 80 & nilai <= 100) {
                statuslulus = "Lulus";
                konversi = "sangat baik";
                System.out.println("Kevalidan Nilai adalah :" + validnilai);
                System.out.println("Kriteria Nilai :" + konversi);
            } else if (nilai >= 70 & nilai <= 79) {
                statuslulus = "Lulus";
                konversi = "baik";
                System.out.println("Kevalidan Nilai adalah :" + validnilai);
                System.out.println("Kriteria Nilai :" + konversi);
            } else {
                statuslulus = "Lulus";
                konversi = "cukup";
                System.out.println("Kevalidan Nilai adalah :" + validnilai);
                System.out.println("Kriteria Nilai :" + konversi);
            }
        }

        System.out.println("Status Kelulusan adalah :" + statuslulus);

    }
}