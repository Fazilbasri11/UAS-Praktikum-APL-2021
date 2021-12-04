package Adapter;
public class ImplementKurs implements KursAdp {
	private Kurs range;

	public ImplementKurs(Kurs range) {
		this.range = range;
	}

	@Override
	public int getPerbandingan() {
		int perbedaan = range.getPerbandingan();
		return convertJarak(perbedaan);
	}

	private int convertJarak(int perbedaan) {
		return perbedaan * 1;
	}
}