import java.util.Scanner;
class cobakasirku {
	public static void main(String[] abc) {
    Scanner data = new Scanner(System.in);
	//Deklarasi
	int i;
	int pcs=0;
	int jml []=new int [20];
	double total=0,kembali,tunai;
	String[] barang={"",
				"Kaos Cotton Combed 30s",
				"Kaos Cotton Combed 24s",
				"Kaos Polo Cotton Pique",
				"PDH/Almet American Drill",
				"Jaket Sport Baby Terry",
				"jersey Printing Milano"};					
	int kode[]={0,1,2,3,4,5,6};
	int harga[]={0,50000,55000,75000,115000,120000,125000};
	
	System.out.println("============= KonveksiKu Production =============");
	System.out.println("Tekan angka nul (0) jika anda ingin berhenti");
	
		for(i=1;i<=6;i++){
		System.out.print(+kode[i]);
		System.out.print("."+barang[i]);
		System.out.print("\t"+"|| Rp "+harga[i]);
		System.out.println ("");
		}		
		int inputkode=1;
		for(i=1;inputkode!=0;i++){
			System.out.print("Kode Produk : ");
			i=data.nextInt();
			inputkode=i;
			if(inputkode==0){
				continue;
				}
			System.out.print("||"+kode[i]);
			System.out.print("||"+barang[i]);
			System.out.println("\t"+"||"+harga[i]);
			System.out.print ("Total pcs ");
			jml[i]=data.nextInt();
			pcs=pcs+jml[i];
			int bayar=harga[i]*jml[i];
			total=total+bayar;
			System.out.print("\t"+"\t"+"\t"+"\t"+"Rp."+bayar+"\n");
			}
		if (inputkode==0){
			System.out.println("Total Pembayaran	Rp "+total);
			System.out.print("Total Tunai	Rp ");
			tunai=data.nextDouble();
			kembali=tunai-total;
			System.out.println("Total Kembali	Rp "+kembali);
			System.out.println("Total Beli produk :"+pcs);
			System.out.println("  ");
			System.out.println("TERIMAKASIH BROO atas Pemesanan Di KonveksiKu");
			}
		System.out.println("Jalan Maju Makmur No 34 Purwokerto || 085872772318");
	
	}//End Method
	public static void DaftarBarang(String[] barang, int[] kode, int[] harga){
		for(int i=1;i<=6;i++){
			System.out.print(+kode[i]);
			System.out.print("."+barang[i]);
			System.out.print("\t"+"|| Rp "+harga[i]);
			System.out.println ("");
			}
	}
}//End Class