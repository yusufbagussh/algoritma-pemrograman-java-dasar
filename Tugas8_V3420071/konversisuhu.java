import java.util.Scanner;
class konversisuhu{
	static Scanner data = new Scanner (System.in);
	public static void main(String[]abc){
		Scanner masukan = new Scanner(System.in);
		
		System.out.println("---Mencari Konversi Suhu---");
		System.out.println("                            ");
		
		//bagian deklarasi
		char pilih;
		double suhucelcius, suhuhasil;
		String suhupilihan;
		
		//bagianinput
		System.out.print("Masukkan Suhu Celcius :");
		suhucelcius=data.nextDouble();data.nextLine();
		System.out.println("Konversi suhu dari Celcius ke:");
		System.out.println("1. Reamur");
		System.out.println("2. Fahrenheit");
		System.out.println("3. Kelvin");
		System.out.print("Masukkan Pilihan Anda :");
		pilih=data.next().charAt(0);data.nextLine();
		switch(pilih)
		{
			case '1':
				System.out.println("Pilih Reamur");
				suhuhasil=(double)4/5*suhucelcius;
				suhupilihan= "Reamur";
				System.out.println("Konversi "+ suhucelcius +" celcius adalah " + suhuhasil + suhupilihan);
				break;
			case '2':
				System.out.println("Pilih Fahrenheit");
				suhuhasil=(double)9/5*suhucelcius+32;
				suhupilihan= "Fahrenheit";
				System.out.println("Konversi "+ suhucelcius +" celcius adalah " + suhuhasil + suhupilihan);
				break;
			case '3':
				System.out.println("Pilih Kelvin");
				suhuhasil=(double)suhucelcius+275.15;
				suhupilihan= "Kelvin";
				System.out.println("Konversi "+ suhucelcius +" celcius adalah " + suhuhasil + suhupilihan);	
				break;
			default:
				System.out.println("Masukkan salah");
				break;	
							
		}
	}
}