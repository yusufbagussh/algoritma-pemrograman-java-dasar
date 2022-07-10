import java.util.Scanner;
class diskonbelanja{
	static Scanner data = new Scanner (System.in);
	public static void main(String[]abc){
		Scanner masukan = new Scanner(System.in);
		
		System.out.println("---Mencari Total Belanja---");
		System.out.println("                            ");
		
		//bagian deklarasi
		double h_belanja, diskon, total_belanja;
		String Rp;
		
		//bagian input
		System.out.print("Masukkan Total Belanja :");
		h_belanja = data.nextDouble();data.nextLine();
		
		//bagian hitung
		if(h_belanja>=100000)
		{diskon=0.1;}else
		if(h_belanja>=50000)
		{diskon=0.05;}else
		{diskon=0;}
	
		//total belanja
		total_belanja=h_belanja-h_belanja*diskon;
		
		//bagian cetak
		System.out.println("Total diskon: " +diskon);
		System.out.println("Total Belanja: Rp" +total_belanja);
	}
}