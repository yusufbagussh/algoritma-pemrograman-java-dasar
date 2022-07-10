import java.util.Scanner; //Import the Scanner class

class JenisSegitiga {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a scanner

        int s1, s2, s3;
        String segitiga = "";

        System.out.println("====== Menentukan Jenis Segitiga =====");
        System.out.print("Masukan Sisi Pertama :");
        s1 = masukan.nextInt(); // Read user input string
        System.out.print("Masukan Sisi Kedua :");
        s2 = masukan.nextInt();
        System.out.print("Masukan Sisi Ketiga:");
        s3 = masukan.nextInt();
        System.out.println("Jenis : Segitiga " + JenisSegitiga(s1, s2, s3, segitiga));
        System.out.println("--------------------------------------");
    }

    public static String JenisSegitiga(int s1, int s2, int s3, String segitiga) {
        // int
        if (s1 == s2 && s2 == s3 && s1 == s3) {
            segitiga = "Samasisi";
            return segitiga;
        } else if (s1 == s2 && s2 != s3 || s2 == s3 && s1 != s3 || s1 == s3 && s1 != s2) {
            segitiga = "Samakaki";
            return segitiga;
        } else {
            segitiga = "Sembarang";
            return segitiga;
        }

    }
}