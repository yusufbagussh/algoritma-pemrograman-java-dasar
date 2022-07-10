import java.util.Scanner; 
class persamaan_kuadrat {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);

		int a, b, c;
		double diskriminan, x1,x2;
		
		System.out.println("---Persamaan Kuadrat---");
		System.out.println("                   ");
		System.out.println("Pers. kuadrat ax^2+bx+c");
		System.out.print("Masukkan nilai a: ");
			a = data.nextInt();
		System.out.print("Masukkan nilai b: ");
			b = data.nextInt();
		System.out.print("Masukkan nilai c: ");
			c = data.nextInt();	
		
		// perhitungan diskriminan
		diskriminan=b*b-(4*a*c);
		System.out.println("diskriminan=" +diskriminan);
		
		System.out.println("                    ");
		
		//Mengerjakan soal A&B&C
		if (diskriminan>0){
			System.out.println("Akar-akarnya merupakan akar nyata");
			x1= (-b + Math.sqrt (diskriminan))/ 2*a;
			x2= (-b - Math.sqrt (diskriminan))/ 2*a;
			System.out.println("Nilai x1=" +x1);
			System.out.println("Nilai x2=" +x2);
		}else
		if (diskriminan==0){
			System.out.println("Akar-akarnya merupakan akar kembar");
			x1= (-b + Math.sqrt (diskriminan))/ 2*a;
			x2= (-b - Math.sqrt (diskriminan))/ 2*a;
			System.out.println("Nilai x1=" +x1);
			System.out.println("Nilai x2=" +x2);
		}else	
		if (diskriminan<0){
			System.out.println("Akar-akarnya merupakan akar khayal");
			if (a<0)
				{System.out.println("Termasuk persamaan kuadrat definit negatif");} else
			if (a>0)
				{System.out.println("Termasuk persamaan kuadrat definit positif");}
		}			
		
	}
}