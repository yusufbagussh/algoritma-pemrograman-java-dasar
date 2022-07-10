import java.util.Scanner;

class BiodataDiri {
    static Scanner data = new Scanner(System.in);

    public static void main(String[] abc) {
        String nim;
        String nama;
        int umur;
        Double tinggi;
        char jk;
        Boolean aktif;

        System.out.print("Masukan NIM anda:");
        nim = data.nextLine();
        System.out.print("Masukan Nama Lengkap anda :");
        nama = data.nextLine();
        System.out.print("Masukkan umur anda :");
        umur = data.nextInt();
        data.nextLine();
        System.out.print("Masukkan tinggi badan anda ( dalam meter ) :");
        tinggi = data.nextDouble();
        data.nextLine();
        System.out.print("Masukkan jenis kelamin anda (L/P) :");
        jk = data.next().charAt(0);
        data.nextLine();
        System.out.print("Aktif :");
        aktif = data.nextBoolean();
        data.nextLine();

        System.out.println("NIM :" + nim);
        System.out.println("Nama Lengkap :" + nama);
        System.out.println("Umur :" + umur + " tahun ");
        System.out.println("Tinggi Badan : " + tinggi + " meter ");
        System.out.println("Jenis Kelamin :" + jk);
        System.out.println("Mahasiswa Aktif :" + aktif);

    }
}