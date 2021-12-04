
import java.util.Scanner;
import Decorator.MainDec;
import observer.MainObs;

public class FinancialPlanning {
    public static void main(String[] args) {

        String ulangi = "y";
        try (Scanner input = new Scanner(System.in)) {
            while (ulangi.equals("y")) {
               
                System.out.println("");
                System.out.println("= Financial Plannnig Id =");
                System.out.println("");

                System.out.println("pilihan menu :");
                System.out.println("1. Informasi Kurs Harian");//dec
                System.out.println("2. Pilihan Tabungan"); //observer pattern
                System.out.println("3. Keluar Aplikasi");
                System.out.println("");
                
                System.out.print("pilih menu : ");
                int menu = input.nextInt();
                System.out.println("");

                switch (menu) {
                    case 1: {
                        MainObs c=new MainObs();
                        c.UpdateBank();
                        break;
                    }
                    case 2: {
                        MainDec e= new MainDec();
                        e.tabungan();
                        break;
                    }
                    case 3: {
                        System.exit(3);
                    }default:
                        System.out.println("Ulangi Pilihan");
                        break;
                }
                System.out.println("");
                System.out.print("Kembali ke Home (y/n)? ");
                ulangi = input.next();
            }
            
        }
    }
}
