import java.util.Scanner; //Import the Scanner class

class MenghitungGaji {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner Object
        char pilih;
        double gaji = 0;
        String pajak;

        System.out.println("==== Menentukan Total Gaji ====");
        System.out.println(" Daftar gaji berdasarkan golongan :");
        System.out.println("1. Golongan 1 : 1000000");
        System.out.println("2. Golongan 2 : 2000000");
        System.out.println("3. Golognan 3 : 3000000");
        System.out.print("Masukkan golongan Anda :");
        pilih = masukan.next().charAt(0);
        masukan.nextLine();
        switch (pilih) {
            case '1':
                System.out.println("Golongan 1");
                pajak = "0 %";
                gaji = 1000000;
                System.out.println("Pajak Anda adalah " + pajak);
                break;
            case '2':
                System.out.println("Golongan 2");
                pajak = "0 %";
                gaji = 2000000;
                System.out.println("Pajak Anda adalah " + pajak);
                break;
            case '3':
                System.out.println("Golongan 3");
                pajak = "2 %";
                gaji = 3000000 - 0.02 * 3000000;
                System.out.println("Pajak Anda adalah " + pajak);
                break;
            default:
                System.out.println("Inputan Salah");
        }

        System.out.println("Gaji Anda adalah " + gaji);
    }
}

// suhu = 4/5 * suhuC;
// suhu = 9/5 * suhuC + 32;
// suhu = suhuC + 273;