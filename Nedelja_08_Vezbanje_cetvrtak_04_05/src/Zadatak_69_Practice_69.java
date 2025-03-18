import java.util.Scanner;

public class Zadatak_69_Practice_69 {
    public static void main(String[] args) {
        /**
         City	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
         London	    5%	        7%	            8%	                12%
         Paris	    4.5%	    7.5%	        10%	                13%
         Rome	    5.5%	    8%	            12%	                14.5%
         **/

        /**
         * Unosi se grad kao String i kolicina prodaja kao decimalan broj
         * i na osnovu tih informacija i informacija iz tabele treba da vidimo koliki je ukupan
         * commision za agenta
         *
         */
        Scanner scanner = new Scanner(System.in); // posto unosimo iz konzole

        String nazivGrada = scanner.nextLine();

        double brojProdaja = Double.parseDouble(scanner.nextLine());

        double procenatZarade = -1; /// promenljiva koja nam cuva rezultat
        /**
         City	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
         London	    5%	        7%	            8%	                12%
         Paris	    4.5%	    7.5%	        10%	                13%
         Rome	    5.5%	    8%	            12%	                14.5%
         **/
        /// dodatne ideje:
        /// if( nazivGrada.equals("London") && (brojProdaja >= 0 && brojProdaja <= 500)) => 5%
        ///  else if( nazivGrada.equals("London") && (brojProdaja > 500 && brojProdaja <= 1000)) => 7%
        /// itd...

        switch (nazivGrada) {
            case "London":
                if (brojProdaja >= 0 && brojProdaja <= 500) { /// opseg -> logicko AND istovremeno
                    /// veci od donje granice i manji od gornje
                    procenatZarade = 5;
                } else if (brojProdaja > 500 && brojProdaja <= 1000) {
                    procenatZarade = 7;
                } else if (brojProdaja > 1000 && brojProdaja <= 10000) {
                    procenatZarade = 8;
                } else if (brojProdaja > 10000) {
                    procenatZarade = 12;
                } else {
                    System.out.println("error");
                    return;
                }
                break;
            case "Paris":
                if (brojProdaja >= 0 && brojProdaja <= 500) { /// opseg -> logicko AND istovremeno
                    /// veci od donje granice i manji od gornje
                    procenatZarade = 4.5;
                } else if (brojProdaja > 500 && brojProdaja <= 1000) {
                    procenatZarade = 7.5;
                } else if (brojProdaja > 1000 && brojProdaja <= 10000) {
                    procenatZarade = 10;
                } else if (brojProdaja > 10000) {
                    procenatZarade = 13;
                } else {
                    System.out.println("error");
                    return;
                }
                break;
            case "Rome":
                if (brojProdaja >= 0 && brojProdaja <= 500) { /// opseg -> logicko AND istovremeno
                    /// veci od donje granice i manji od gornje
                    procenatZarade = 5.5;
                } else if (brojProdaja > 500 && brojProdaja <= 1000) {
                    procenatZarade = 8;
                } else if (brojProdaja > 1000 && brojProdaja <= 10000) {
                    procenatZarade = 12;
                } else if (brojProdaja > 10000) {
                    procenatZarade = 14.5;
                } else {
                    System.out.println("error"); /// prekidamo i ako je broj negativan
                    return;
                }
                break;

            default:
                System.out.println("error");
                return; /// ako je los grad prekidamo zadatak
        }

        /// System.out.println("Procenat provizije:" + procenatZarade);
        /// ako nemamo return procenatZarade u slucaju da je neispravan unos
        /// ,ce ostati na pocetnoj vrednost =>
//        if( procenatZarade > 0) {
//            double zarada = brojProdaja * procenatZarade / 100;
//            /// 5% => * 5.0 / 100
//            /// 10% => * 10.0 / 100
//            /// x % => * x / 100
//            System.out.printf("%.2f", zarada);
//        }

        double zarada = brojProdaja * procenatZarade / 100;
        /// 5% => * 5.0 / 100
        /// 10% => * 10.0 / 100
        /// x % => * x / 100
        System.out.printf("%.2f", zarada);
    }
}
