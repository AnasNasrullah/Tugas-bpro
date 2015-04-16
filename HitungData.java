import java.util.*;
public class HitungData
{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
		
		System.out.print("masukan jumlah data =");
		
		int Data = 0;
		int JumlahData = sc.nextInt();
		int i = 1;
		int totalData = 0;
		int max = 0;
		
		System.out.println("=====================");
		while (i<=JumlahData)
		{
			System.out.print("Masukkan nilai Data ke"+ i + ":");
			Data = sc.nextInt();
			totalData += Data;
			
			if(Data>max)
			  max = Data;
			
			i++;
		}
		System.out.println("=====================");

		int rataRata = totalData/Data;
		System.out.println("Nilai Max Dari Data=" + max);
		System.out.println();
		System.out.println("Total Nilai Data=" + totalData);
		System.out.println("Rata-rata Nilai Data=" + rataRata);
	
	}
}