package Decorator;
public class MainDec {
    
    public void tabungan() {
        System.out.println("Tiket Premium");
        
        Tabungan biasa = new Asuransi(new CC(new TabunganBiasa()));

        System.out.println("Paket: " + biasa.getDescription());

        System.out.println("Harga: " + biasa.getCost());

        System.out.println("\n===============================================\n");

        System.out.println("Tiket Reguler");
        
        Tabungan biasa2 = new CC(new TabunganBiasa());

        System.out.println("Paket: " + biasa2.getDescription());

        System.out.println("Harga: " + biasa2.getCost());
    }
}
