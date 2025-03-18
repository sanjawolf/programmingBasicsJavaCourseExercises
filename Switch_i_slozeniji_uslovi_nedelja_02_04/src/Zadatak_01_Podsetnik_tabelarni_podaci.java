import java.util.Scanner;

public class Zadatak_01_Podsetnik_tabelarni_podaci {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String vrstaSobe=sc.nextLine();

        String godisnjeDoba=sc.nextLine();

        if(vrstaSobe.equals("jednokrevetna")) {

            switch (godisnjeDoba) {

                case "Zima":
                    System.out.println("10");
                    break;

                case "Prolece":
                    System.out.println("20");
                    break;

                case "Leto":
                    System.out.println("15");
                    break;

                case "Jesen":
                    System.out.println("20");
                    break;

                default:
                    System.out.println("Pogresan unos.");
            }

        }

        else if (vrstaSobe.equals("dvokrevetna")){

            switch (godisnjeDoba){

                case "Zima":
                    System.out.println("20");
                    break;

                case "Prolece":
                    System.out.println("30");
                    break;

                case "Leto":
                    System.out.println("25");
                    break;

                case "Jesen":
                    System.out.println("35");
                    break;

                default:
                    System.out.println("Pogresan unos.");
            }

            }

        else{

            switch (godisnjeDoba){

                case "Zima":
                    System.out.println("10");
                    break;

                case "Prolece":
                    System.out.println("40");
                    break;

                case "Leto":
                    System.out.println("55");
                    break;

                case "Jesen":
                    System.out.println("44");
                    break;

                default:
                    System.out.println("Pogresan unos.");
            }

        }
    }
}
