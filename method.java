import java.util.Scanner; //Import the Scanner class

class method {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); // Create a scanner
        // Bagian Deklarasi
        String nama;
        int umur;
        // Bagian Input
        System.out.print("Inputkan Nama Anda :");
        nama = masukan.nextLine(); // read user input
        System.out.print("Inputkan Umur Anda :");
        umur = masukan.nextInt();
        masukan.nextLine();
        // bagian hitung
        garis();
        CetakID(nama, umur);
        System.out.println("Anda pensiun setelah :" + HitungPensiun(umur) + "tahun ");
        int menujupensiun = HitungPensiun(umur);
        System.out.println("Anda pensiun setelah :" + menujupensiun + "tahun ");
        HitungPensiun2(umur);
    }// End Main

    public static int HitungPensiun(int usia) { // Method dengan paramater dan return int
        int pensiun = 67 - usia;
        return pensiun;
    }

    public static void HitungPensiun2(int usia) { // Method dengan paramater dan return int
        int pensiun = 67 - usia;
        System.out.println("Anda pensiun setelah :" + pensiun + "tahun ");
    }

    public static void CetakID(String nama, int usia) { // Method dengan paramater dan void (tanpa return)
        System.out.println("Nama Anda : " + nama);
        System.out.println("Nama Anda : " + usia);
        garis();
    }

    public static void garis() { // method tanpa var (tanpa parameter) dan void (tanpa return)
        System.out.println("--------------------------");
        // end method garis
    }
}