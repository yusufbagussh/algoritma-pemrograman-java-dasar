import java.util.*;
public class total_gaji{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;
		int gol_1 = 1000000;
		int gol_2 = 2000000;
		int gol_3 = 3000000;
		System.out.println("=====Golongan Gaji=====");
		System.out.println("Gol 1 : 1000000\nGol 2 : 2000000\nGol 3 : 3000000 (dikenai pajak 2%)");
		System.out.println("==============");
		System.out.print("Gol: ");
		choice = sc.nextInt();
		switch(choice){
			case 1: System.out.printf("Gaji Anda = Rp. %d\n",gol_1);break;
			case 2: System.out.printf("Gaji Anda = Rp. %d\n",gol_2);break;
			case 3:
				gol_3-=gol_3*0.02;
				System.out.printf("Gaji Anda = Rp. %d\n",gol_3);
				break;
			default: System.out.println("Inputan Anda salah");
		}

	}
}