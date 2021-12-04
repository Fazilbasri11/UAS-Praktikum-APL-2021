package Decorator;
public class CC extends Pilihan{

    public CC(Tabungan newTabungan) {
        super(newTabungan);

        System.out.println("+ Bonus -2% biaya admin");
    }

    public String getDescription() {
        return tempTabungan.getDescription() + ", CC / online cc";
    }  

    public double getCost() {
        return tempTabungan.getCost()  + 500000;
    }
}
