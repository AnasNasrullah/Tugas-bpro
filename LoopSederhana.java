import java.util.*;
public class LoopSederhana
{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Masukkan niali awal =");
		int NilaiAwal = sc.nextInt();
		System.out.println("Masukkan niali akhir =");
		int NilaiAkhir = sc.nextInt();
		System.out.println("========================");
		
		while (NilaiAwal<=NilaiAkhir)
		{
			System.out.println(NilaiAwal);
			NilaiAwal++;
			
		}
			
		//System.out.println("=========================================");
		//System.out.println("Masukkan niali akhir =");
		//int Awal = sc.nextInt();
		//System.out.println("Masukkan niali awal =");
		//int Akhir = sc.nextInt();
		//System.out.println("========================");
		
		//while (Awal>=Akhir)
		//{
			//System.out.println(Awal);
			//Awal--;			
		//}

	}
}