import java.util.Scanner; // Import the Scanner Class
class UAS {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
	//deklarasi 
	int jmlbrg=0, i=0;
	double  kembalian=0, bayar=0, jumlah=0;
	
	System.out.println("=============Selamat Datang di Toko Luwes=============");
	System.out.println("Kode barang		Menu\n" 
						+ "   1 			Minipao\n"
						+"   2 			Nugget\n"
						+"   3 			Tempura\n"
						+"   4 			Scallop \n"
						+"   5 			Saus\n"
						+"   6 			Sosis\n");	
	System.out.println(" ");
	System.out.print("Masukkan Jumlah Barang yang ingin dibeli : ");
	jmlbrg= data.nextInt();data.nextLine();
	
	int [] kode = new int [100];
	int [] brg = new int [100];
	int [] harga = new int [100];
	double [] total = new double [100];
	String [] nama = new String[100];
	inputkode(kode,brg,harga,nama,jmlbrg);
	kwitansi(jmlbrg,total,brg,harga,nama,jumlah,kembalian,bayar);
	
	}//end main
	public static void inputkode(int [] kode, int [] brg, int [] harga, String [] nama, int jmlbrg)
	{
		Scanner data = new Scanner(System.in);
		for (int i=1; i<=jmlbrg; i++)
		{
	    System.out.print("Masukkan kode barang ke-" + i + " : ");
        kode[i] = data.nextInt(); data.nextLine();
		System.out.print("Masukkan jumlah barang ke-" + i + " : ");
        brg[i] = data.nextInt(); data.nextLine();
		
			switch (kode[i])
			{
			case 1 : 
				nama[i]="Minipao";
				harga[i] = 23000;
				break;
			case 2 :
				nama[i] = "Nugget ";
				harga[i] = 18000;
				break;	
			case 3 :
				nama[i] ="Tempura";
				harga[i] = 15000;
				break;
			case 4 :
				nama[i]="Scallop";
				harga[i] = 18000;
				break;
			case 5 :
				nama[i]="Saus    ";
				harga[i] = 19000;
				break;
			case 6 :
				nama[i]="Sosis  ";
				harga[i] = 20000;
				break;	
			default:
				System.out.println("Kode Barang Tidak Tersedia");
			}
		}
	}
	public static void kwitansi(int jmlbrg, double [] total, int [] brg, int [] harga, String [] nama, double jumlah, double kembalian, double bayar)
	{
	Scanner data = new Scanner(System.in);
	
		System.out.println("  \n"+" ");
		System.out.println("=============KWITANSI PEMBAYARAN=============");
		System.out.println("Kode "+"|"+" Nama Produk  "+"|"+" Jumlah "+"|"+ " Total "); 
		System.out.println("----------------------------------------------  ");
	
		for (int i=1; i<=jmlbrg; i++)
		{
				total[i]= (double) brg[i]*harga[i];	
				jumlah=jumlah+total[i];
				System.out.println (" "+i+"   "+"|   "+ nama[i]+"    "+"|   "+ brg[i]+ "    "+"|" +" Rp "+total[i]);
		}
				System.out.println ("                             "+"-------------");		
				System.out.println ("                               "+"Rp "+jumlah);
		//perhitungan kembalian
		System.out.print("Uang Pembayaran : Rp ");
		bayar= data.nextDouble(); data.nextLine();
		kembalian=bayar-jumlah;
		System.out.println("Uang Kembalian  : "+"Rp "+kembalian);
	}	
}