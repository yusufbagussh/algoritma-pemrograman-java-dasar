import java.util.Scanner; //Import the Scanner class

class MencariFPB {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);
        int a, b, c = 0, i, d;

        System.out.print("Masukan bilangan bulat pertama : ");// Badan Perulangan
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan bilangan bulat kedua : ");// Badan Perulangan
        b = masukan.nextInt();
        masukan.nextLine();

        d = a % b;
        while (d != 0) {
            a = b;
            b = d;
            d = a % b;
        }

        System.out.print("FPB dari " + a + " dan " + b + " adalah " + b);

    }
}