import java.util.*;

public class Menu2
{
	public static void main (String []args) 
	{
		Scanner sc=new Scanner(System.in);
		int pil;
		int jmlPesanan1 = 0;
		int jmlPesanan2 = 0;
		int jmlPesanan3 = 0;
		int jmlPesanan4 = 0;
		int jmlPesanan5 = 0;
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
		int totalTransaksi = 0;
		do 
		{
			System.out.println("====================");
			System.out.println("		MENU		");
			System.out.println("====================");
			System.out.println("1.	pilih menu		");
			System.out.println("2.	total harga		");
			System.out.println("3.	keluar			");
		
			System.out.println("MASUKKAN NO PILIHAN ANDA (1-3)");
			pil = sc.nextInt();
			
			switch(pil)
			{
				case 1:
					harga1 = 10000;
					System.out.println("====================");
					System.out.println("		MENU 1		");
					System.out.println("====================");
					System.out.println("	SOTO AYAM		");
					System.out.println("HARGA : Rp10.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan1 = sc.nextInt();
					total1 = harga1*jmlPesanan1;
					
					harga2 = 15000;
					System.out.println("====================");
					System.out.println("		MENU 2		");
					System.out.println("====================");
					System.out.println("	NASI RAWON		");
					System.out.println("HARGA : Rp15.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan2 = sc.nextInt();
					total2 = harga2*jmlPesanan2;
					
					harga3 = 8000;
					System.out.println("====================");
					System.out.println("		MENU 3		");
					System.out.println("====================");
					System.out.println("	GADO - GADO		");
					System.out.println("HARGA : Rp8.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan3 = sc.nextInt();
					total3 = harga3*jmlPesanan3;
					
					harga4 = 2000;
					System.out.println("====================");
					System.out.println("		MENU 4		");
					System.out.println("====================");
					System.out.println("		ES TEH		");
					System.out.println("HARGA : Rp2.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan4 = sc.nextInt();
					total4 = harga4*jmlPesanan4;
					
					harga5 = 3000;
					System.out.println("====================");
					System.out.println("		MENU 5		");
					System.out.println("====================");
					System.out.println("	ES JERUK		");
					System.out.println("HARGA : Rp3.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan5 = sc.nextInt();
					total5 = harga5*jmlPesanan5;
					
					break;
				case 2:
					totalTransaksi = total1+total2+total3+total4+total5;
					System.out.println("SOTO AYAM =" + total1);
					System.out.println("NASI RAWON =" + total2);
					System.out.println("GADO - GADO =" + total3);
					System.out.println("ES TEH =" + total4);
					System.out.println("ES JERUK =" + total5);
					System.out.println("TOTAL TRANSAKSI =" + totalTransaksi);
					break;
					
				case 3:
					System.exit(0);
					break;
			}
		}
		while(true);
	}
}