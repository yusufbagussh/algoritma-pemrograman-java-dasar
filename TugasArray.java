import java.util.Scanner;
public class TugasArray {
    public static void main(String[]args){
        Scanner data = new Scanner (System.in);
		String []barang = {"","Toples", "Piring ", "Sendok ", "Garpu  ", "Gelas  "};
		 int []kode = {0,1, 2, 3, 4, 5};
        int []stok = {0,20, 25, 30, 35, 15};
        int []harga = {0,8000, 9000, 6000, 5000, 7000};
		int harga1=0;
        int i, jumlah;
		
		System.out.println("******************");
        System.out.println("*SELAMAT DATANG*");
		 System.out.println("*TOKO HEMAS*");
        System.out.println("******************");
        System.out.println("\n");
		 System.out.println("Kode"+""+"Barang"+""+"Harga"+""+"Stok");
        System.out.println("-------------------------------------");
		
		 for (i=1;i<barang.length;i++){
            System.out.println(kode[i]+""+barang[i]+""+harga[i]+""+stok[i]);
        }
        System.out.println("-------------------------------------");
		
		int []kuantitas = {0,0,0,0,0,0};
        int []hargatotal = {0,0,0,0,0,0};
        char tambah='y';
		
		do {
            System.out.println(" ");
            System.out.print("Kode barang yang ingin dibeli : ");
            i=data.nextInt(); data.nextLine();
			
			 if (i>=0){
                System.out.print("Banyaknya barang yang ingin dibeli : ");
                jumlah=data.nextInt(); data.nextLine();
                if (jumlah<=stok[i]) {
                    kuantitas[i] =jumlah;
                    stok[i] = stok[i]-jumlah;
					
					harga1=harga[i]*kuantitas[i];
                    hargatotal[i] = hargatotal[i]+harga[i]*kuantitas[i];
                    System.out.println("\n-------------------------------------------");
					 System.out.println("Kode"+""+"Barang"+""+"Jumlah"+""+"Harga Total");
					   System.out.println("-------------------------------------------");
					   System.out.println(kode[i]+""+barang[i]+""+kuantitas[i]+" pcs * "+harga[i]+" Rp."+harga1);
                }
                else {
				  System.out.println("\nMaaf, stok tidak cukup");
                }
                System.out.println(" ");
                System.out.print("Apakah ada tambahan barang lain? (y/t) : ");
				
				tambah=data.next().charAt(0);data.nextLine();
            }
        }
        while(tambah=='y');
		        System.out.println("\n======================== KWITANSI PEMBELIAN ========================");
				
				int totalbayar=0, a;
				
				for (i=1; i<stok.length; i++){
            totalbayar +=hargatotal[i];
        }
    System.out.println("No."+"Kode"+""+"Nama Barang"+""+"Harga Satuan"+""+"Jumlah"+""+"Harga");
	System.out.println("--------------------------------------------------------------------------");
	i=0;
	a=1;
	while(i<barang.length){
            if(kuantitas[i]>0){
                System.out.println((a)+" "+kode[i]+""+barang[i]+" Rp. "+harga[i]+""+kuantitas[i]+" pcs Rp. "+hargatotal[i]);
                a++;
            }
            i++;
        }
		 System.out.println("============= +");
        System.out.println("Total Bayar = Rp. "+totalbayar);
        System.out.println(" ");
        System.out.println("TERIMAKASIH");
        System.out.println("ATAS KUNJUNGAN ANDA");
    }
    
}