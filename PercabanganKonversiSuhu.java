import java.util.Scanner; //Import the Scanner class

class PercabanganKonversiSuhu {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        char pilih;
        Double suhu, celsius;
        String suhupilihan;

        System.out.println("==== Konversi Suhu ====");
        System.out.print("Masukan suhu celsius :");
        celsius = masukan.nextDouble();
        masukan.nextLine();
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit ");
        System.out.println("3. Kelvin");
        System.out.print("Konversi ke pilihan :");
        pilih = masukan.next().charAt(0);
        masukan.nextLine();
        switch (pilih) {
            case '1':
                System.out.println("Konversi ke Reamur");
                suhu = (double) 4 / 5 * celsius;
                suhupilihan = "Reamur";
                break;
            case '2':
                System.out.println("Konversi ke Farenheit");
                suhu = (double) 9 / 5 * celsius + 32;
                suhupilihan = "Fahrenheit";
                break;
            case '3':
                System.out.println("Konversi ke Kelvin");
                suhu = celsius + 273;
                suhupilihan = "Kelvin";
                break;
            default:
                System.out.println("Tidak Memilih");
                suhu = celsius;
                suhupilihan = "Celcius";
                break;
        }

        System.out.println("konversi " + celsius + " derajat celsius adalah " + suhu + " derajat " + suhupilihan);

    }
}

// suhu = 4/5 * suhuC;
// suhu = 9/5 * suhuC + 32;
// suhu = suhuC + 273;