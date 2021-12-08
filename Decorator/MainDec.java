package Decorator;

//Class main dari pilihan menu decorator pattern 
public class MainDec {
    //Main decotaror pattern bonus bank
    public void tabungan() {
        System.out.println("Bonus Premium");
        //general tipe + prmium bonus dan reguler bonus
        Tabungan biasa = new Asuransi(new CC(new TabunganBiasa())); 
        //mengambil deskripsi dari  tipe pilihan
        System.out.println("Paket: " + biasa.getDescription()); 
        //biaya bulanan
        System.out.println("Biaya: " + biasa.getCost() + "/Bulan"); 

        System.out.println("\n===============================================\n");

        System.out.println("Bonus Reguler");
        //general tipe + reguler bonus
        Tabungan biasa2 = new CC(new TabunganBiasa()); 
        //mengambil deskripsi dari  tipe pilihan
        System.out.println("Paket: " + biasa2.getDescription()); 
        //biaya bulanan
        System.out.println("Harga: " + biasa2.getCost()+"/Bulan"); 
    }
}
