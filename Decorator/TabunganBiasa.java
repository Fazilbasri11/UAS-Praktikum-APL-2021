package Decorator;
public class TabunganBiasa implements Tabungan{
    
    @Override
    public String getDescription() {
        return "Kartu ATM";
    }

    @Override
    public double getCost() {
        return 100000;
    }
}
