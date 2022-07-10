import java.util.Scanner; //Import the Scanner class

class PercabanganBilanganTerbesar {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        int a, b, c, maksimum; // deklarasitipe bilangan desimal

        System.out.print("Masukan Nilai Pertama :");
        a = masukan.nextInt(); // Read user input string
        System.out.print("Masukan Nilai Kedua :");
        b = masukan.nextInt();
        System.out.print("Masukan Nilai Ketiga:");
        c = masukan.nextInt();

        if (a > b & a > c) {
            maksimum = a;
        } else if (b > a & b > c) {
            maksimum = b;
        } else {
            maksimum = c;
        }
        System.out.println("Nilai maksimal :" + maksimum);

    }
}