import java.io.*;
public class Bonus2{
	public static void main(String []args) throws IOException
	{BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("==============================");
		System.out.println("Bonus pembelian beli 2 dapat 1");
		System.out.println("==============================");
		System.out.println("Harga per 1= Rp25000");
		System.out.println("Masukkan jumlah pembelian");
		int jmlBarang =Integer.parseInt(br.readLine());
		int bonus = jmlBarang/2;
		int jmlPlusBonus = jmlBarang + bonus;
		int hargaPer1 =25000; 
		int jmlHarga = jmlBarang * hargaPer1; 
		System.out.println("");
		System.out.println("==============================");
		System.out.println("mendapatkan bonus =Rp"+ bonus);
		System.out.println("jumlah barang yg dibeli plus Bonus ="+ jmlPlusBonus);
		System.out.println("jumlah Harga barang yang dibeli =Rp"+ jmlHarga);

		
	}
}