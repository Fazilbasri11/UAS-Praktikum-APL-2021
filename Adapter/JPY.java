package Adapter;

//class yang digunakan untuk nilai mata uang 
// 12rb = 1 JPY
public class JPY implements Kurs {
	@Override
	public int getPerbandingan() {
		return 12768; 
	}
}