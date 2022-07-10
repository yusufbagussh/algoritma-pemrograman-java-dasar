import java.util.Scanner; //Import the Scanner class

class Fibonacci {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int suku, c = 0, a = 1, b = 0;

        System.out.print("Masukkan Banyak Deret : ");
        suku = masukan.nextInt();
        masukan.nextLine();

        for (int i = 1; i <= suku; i++) {
            System.out.print(fibonaccirekursif(i) + " ");
        }
        System.out.println("");
        fibonacci(a, b, c, suku);
    }

    public static int fibonacci(int a, int b, int c, int suku) {
        for (int i = 1; i <= suku; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        return c;
    }

    public static int fibonaccirekursif(int x) {
        if (x <= 0 || x <= 1) {
            return x;
        } else {
            return fibonaccirekursif(x - 2) + fibonaccirekursif(x - 1);
        }
    }
}