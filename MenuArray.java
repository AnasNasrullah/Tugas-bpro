import java.io.*;

public class MenuArray
{
	public static void main (String []args) throws IOException 
	{ BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		
		int[] harga =  {15000,15000,8000,2000,3000};
		String[] menu = {"Soto Ayam","Nasi Rawon","Gado-Gado","Es teh","Es Jeruk"};
		int[] total = new int [5];
		int[] jmlPesanan = new int [5];
		int totalTransaksi = 0;
		int pil = 0;
		
		do 
		{
			
			System.out.println("====================");
			System.out.println("	MENU");
			System.out.println("====================");	
	
			for(int a=0; a<5; a++)
				{
					System.out.println((a+1)+ ") " +(menu[a]) + "\t|\t" + "Rp." +harga[a]);
				}
			System.out.println ("6) TOTAL TRANSAKSI");
			System.out.println("====================");	
			System.out.print("MASUKKAN NO PILIHAN ANDA (1-6):");
			pil = Integer.parseInt(br.readLine());
			System.out.println();
			
			
		
				switch(pil)
				{
					case 1:
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println(menu[0]);
					System.out.println("HARGA : Rp" + harga[0]);
					System.out.print("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[0] = Integer.parseInt(br.readLine());
					total[0] = harga[0]*jmlPesanan[0];
					System.out.println("SUB TOTAL =" + total[0]);
					System.out.println();
					
					break;
					
					case 2:
					
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println( menu[1]);
					System.out.println("HARGA : Rp" + harga[1]);
					System.out.print("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[1] = Integer.parseInt(br.readLine());
					total[1] = harga[1]*jmlPesanan[1];
					System.out.println("SUB TOTAL =" + total[1]);
					System.out.println();
					break;
					
				
					
					case 3:
					
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println( menu[2]);
					System.out.println("HARGA : Rp" + harga[2]);
					System.out.print("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[2] = Integer.parseInt(br.readLine());
					total[2] = harga[2]*jmlPesanan[2];
					System.out.println("SUB TOTAL =" + total[2]);
					System.out.println();
					break;
					
				
					case 4:
					
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println( menu[3]);
					System.out.println("HARGA : Rp" + harga[3]);
					System.out.print("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[3] = Integer.parseInt(br.readLine());
					total[3] = harga[3]*jmlPesanan[3];
					System.out.println("SUB TOTAL =" + total[3]);
					System.out.println();
					break;
					
				
					case 5:
				
					System.out.println();
					System.out.println("====================");
					System.out.println("		MENU		");
					System.out.println("====================");
					System.out.println( menu[4]);
					System.out.println("HARGA : Rp" + harga[4]);
					System.out.print("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[4] = Integer.parseInt(br.readLine());
					total[4] = harga[4]*jmlPesanan[4];
					System.out.println("SUB TOTAL =" + total[4]);
					System.out.println();
					break;
				
					case 6:
					System.out.println();
					System.out.println("========================");
					System.out.println("	TOTAL TRANSAKSI		");
					System.out.println("========================");
					System.out.println( menu[0] + "=" + total[0]);
					System.out.println( menu[1] + "=" + total[1]);
					System.out.println( menu[2] + "=" + total[2]);
					System.out.println( menu[3] + "=" + total[3]);
					System.out.println( menu[4] + "=" + total[4]);
					totalTransaksi = total[0]+total[1]+total[2]+total[3]+total[4];
					System.out.println("TOTAL TRANSAKSI =" + totalTransaksi);
					System.out.println();
					break;
					
				default: break;
			}			
		}
		while(pil<6);
	}
}