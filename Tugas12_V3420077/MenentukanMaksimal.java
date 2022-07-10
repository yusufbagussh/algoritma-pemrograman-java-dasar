import java.util.Scanner; //Import the Scanner class

class MenentukanMaksimal {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a scanner

        int a, b, c, maksimum = 1;

        System.out.println("============= Menentukan Bilangan Terbesar =============");
        System.out.print("Masukan Nilai Pertama :");
        a = masukan.nextInt(); // Read user input string
        System.out.print("Masukan Nilai Kedua :");
        b = masukan.nextInt();
        System.out.print("Masukan Nilai Ketiga:");
        c = masukan.nextInt();
        System.out
                .println("Nilai maksimal dari ketiga bilangan tersebut adalah " + BilanganTerbesar(a, b, c, maksimum));
        System.out.println("--------------------------------------------------------");
    }

    public static int BilanganTerbesar(int a, int b, int c, int maksimum) {
        if (a > b & a > c) {
            maksimum = a;
            return a;
        } else if (b > a & b > c) {
            maksimum = b;
            return b;
        } else {
            maksimum = c;
            return c;
        }
    }
}