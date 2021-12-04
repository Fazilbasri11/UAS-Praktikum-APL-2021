package Decorator;
public class Pilihan implements Tabungan{
    
    protected Tabungan tempTabungan;

    public Pilihan(Tabungan newTabungan) {
        this.tempTabungan = newTabungan;
    }

    public String getDescription() {
        return tempTabungan.getDescription();
    }

    public double getCost() {
        return tempTabungan.getCost();
    }
}
