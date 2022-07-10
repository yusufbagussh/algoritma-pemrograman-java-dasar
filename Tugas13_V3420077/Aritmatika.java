import java.util.Scanner; //Import the Scanner class

class Aritmatika {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int i = 1, a, b, n, Un = 0, jumlah = 0;

        System.out.print("Masukkan nilai awal: ");
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan nilai beda: ");
        b = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan banyak data: ");
        n = masukan.nextInt();
        masukan.nextLine();

        System.out.println("Jumlah bilangan aritmatika : " + Aritmatika(i, a, b, n, Un, jumlah));
        System.out.println("Jumlah bilangan aritmatika : " + AritmatikaRekursif(a, b, n));
    }

    public static int Aritmatika(int i, int a, int b, int n, int Un, int jumlah) {
        for (i = 1; i <= n; i++) {
            Un = a + (i - 1) * b;
            System.out.println("Suku ke-" + i + " : " + Un);
            jumlah = jumlah + Un;
        }
        return jumlah;
    }

    public static int AritmatikaRekursif(int a, int b, int n) {
        if (n == 0) {
            return 0;
        } else {
            return ((a + (n - 1) * b) + AritmatikaRekursif(a, b, n - 1));
        }
    }
}
