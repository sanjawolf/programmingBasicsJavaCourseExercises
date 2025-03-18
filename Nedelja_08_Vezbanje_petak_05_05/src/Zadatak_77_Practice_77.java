import java.util.Scanner;

public class Zadatak_77_Practice_77 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // posto unosimo iz konzole

        double kusurTrenutni = Double.parseDouble(scanner.nextLine()) * 1000;
        /// mnozimo sa 1000 da bismo resili problem loseg predstavljanja double brojeva
        /// na 2 ili vise decimala ( pogledati Zadatak_07_decimalni_brojevi_greska_pri_formatiranju )
        int brojacNovcica = 0; /// posto brojimo koliko novcica zelimo

        while (true) {

            if (kusurTrenutni >= 2* 1000){ /// proverimo da li mozemo da vratimo 2$ ( tj * 1000 = 2000 )
                kusurTrenutni = kusurTrenutni - 2* 1000; /// smanjimo iznos za taj broj
//                System.out.println("coin 2000$");
            } else if (kusurTrenutni >= 1* 1000) { /// ako ne moze 2, pitamo 1
                kusurTrenutni = kusurTrenutni - 1* 1000;
//                System.out.println("coin 1000$");
            } else if (kusurTrenutni >= 0.5* 1000) { /// itd
                kusurTrenutni = kusurTrenutni - 0.5* 1000;
//                System.out.println("coin 500$");
            } else if (kusurTrenutni >= 0.2* 1000) {
                kusurTrenutni = kusurTrenutni - 0.2* 1000;
//                System.out.println("coin 200$");
            } else if (kusurTrenutni >= 0.1* 1000) {
                kusurTrenutni = kusurTrenutni - 0.1* 1000;
//                System.out.println("coin 100$");
            } else if (kusurTrenutni >= 0.05* 1000) {
                kusurTrenutni = kusurTrenutni - 0.05* 1000;
//                System.out.println("coin 50$");
            } else if (kusurTrenutni >= 0.02* 1000) {
                kusurTrenutni = kusurTrenutni - 0.02* 1000;
//                System.out.println("coin 20$");
            } else if (kusurTrenutni >= 0.01* 1000) {
                kusurTrenutni = kusurTrenutni - 0.01* 1000;
//                System.out.println("coin 10$");
            }
            brojacNovcica++;

            if (kusurTrenutni == 0) {
                break;
            }
        }
        System.out.println(brojacNovcica);
    }
}
