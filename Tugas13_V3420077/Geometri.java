import java.util.Scanner; //Import the Scanner class

class Geometri {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in);

        int n, a, r, Un = 0, i = 1;

        System.out.print("Masukkan nilai awal: ");
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan nilai rasio: ");
        r = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan banyak data: ");
        n = masukan.nextInt();
        masukan.nextLine();

        System.out.println("Jumlah bilangan gemometri dari " + n + " data adalah " + Geometri(n, i, a, r, Un));
        System.out.println("Jumlah bilangan gemometri dari " + n + " data adalah " + GeoRekursif(a, r, n));
    }

    public static int Geometri(int n, int i, int a, int r, int Un) {
        int jumlah = 0, rn = 1;
        for (i = 1; i <= n; i++) {
            rn *= r;
            Un = a * rn / r;
            System.out.println("Suku ke-" + i + " : " + Un);
            jumlah = jumlah + Un;
        }
        return jumlah;
    }

    public static double GeoRekursif(double a, double r, double n) {
        double un = 0f;
        if (n == 1) {
            return a;
        } else {
            un = a * Math.pow(r, n - 1);
            return un + GeometriRekursif(a, r, n - 1);
        }
    }

}