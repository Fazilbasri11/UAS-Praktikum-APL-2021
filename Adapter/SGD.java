package Adapter;

//class yang digunakan untuk nilai mata uang 
// 10rb = 1 SGD
public class SGD implements Kurs {
	
	@Override
	public int getPerbandingan() {
		return 10575;
	}
}
