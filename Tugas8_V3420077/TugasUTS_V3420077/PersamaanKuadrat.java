import java.util.Scanner;

public class PersamaanKuadrat {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        int a, b, c;
        double D, x1, x2;

        System.out.print("Masukkan Nilai a : ");
        a = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan Nilai b : ");
        b = masukan.nextInt();
        masukan.nextLine();
        System.out.print("Masukkan Nilai c : ");
        c = masukan.nextInt();
        masukan.nextLine();

        System.out.println("Persamaan Kuadrat yang Terbentuk : ");
        System.out.print(a + "x^2 ");
        if (b < 0) {
            System.out.print("- " + (-b) + "x ");
        } else if (b > 0) {
            System.out.print("+ " + b + "x ");
        } else {
            System.out.print(" = 0");
        }

        if (c < 0) {
            System.out.print("- " + (-c) + " = 0 ");
        } else if (c > 0) {
            System.out.print("+ " + c + " = 0 ");
        } else {
            System.out.print(" = 0");
        }

        D = b * b - (4 * a * c);

        System.out.println("Nilai Determinan : " + D);

        if (D < 0) {
            System.out.println("Akar - akar persamaan tersebut adalah imajiner atau khayal ");
            if (a < 0) {
                System.out.println("Termasuk definit negatif");
            } else {
                System.out.println("Termasuk definit postif");
            }
        } else if (D == 0) {
            System.out.println("Akar - akar persamaan tersebut adalah sama atau kembar");
        } else {
            System.out.println("Akar - akar persamaan tersebut adalah nyata ");
        }

        if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Persamaan tersebut memiliki akar persamaan x1 =" + x1 + " dan x2 =" + x1);
        } else if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("Persamaan tersebut memiliki akar persamaan x1 = " + x1 + " dan x2 = " + x2);
        } else {
            System.out.println("x1 = x2 = -");
        }

        // {
        // System.out.println("Persamaan tersebut memiliki akar persamaan x1 = x2 =" +
        // x1 );}
        // else{x1=(-b + Math.sqrt(D)) / 2*a;
        // x2=(-b - Math.sqrt(D)) / 2*a;}{
        // System.out.println("Persamaan tersebut memiliki akar persamaan x1 = " + x1 +
        // " dan x2 = " +x2 );}

        //
        // if (bil < 0) {
        // System.out.print("Bilangan " + bil + " merupakan nilai negatif.");
        // } else if (bil % 2 == 0) {
        // System.out.print("Bilangan " + bil + " adalah genap.");
        // } else {
        // System.out.print("Bilangan " + bil + " adalah ganjil.");
        // }
    }
}