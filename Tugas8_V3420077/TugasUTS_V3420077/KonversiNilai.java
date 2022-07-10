import java.util.Scanner; //Import the Scanner class

import javax.lang.model.util.ElementScanner6;

class KonversiNilai {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int nilai;
        String statuslulus, validnilai, kriteria;

        System.out.print("Masukan nilai :");
        nilai = masukan.nextInt();
        masukan.nextLine();

        System.out.println("Nilai Anda adalah :" + nilai);

        if (nilai < 0 | nilai > 100) {
            validnilai = "Nilai Tidak Valid";
            System.out.println("Kevalidan Nilai :" + validnilai);
        } else {
            validnilai = "Nilai Valid";
            System.out.println("Kevalidan Nilai :" + validnilai);
        }

        if (nilai < 60) {
            statuslulus = "Tidak Lulus";
        } else {
            if (nilai >= 80 & nilai <= 100) {
                statuslulus = "Lulus";
                kriteria = "sangat baik";
                System.out.println("Kriteria Nilai :" + kriteria);

            } else if (nilai >= 70 & nilai <= 79) {
                statuslulus = "Lulus";
                kriteria = "baik";
                System.out.println("Kriteria Nilai :" + kriteria);
            } else {
                statuslulus = "Lulus";
                kriteria = "cukup";
                System.out.println("Kriteria Nilai :" + kriteria);
            }
        }

        System.out.println("Status Kelulusan adalah :" + statuslulus);

    }
}