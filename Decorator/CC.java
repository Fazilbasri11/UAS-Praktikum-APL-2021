package Decorator;
public class CC extends Pilihan{

    public CC(Tabungan newTabungan) {
        super(newTabungan);

        System.out.println("+ bunga");
    }

    public String getDescription() {
        return tempTabungan.getDescription() + ", Kartis credit / online cc";
    }  

    public double getCost() {
        return tempTabungan.getCost()  + 500000;
    }
}
