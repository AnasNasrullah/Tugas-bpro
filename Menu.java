import java.io.*;

public class Menu
{
	public static void main (String []args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int pil;
		
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
			System.out.println("6.	KELUAR			");
			System.out.println("MASUKKAN NO PILIHAN ANDA (1-6)");
			pil = Integer.parseInt(br.readLine());
			
			switch(pil)
			{
				case 1:
					int harga1 = 0;
					harga1 = 10000;
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("	SOTO AYAM		");
					System.out.println("HARGA :" + harga1);
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					int jmlPesanan1 = Integer.parseInt(br.readLine());
					System.out.println("SUB TOTAL =" + harga1*jmlPesanan1);
					
					break;
					
				case 2:
					int harga2 = 0;
					harga2 = 15000;
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("	NASI RAWON		");
					System.out.println("HARGA : Rp15.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					int jmlPesanan2 = Integer.parseInt(br.readLine());
					System.out.println("SUB TOTAL =" + harga2*jmlPesanan2);
					break;
					
				case 3:
					int harga3 = 0;
					harga3 = 8000;
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("	GADO - GADO		");
					System.out.println("HARGA : Rp8.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					int jmlPesanan3 = Integer.parseInt(br.readLine());
					System.out.println("SUB TOTAL =" + harga3*jmlPesanan3);
					break;
					
				case 4:
					int harga4 = 0;
					harga4 = 2000;
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("		ES TEH		");
					System.out.println("HARGA : Rp2.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					int jmlPesanan4 = Integer.parseInt(br.readLine());
					System.out.println("SUB TOTAL =" + harga4*jmlPesanan4);
					break;
					
				case 5:
					int harga5 = 0;
					harga5 = 3000;
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println("	ES JERUK		");
					System.out.println("HARGA : Rp3.000");
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					int jmlPesanan5 = Integer.parseInt(br.readLine());
					System.out.println("SUB TOTAL =" + harga5*jmlPesanan5);
					break;
					
				case 6:
					System.exit(0);
					break;
			}
		}
		while(true);
	}
}