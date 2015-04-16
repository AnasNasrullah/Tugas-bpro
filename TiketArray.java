import java.io.*;

public class TiketArray
{
	public static void main (String []args) throws IOException 
	{ BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int[] harga =  {100000,150000,225000,393750};
		String[] kelas = {"EKONOMI ","BISNIS","EKSEKUTIF","V I P"};
		int[] kursi =  {15,12,12,8};
		int [] jmlPesanan = new int [4];
		int[] total = new int [4];
		int totalOmset = 0;
		int pil = 0;
		
		do 
		{
			System.out.println("===========================================");
			System.out.println("  program penjualan tiket pesawat terbang  ");
			System.out.println("===========================================");
			System.out.println("1.	penjualan tiket					");
			System.out.println("2.	view daftar kursi yang kosong	");
			System.out.println("3.	view daftar kursi yang terisi	");
			System.out.println("4.	view semua daftar kursi			");
			System.out.println("5.	view omset						");
			System.out.print("MASUKKAN NO PILIHAN ANDA (1-5):");
			pil = Integer.parseInt(br.readLine());
			System.out.println();
		
				switch(pil)
				{
					case 1:
						System.out.println("===============");
						System.out.println("penjualan tiket");
						System.out.println("===============");
						System.out.println();
						
						do{	
							System.out.println("No) kelas\t| harga\t\t\t| kursi");
							System.out.println("----------------------------------------------------------");	
						
							for(int a=0; a<4; a++)
								{
									System.out.println((a+1)+ ") " +(kelas[a]) + "\t|\t" + "Rp." +harga[a] + "\t|\t" + kursi[a]);
								}
							System.out.println("-----------------------------------------------------------");
							System.out.println("5) Keluar");
							System.out.print("Pilih pesanan anda:");
							pil = Integer.parseInt(br.readLine());
							System.out.println();
						
							
							if(pil ==1)
							{
								System.out.print("MASUKKAN JUMLAH PESANAN:");
								jmlPesanan[0] = Integer.parseInt(br.readLine());
								if (jmlPesanan[0]<=15)
								{
									total[0] = harga[0]*jmlPesanan[0];
									System.out.println("SUB TOTAL =" + total[0]);
								}
								else
								{
									System.out.println("kursi yang tersedia hanya 15");
								}
							}
							
							if(pil ==2)
							{
								System.out.print("MASUKKAN JUMLAH PESANAN:");
								jmlPesanan[1] = Integer.parseInt(br.readLine());
								if (jmlPesanan[1]<=12)
								{
									total[1] = harga[1]*jmlPesanan[1];
									System.out.println("SUB TOTAL =" + total[1]);
								}
								else
								{
									System.out.println("kursi yang tersedia hanya 12");
								}
								
							}
							
							if(pil ==3)
							{
								System.out.print("MASUKKAN JUMLAH PESANAN:");
								jmlPesanan[2] = Integer.parseInt(br.readLine());
								if (jmlPesanan[2]<=12)
								{
									total[2] = harga[2]*jmlPesanan[2];
									System.out.println("SUB TOTAL =" + total[2]);
								}
								else
								{
									System.out.println("kursi yang tersedia hanya 12");
								}
							
							}
							
							if(pil ==4)
							{
								System.out.print("MASUKKAN JUMLAH PESANAN:");
								jmlPesanan[3] = Integer.parseInt(br.readLine());
								if (jmlPesanan[3]<=8)
								{
									total[3] = harga[3]*jmlPesanan[3];
									System.out.println("SUB TOTAL =" + total[3]);
								}
								else
								{
									System.out.println("kursi yang tersedia hanya 8");
								}
								
							}
					
						}while(pil<4);
					
					System.out.println();
					break;
				
					case 2:
					System.out.println();
					System.out.println("=============================");
					System.out.println("view daftar kursi yang kosong");
					System.out.println("=============================");
					System.out.println();
					
					System.out.println(kelas[0]);
					System.out.println("-------");
						if (jmlPesanan[0] == 15)
						{
							System.out.println("kelas ekonomi penuh");
						}
						else 
						{
							System.out.println("kursi yang kosong = " + (kursi[0]-jmlPesanan[0]));
						}
					System.out.println();
					
					System.out.println(kelas[1]);
					System.out.println("-------");
						if (jmlPesanan[1]==12)
						{
							System.out.println("kelas bisnis penuh");
						}
						else 
						{
							System.out.println("kursi yang kosong = " + (kursi[1]-jmlPesanan[1]));
						}
					System.out.println();
					
					System.out.println(kelas[2]);
					System.out.println("-------");
						if (jmlPesanan[2]==12)
						{
							System.out.println("kelas eksekutif penuh");
						}
						else 
						{
							System.out.println("kursi yang kosong = " + (kursi[2]-jmlPesanan[2]));
						}
					System.out.println();
					
					System.out.println(kelas[3]);
					System.out.println("-------");
						if (jmlPesanan[3]==8)
						{
							System.out.println("kelas vip penuh");
						}
						else 
						{
							System.out.println("kursi yang kosong = " + (kursi[3]-jmlPesanan[3]));
						}
					System.out.println();
					break;
					
					case 3:
					System.out.println();
					System.out.println("=============================");
					System.out.println("view daftar kursi yang terisi");
					System.out.println("=============================");
					System.out.println();
					
					System.out.println(kelas[0]);
					System.out.println("-------");
					System.out.println("kursi yang terisi = " + jmlPesanan[0]);
					System.out.println();
					
					System.out.println(kelas[1]);
					System.out.println("-------");
					System.out.println("kursi yang terisi = " + jmlPesanan[1]);
					System.out.println();
					
					System.out.println(kelas[2]);
					System.out.println("-------");
					System.out.println("kursi yang terisi = " + jmlPesanan[2]);
					System.out.println();
					
					System.out.println(kelas[3]);
					System.out.println("-------");
					System.out.println("kursi yang terisi = " + jmlPesanan[3]);
					System.out.println();					
					break;
				
					case 4:
					System.out.println();
					System.out.println("=======================");
					System.out.println("view semua daftar kursi");
					System.out.println("=======================");
					System.out.println();
					
					System.out.println(kelas[0]);
					System.out.println("-------");
					System.out.println("kursi yang terisi = " + jmlPesanan[0]);
					System.out.println("kursi yang kosong = " + (kursi[0]-jmlPesanan[0]));
					System.out.println();
					
					System.out.println(kelas[1]);
					System.out.println("-------");
					System.out.println("kursi yang terisi = " + jmlPesanan[1]);
					System.out.println("kursi yang kosong = " + (kursi[1]-jmlPesanan[1]));
					System.out.println();
					
					System.out.println(kelas[2]);
					System.out.println("-------");
					System.out.println("kursi yang terisi = " + jmlPesanan[2]);
					System.out.println("kursi yang kosong = " + (kursi[2]-jmlPesanan[2]));
					System.out.println();
					
					System.out.println(kelas[3]);
					System.out.println("-------");
					System.out.println("kursi yang terisi = " + jmlPesanan[3]);
					System.out.println("kursi yang kosong = " + (kursi[3]-jmlPesanan[3]));
					System.out.println();
					break;
					
					case 5:
					System.out.println();
					System.out.println("==========");
					System.out.println("view omset");
					System.out.println("==========");
					System.out.println();
					System.out.println("kursi yang terjual pada kelas ekonomi 	:" + jmlPesanan[0] + " ==> dengan total omset :Rp." + total[0] );
					System.out.println("kursi yang terjual pada kelas bisnis 	:" + jmlPesanan[1] + " ==> dengan total omset :Rp." + total[1] );
					System.out.println("kursi yang terjual pada kelas eksekutif :" + jmlPesanan[2] + " ==> dengan total omset :Rp." + total[2] );
					System.out.println("kursi yang terjual pada kelas vip 	:" + jmlPesanan[3] + " ==> dengan total omset :Rp." + total[3] );
					System.out.println("--------------------------------------------");
					totalOmset = total[0]+total[1]+total[2]+total[3];
					System.out.println("total omset seluruh kelas :Rp." + totalOmset );
					break;
				default: break;
			}			
		}
		while(pil<5);
	}
}