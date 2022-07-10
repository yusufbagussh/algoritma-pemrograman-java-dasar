import java.util.*;
public class kelulusan{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int nilai=0;
		System.out.println("=====Cek Kelulusan=====");
		System.out.print("Masukkan nilai Anda: ");
		nilai = sc.nextInt();
		if (nilai>=0 && nilai<=100){
			if(nilai<60){
				System.out.println("Jangan Putus Asa dan Tetap Semangat!");
			}else if(nilai>=60 && nilai<=69){
				System.out.println("Anda lulus dengan nilai cukup");
			}else if(nilai>=70 && nilai<=79){
				System.out.println("Anda lulus dengan nilai baik");
			}else if(nilai>=80 && nilai<=100){
				System.out.println("Anda lulus dengan nilai sangat baik");
			}
		}else {System.out.println("Nilai tidak valid!");}
	}
}