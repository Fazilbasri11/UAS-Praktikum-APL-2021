package Adapter;
import java.util.Scanner;

//class untuk main pada adaoter pattern
//berfungsi untuk menjalankan menu 3
public class MainAdp {

	public void Nilai() {

		int angka;
		//nilai yang di input akan dikonversikan ke dalam rupiah
		Scanner in = new Scanner(System.in);
		System.out.print("\nMasukkan Nilai (Ke-rupiah) : ");
		angka = in.nextInt();
		System.out.println("");
		
		//untuk konversi kurs hanya menggunakan 3 mata uang asing
		//perbandingan atau perubahan kurs JPY ke rupiah
        Kurs jpy = new JPY();
		KursAdp jpyAdapter = new ImplementKurs(jpy);
		System.out.println(+ angka + " JPY = " + angka * + jpyAdapter.getPerbandingan() + " Rupiah");

		//perbandingan atau perubahan kurs USD ke rupiah
		Kurs usd = new USD();
		KursAdp usdAdapter = new ImplementKurs(usd);
		System.out.println(+ angka + " USD = " + angka *  + usdAdapter.getPerbandingan() + " Rupiah");
		
		//perbandingan atau perubahan kurs SGD ke rupiah
		Kurs sgd = new SGD();
		KursAdp sgdAdapter = new ImplementKurs(sgd);
		System.out.println(+ angka + " SGD = " + angka * + sgdAdapter.getPerbandingan() + " Rupiah\n");

	}
}