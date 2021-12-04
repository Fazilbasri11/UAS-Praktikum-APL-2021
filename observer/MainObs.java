package observer;
import Adapter.MainAdp;
import java.time.LocalDate;

//main observer
public class MainObs{
    public void UpdateBank(){

        //daftar update
        Update1 one = new Update1();
        Update2 two = new Update2();
        Update3 three = new Update3();
        Update4 four = new Update4();
        Update5 five = new Update5();
        Update6 six = new Update6();

        ConcrateBank publisher = new ConcrateBank(); 

        System.out.println("== Informasi Kurs Harian Rupiah ==");
        LocalDate tgl = LocalDate.now(); // tanggal
        System.out.println("Tanggal : "+tgl); // display tanggal hari ini
        System.out.println("");

        //memasukkan notif
        publisher.attach(one);
        publisher.attach(two);
        publisher.attach(three);
        publisher.attach(four);
        publisher.attach(five);
        publisher.attach(six);
        publisher.notifyUpdate(new Informasi("Rupiah"));
        System.out.println("");
        System.out.println("========================");
        System.out.println("");
    }
}
