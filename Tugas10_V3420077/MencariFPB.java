import java.util.Scanner; //Import the Scanner class

class MencariFPB {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);
        int a, b, d;

        System.out.print("Masukan bilangan bulat pertama : ");// Badan Perulangan
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan bilangan bulat kedua : ");// Badan Perulangan
        b = masukan.nextInt();
        masukan.nextLine();

        d = a % b;
        int bil1 = a, bil2 = b;
        while (d != 0) {
            a = b;
            b = d;
            d = a % b;
        }

        System.out.print("FPB dari " + bil1 + " dan " + bil2 + " adalah " + b);

    }
}