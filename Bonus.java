public class BonusA{
	public static void main (String []args){
	int jmlBarang =40;
	int bonus = jmlBarang/2;
	int jmlBarangPlusBonus = jmlBarang + bonus;
	int hargaPer1 =25000;
	int jmlHarga = jmlBarang * hargaPer1;
	
	System.out.println("====================");
	System.out.println("BONUS BELI 2 DAPAT 1");
	System.out.println("====================");
	System.out.println("");
	System.out.println("harga per 1 barang        =Rp" + hargaPer1);
	System.out.println("jumlah barang yang dibeli =" + jmlBarang);
	System.out.println("mendapatkan bonus         =" + bonus);
	System.out.println("jumlah barang plus bonus  =" + jmlBarangPlusBonus);
	System.out.println("jumlah harga barang       =Rp" + jmlHarga);
	}
}