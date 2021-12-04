package Decorator;
public class Asuransi extends Pilihan{

    public Asuransi(Tabungan newAsuransi) {
        super(newAsuransi);

        System.out.println("+ Bonus Jenis tabungan");

    }

    public String getDescription() {
        return tempTabungan.getDescription() + ", Asuransi Jiwa";
    }

    public double getCost() {
        return tempTabungan.getCost()  + 300000;
    }
}
