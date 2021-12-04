package observer;
import Kurs.MainKurs;
import java.time.LocalDate;
import java.util.Scanner;

public class MainObs{
    public void UpdateBank(){

        Scanner inputan = new Scanner(System.in);
    
        Update1 one = new Update1();
        Update2 two = new Update2();
        Update3 three = new Update3();
        Update4 four = new Update4();
        Update5 five = new Update5();
        Update6 six = new Update6();

        ConcrateBank publisher = new ConcrateBank(); 

        System.out.println("== Informasi Kurs Harian Rupiah ==");
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println("Tanggal : "+myObj); // Display the current date
        System.out.println("");

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
        System.out.println("Lihat Kode Kurs (y/n)?");
        String kode=inputan.nextLine();
        if (kode.equals("y")){
            MainKurs k= new MainKurs();
            k.Kurskode();
        }
    }
}
