import java.util.Scanner; //Import the Scanner class

class MencariKPK {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);
        int a, b, c = 0, i;

        System.out.print("Masukan bilangan bulat pertama : ");// Badan Perulangan
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukan bilangan bulat kedua : ");// Badan Perulangan
        b = masukan.nextInt();
        masukan.nextLine();

        for (i = 1; i <= b; i++) {
            c = c + a;
            if (c % b == 0) {
                System.out.println("KPK dari " + a + " dan " + b + " adalah " + c);
            }
        }

    }
}