import java.util.*;

public class Menu3
{
	public static void main (String []args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean Selesai = false;
		int pil;
		int harga1 = 0;
		int harga2 = 0;
		int harga3 = 0;
		int harga4 = 0;
		int harga5 = 0;
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		int total5 = 0;
		int jmlPesanan1 = 0;
		int jmlPesanan2 = 0;
		int jmlPesanan3 = 0;
		int jmlPesanan4 = 0;
		int jmlPesanan5 = 0;
		int totalTransaksi = 0;
		do 
		{
			System.out.println("====================");
			System.out.println("		MENU		");
			System.out.println("====================");
			System.out.println("1.	SOTO AYAM		");
			System.out.println("2.	NASI RAWON		");
			System.out.println("3.	GADO-GADO		");
			System.out.println("4.	ES TEH			");
			System.out.println("5.	ES JERUK		");
			System.out.println("6.	TOTAL TRANSAKSI	");
			System.out.println("MASUKKAN NO PILIHAN ANDA (1-6)");
			System.out.println();
			pil = sc.nextInt();
			
		
				if(pil ==1)
				{
					
					harga1 = 10000;
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("	SOTO AYAM		");
					System.out.println("HARGA :" + harga1);
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan1 = sc.nextInt();
					total1 = harga1*jmlPesanan1;
					System.out.println("SUB TOTAL =" + total1);
					System.out.println();
					
				}	
					
				if(pil ==2)
				{
					
					harga2 = 15000;
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("	NASI RAWON		");
					System.out.println("HARGA : Rp15.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan2 = sc.nextInt();
					total2 = harga2*jmlPesanan2;
					System.out.println("SUB TOTAL =" + total2);
					System.out.println();
				}
					
				if(pil ==3)
				{
					
					harga3 = 8000;
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("	GADO - GADO		");
					System.out.println("HARGA : Rp8.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan3 = sc.nextInt();
					total3 = harga3*jmlPesanan3;
					System.out.println("SUB TOTAL =" + total3);
					System.out.println();
				}
					
				if(pil ==4)
				{
					
					harga4 = 2000;
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("		ES TEH		");
					System.out.println("HARGA : Rp2.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan4 = sc.nextInt();
					total4 = harga4*jmlPesanan4;
					System.out.println("SUB TOTAL =" + total4);
					System.out.println();
				}
					
				if(pil ==5)
				{
					
					harga5 = 3000;
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("	ES JERUK		");
					System.out.println("HARGA : Rp3.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan5 = sc.nextInt();
					total5 = harga5*jmlPesanan5;
					System.out.println("SUB TOTAL =" + total5);
					System.out.println();
				}
				
				if(pil ==6)
				{
					System.out.println();
					System.out.println("========================");
					System.out.println("	TOTAL TRANSAKSI		");
					System.out.println("========================");
					totalTransaksi = total1+total2+total3+total4+total5;
					System.out.println("SOTO AYAM =" + total1);
					System.out.println("NASI RAWON =" + total2);
					System.out.println("GADO - GADO =" + total3);
					System.out.println("ES TEH =" + total4);
					System.out.println("ES JERUK =" + total5);
					System.out.println("TOTAL TRANSAKSI =" + totalTransaksi);
					System.out.println();
					Selesai = true;
				}
					
		}
		while(!Selesai);
	}
}