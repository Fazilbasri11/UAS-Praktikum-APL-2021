import java.util.Scanner;
import Decorator.MainDec;
import observer.MainObs;
import Adapter.MainAdp;

//Main utama program
public class FinancialPlanning {
    public static void main(String[] args) {

        String ulangi = "y";
        //inputan menu
        try (Scanner input = new Scanner(System.in)) { 
            while (ulangi.equals("y")) {
               
                //judul
                System.out.println("");
                System.out.println("= Financial Plannnig Id ="); 
                System.out.println("");

                System.out.println("pilihan menu :");
                System.out.println("1. Informasi Kurs Harian");//observer pattern
                System.out.println("2. Paket Bonus Tabungan"); //decorator pattern
                System.out.println("3. Konversi Kurs (Ke-Rupiah)");//adapter pattern
                System.out.println("4. Keluar Aplikasi");
                System.out.println("");
                
                //memasukkan pilihan menu
                System.out.print("pilih menu : ");
                int menu = input.nextInt(); 
                System.out.println("");

                switch (menu) {
                    case 1: {
                        //menu informasi kurs/observer pattern
                        MainObs c=new MainObs(); 
                        c.UpdateBank();
                        break;
                    }
                    case 2: {
                        //menu paket bonus/ decorator pattern
                        MainDec e= new MainDec(); 
                        e.tabungan();
                        break;
                    }
                    case 3: {
                        //menu konversi kurs / adapter pattern
                        MainAdp a = new MainAdp(); 
                        a.Nilai();
                    }default:
                        break;
                }
                //input ke home/tidak
                System.out.println("");
                System.out.print("Kembali ke Home (y/n)? ");
                ulangi = input.next(); 
            }
            
        }
    }
}
