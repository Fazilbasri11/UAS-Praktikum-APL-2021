package Adapter;

//class yang digunakan untuk nilai mata uang 
// 14rb = 1 USD
public class USD implements Kurs {
	
	@Override
	public int getPerbandingan() {
		return 14775;
	}
}