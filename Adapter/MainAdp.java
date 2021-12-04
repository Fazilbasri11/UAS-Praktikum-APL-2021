package Adapter;
import java.util.Scanner;

public class MainAdp {

	public void Nilai() {

		int angka;
		Scanner in = new Scanner(System.in);
		System.out.print("\nMasukkan Nilai (Ke-rupiah) : ");
		angka = in.nextInt();
		System.out.println("");
		
        Kurs jpy = new JPY();
		KursAdp jpyAdapter = new ImplementKurs(jpy);
		System.out.println(+ angka + " JPY = " + angka * + jpyAdapter.getPerbandingan() + " Rupiah");

		Kurs usd = new USD();
		KursAdp usdAdapter = new ImplementKurs(usd);
		System.out.println(+ angka + " USD = " + angka *  + usdAdapter.getPerbandingan() + " Rupiah");
		
		Kurs sgd = new SGD();
		KursAdp sgdAdapter = new ImplementKurs(sgd);
		System.out.println(+ angka + " SGD = " + angka * + sgdAdapter.getPerbandingan() + " Rupiah\n");

	}
}