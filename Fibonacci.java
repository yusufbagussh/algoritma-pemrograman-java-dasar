import java.util.Scanner; //Import the Scanner class

class Fibonacci {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int suku, c, i;
        int a = 1;
        int b = 0;

        System.out.print("Masukkan Banyak Deret : ");
        suku = masukan.nextInt();
        masukan.nextLine();

        for (i = 1; i <= suku; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(" ");
    }
}